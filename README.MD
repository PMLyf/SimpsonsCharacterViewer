<h1 style="color:#6600cc;">A Sample Android Application</h1>

<p>Built by <strong>David Irving</strong></p>

<p>The Simpson Character Viewer is an Android application designed to showcase a list of items and their details.</p>

<h3>Key Features</h3>
<ul>
  <li>MUI Taskbar: Provides easy navigation options.</li>
  <li>Fragments: Two fragments to display the list and details.</li>
  <li>RecyclerView and Cards: Display data in a visually appealing way using RecyclerView and cards.</li>
  <li>Dedicated Layout for Details: Separate layout to present item details.</li>
  <li>REST API Integration: Connects to a REST API to fetch data.</li>
  <li>Data Formatting: Format data from the REST API using a model.</li>
  <li>ViewModel: Handle data from the REST API.</li>
  <li>LiveData and DataBinding: Display data and its updates using LiveData and DataBinding.</li>
</ul>

<p>The Simpson Character Viewer provides a user-friendly and visually appealing experience, allowing users to explore a comprehensive list of items and view their details.</p>


### Technologies Used
- Kotlin
- MVVM
- LiveData
- DataBinding
- Retrofit
- MUI
- RecyclerView
- CardView
- Fragments
- Navigation
- REST API
- JSON
- Glide


## Build Instructions

Before getting started, ensure that you have the following:

- Android Studio
- Firebase Account


<h2>Instruction Set</h2>

<ul>
  <li><input type="checkbox" disabled checked> Connect to Firebase
    <ul>
      <li><input type="checkbox" disabled> Create Firebase project</li>
      <li><input type="checkbox" disabled> Add app to Firebase project</li>
      <li>
        That's it! Now you have added the SHA-1 fingerprint to your Firebase project.
        <h3>Create a Run/Debug Configuration to Generate a Signing Report</h3>
        <ol>
          <li>Open your Android Studio project.</li>
          <li>In the project window, right-click on the <strong>app</strong> module and select <strong>Run/Debug Configurations</strong>.</li>
          <li>In the <strong>Run/Debug Configurations</strong> dialog, click on the <strong>+</strong> button and select <strong>Gradle</strong>.</li>
          <li>In the <strong>Gradle</strong> dialog, enter a name for the configuration and select the <strong>app</strong> module from the <strong>Module</strong> dropdown menu.</li>
          <li>In the <strong>Tasks</strong> tab, add the following tasks to the <strong>Tasks</strong> field:
            <br><code>signingReport</code></li>
          <li>Click on the <strong>OK</strong> button to create the configuration.</li>
        </ol>
        Once you have created the configuration, you can run it by clicking on the Run button in the toolbar. The signing report will be generated and displayed in the Output window.
        <br><br>
        Here are some additional things to keep in mind:
        <ul>
          <li>The <code>signingReport</code> task tells the Android Gradle plugin to generate a signing report.</li>
          <li>The signing report will be generated in the <code>build/outputs/signingReport</code> directory.</li>
          <li>You can also generate a signing report from the Android Studio IDE. To do this, open the <strong>Build</strong> menu and select <strong>Generate Signing Report</strong>.</li>
        </ul>
      </li>
      <li><input type="checkbox" disabled> Download <code>google-services.json</code> file</li>
    </ul>
  </li>
  <li><input type="checkbox" disabled> Set up project in GitHub
    <ul>
      <li><input type="checkbox" disabled> Create new repository</li>
      <li><input type="checkbox" disabled> Clone repository to local machine</li>
    </ul>
  </li>
  <li><input type="checkbox" disabled> Create Android Application
    <ul>
      <li><input type="checkbox" disabled> Open Android Studio</li>
      <li><input type="checkbox" disabled> Clone repository to local machine</li>
    </ul>
  </li>
  <li><input type="checkbox" disabled> Configure and Initialize Dependencies
    <ul>
      <li><input type="checkbox" disabled> Copy list of dependencies and update as needed.</li>
      <li><input type="checkbox" disabled> Navigation - Get started with the Navigation component | Android Developers</li>
      <li><input type="checkbox" disabled> AppBar - Working with the AppBar | Android Developers</li>
      <li><input type="checkbox" disabled> Room - Room | Jetpack | Android Developers</li>
      <li><input type="checkbox" disabled> Gradle Sync</li>
    </ul>
  </li>
  <li><input type="checkbox" disabled> Initialize Firebase
    <ul>
      <li><input type="checkbox" disabled> Configure Firebase in Application class</li>
      <li><input type="checkbox" disabled> Initialize Firebase components (e.g., Firestore, Auth, Storage)</li>
    </ul>
  </li>
  <li><input type="checkbox" disabled> Create Views #UI
    <ul>
      <li><input type="checkbox" disabled> Design app layout</li>
      <li><input type="checkbox" disabled> Implement activities and/or fragments</li>
      <li><input type="checkbox" disabled> Implement custom views if necessary</li>
      <li><input type="checkbox" disabled> Handle screen orientation changes</li>
    </ul>
  </li>
  <li><input type="checkbox" disabled> Create ViewModels #ViewModel
    <ul>
      <li><input type="checkbox" disabled> Implement ViewModel for each view</li>
      <li><input type="checkbox" disabled> Implement ViewModelFactory if necessary</li>
      <li><input type="checkbox" disabled> Implement LiveData or StateFlow for data binding</li>
    </ul>
  </li>
  <li><input type="checkbox" disabled> Create Data Models #DataModel
    <ul>
      <li><input type="checkbox" disabled> Define entity classes</li>
      <li><input type="checkbox" disabled> Define DTOs for network or database communication</li>
    </ul>
  </li>
  <li><input type="checkbox" disabled> Implement Service Workers (e.g., for background tasks or notifications) #ServiceWorker
    <ul>
      <li><input type="checkbox" disabled> Define Worker classes</li>
      <li><input type="checkbox" disabled> Implement WorkerManager for scheduling tasks</li>
    </ul>
  </li>
  <li><input type="checkbox" disabled> Implement Flows or LiveData #LiveData
    <ul>
      <li><input type="checkbox" disabled> Implement Flow or LiveData for each data stream</li>
      <li><input type="checkbox" disabled> Implement data transformation or filtering if necessary</li>
    </ul>
  </li>
  <li><input type="checkbox" disabled> Set up local database (Room) or use Firebase caching #LocalDB
    <ul>
      <li><input type="checkbox" disabled> Define Room entities</li>
      <li><input type="checkbox" disabled> Implement Room DAOs</li>
      <li><input type="checkbox" disabled> Implement Room database</li>
      <li><input type="checkbox" disabled> Configure Firebase caching (if using Firestore)</li>
    </ul>
  </li>
  <li><input type="checkbox" disabled> Implement REST API in Firebase Functions #API
    <ul>
      <li><input type="checkbox" disabled> Define API endpoints</li>
      <li><input type="checkbox" disabled> Implement API functions in Firebase</li>
      <li><input type="checkbox" disabled> Deploy API functions</li>
      <li><input type="checkbox" disabled> Test API endpoints</li>
    </ul>
  </li>
  <li><input type="checkbox" disabled> Connect app to REST API or Firestore #APIConnection
    <ul>
      <li><input type="checkbox" disabled> Implement API or Firestore client</li>
      <li><input type="checkbox" disabled> Set up data fetching and submission in ViewModel</li>
      <li><input type="checkbox" disabled> Handle API errors and exceptions</li>
      <li><input type="checkbox" disabled> Test app with live data</li>
    </ul>
  </li>
