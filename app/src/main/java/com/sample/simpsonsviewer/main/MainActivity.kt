package com.sample.simpsonsviewer.main

import SharedViewModelFactory
import android.content.Context
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.WindowManager
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sample.simpsonsviewer.R
import com.sample.simpsonsviewer.main.ui.viewModels.SharedViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navView: BottomNavigationView
    private lateinit var navController: NavController
    private lateinit var toolbar: MaterialToolbar
    // used to tag logs
    companion object {
        private const val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Enable App Check Here
        // appCheck()
        setContentView(R.layout.activity_main)


        navView = findViewById(R.id.bottom_navigation_container)
        toolbar = findViewById(R.id.materialToolbar)
        // create variable for nav host fragment
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        // cast to nav host
        navController = navHostFragment.findNavController()
        // appBar Config
        appBarConfiguration = AppBarConfiguration(
            setOf(
               R.id.homeFragment, R.id.feedFragment, R.id.favoritesFragment
            )
        )
        // support action bar
        setSupportActionBar(toolbar)
        /**
         * this is a kotlin extension function
         * works for the tool bar and bottom action bar
         * there are other ways to do this but may introduce bugs/weird animations
         *         we can write tests for this
         * **/
        toolbar.setupWithNavController(navController)

        /**the tool bar should be connected to the navigation graph**/
        navView.setupWithNavController(navController)

    }

    // when the options menu is created, we need to inflate the menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.bottom_navigation_menu, menu)
        return true
    }
    // handle options menu
    // handles navigation for the bottom nav bar
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
    }

    /**
     * we have to override onSupportNavigate up so the up button in the tool bar works
     * the return should always be true
     * if not we should call the super implementation of this method
     * */
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_graph)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }


    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        // Update the nav graph based on the current device orientation.
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            // Use the single-screen layout.
            navController.setGraph(R.navigation.nav_graph)
        } else {
            // Use the two-pane layout.
            navController.setGraph(R.navigation.nav_graph_l)
        }

    }

    // uncomment this to enable app check during production
    // private fun appCheck(){}
}