</ul>


<h2>Dependencies</h2>

<p>The following dependencies are used in this project:</p>

<ul>
  <li><a href="https://kotlinlang.org/">Kotlin</a></li>
  <li><a href="https://square.github.io/retrofit/">Retrofit</a></li>
  <li><a href="https://mui.com/">MUI</a></li>
  <li><a href="https://bumptech.github.io/glide/">Glide</a></li>
  <li><a href="https://developer.android.com/guide/topics/ui/layout/recyclerview">RecyclerView</a></li>
  <li><a href="https://developer.android.com/guide/topics/ui/layout/cardview">CardView</a></li>
  <li><a href="https://developer.android.com/guide/navigation">Navigation</a></li>
  <li><a href="https://developer.android.com/topic/libraries/architecture/livedata">LiveData</a></li>
  <li><a href="https://developer.android.com/topic/libraries/data-binding">DataBinding</a></li>
</ul>

<p>Feel free to explore the project and learn from its implementation.</p>


</div>

<h2>Dependencies</h2>

<table>
  <tr>
    <th>Library</th>
    <th>Version</th>
  </tr>
  <tr>
    <td>androidx.appcompat:appcompat</td>
    <td>1.6.1</td>
  </tr>
  <tr>
    <td>com.google.firebase:firebase-auth-ktx</td>
    <td>---</td>
  </tr>
  <tr>
    <td>com.firebaseui:firebase-ui-auth</td>
    <td>8.0.2</td>
  </tr>
  <tr>
    <td>com.google.firebase:firebase-analytics-ktx</td>
    <td>---</td>
  </tr>
  <tr>
    <td>com.google.firebase:firebase-messaging-ktx</td>
    <td>---</td>
  </tr>
  <tr>
    <td>com.google.firebase:firebase-appcheck-playintegrity</td>
    <td>---</td>
  </tr>
  <tr>
    <td>com.google.firebase:firebase-firestore-ktx</td>
    <td>---</td>
  </tr>
  <tr>
    <td>com.google.firebase:firebase-inappmessaging-display-ktx</td>
    <td>---</td>
  </tr>
  <tr>
    <td>com.google.firebase:firebase-crashlytics-ktx</td>
    <td>---</td>
  </tr>
  <tr>
    <td>androidx.navigation:navigation-fragment-ktx</td>
    <td>2.6.0</td>
  </tr>
  <tr>
    <td>androidx.navigation:navigation-ui-ktx</td>
    <td>2.6.0</td>
  </tr>
  <tr>
    <td>androidx.navigation:navigation-testing</td>
    <td>2.6.0</td>
  </tr>
  <tr>
    <td>androidx.core:core-ktx</td>
    <td>1.10.1</td>
  </tr>
  <tr>
    <td>androidx.preference:preference-ktx</td>
    <td>1.2.0</td>
  </tr>
  <tr>
    <td>androidx.lifecycle:lifecycle-livedata-ktx</td>
    <td>2.6.1</td>
  </tr>
  <tr>
    <td>com.google.android.gms:play-services-auth</td>
    <td>20.5.0</td>
  </tr>
  <tr>
    <td>com.facebook.android:facebook-android-sdk</td>
    <td>15.2.0</td>
  </tr>
  <tr>
    <td>androidx.cardview:cardview</td>
    <td>1.0.0</td>
  </tr>
  <tr>
    <td>androidx.lifecycle:lifecycle-extensions</td>
    <td>2.2.0</td>
  </tr>
  <tr>
    <td>com.google.android.material:material</td>
    <td>1.9.0</td>
  </tr>
  <tr>
    <td>androidx.constraintlayout:constraintlayout</td>
    <td>2.1.4</td>
  </tr>
  <tr>
    <td>androidx.arch.core:core-testing</td>
    <td>2.2.0</td>
  </tr>
  <tr>
    <td>junit:junit</td>
    <td>4.13.2</td>
  </tr>
  <tr>
    <td>androidx.test.ext:junit</td>
    <td>1.1.5</td>
  </tr>
  <tr>
    <td>androidx.test.espresso:espresso-core</td>
    <td>3.5.1</td>
  </tr>
  <tr>
    <td>androidx.legacy:legacy-support-v4</td>
    <td>1.0.0</td>
  </tr>
  <tr>
    <td>org.mockito:mockito-core</td>
    <td>5.1.1</td>
  </tr>
  <tr>
    <td>androidx.fragment:fragment-testing</td>
    <td>1.6.0</td>
  </tr>
  <tr>
    <td>androidx.multidex:multidex</td>
    <td>2.0.1</td>
  </tr>
  <tr>
    <td>com.android.support:multidex</td>
    <td>1.0.3</td>
  </tr>
  <tr>
    <td>org.jetbrains.kotlinx:kotlinx-coroutines-core</td>
    <td>1.6.4</td>
  </tr>
  <tr>
    <td>org.jetbrains.kotlinx:kotlinx-coroutines-android</td>
    <td>1.6.4</td>
  </tr>
  <tr>
    <td>org.jetbrains.kotlinx:kotlinx-coroutines-play-services</td>
    <td>1.6.4</td>
  </tr>
  <tr>
    <td>com.google.android.material:material</td>
    <td>1.9.0</td>
  </tr>
  <tr>
    <td>com.squareup.retrofit2:retrofit</td>
    <td>2.9.0</td>
  </tr>
  <tr>
    <td>com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter</td>
    <td>0.9.2</td>
  </tr>
  <tr>
    <td>com.squareup.retrofit2:converter-moshi</td>
    <td>2.9.0</td>
  </tr>
  <tr>
    <td>com.squareup.moshi:moshi</td>
    <td>1.14.0</td>
  </tr>
  <tr>
    <td>com.squareup.moshi:moshi-kotlin</td>
    <td>1.14.0</td>
  </tr>
  <tr>
    <td>com.squareup.moshi:moshi-kotlin-codegen</td>
    <td>1.14.0</td>
  </tr>
  <tr>
    <td>joda-time:joda-time</td>
    <td>2.12.2</td>
  </tr>
  <tr>
    <td>androidx.datastore:datastore-preferences</td>
    <td>1.0.0</td>
  </tr>
  <tr>
    <td>androidx.lifecycle:lifecycle-livedata-ktx</td>
    <td>2.6.1</td>
  </tr>
  <tr>
    <td>androidx.work:work-runtime-ktx</td>
    <td>2.8.1</td>
  </tr>
  <tr>
    <td>com.github.bumptech.glide:glide</td>
    <td>4.14.2</td>
  </tr>
  <tr>
    <td>com.github.bumptech.glide:compiler</td>
    <td>4.14.2</td>
  </tr>
</table>
