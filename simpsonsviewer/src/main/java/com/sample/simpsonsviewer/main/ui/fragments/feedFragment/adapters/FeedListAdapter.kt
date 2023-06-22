package com.sample.simpsonsviewer.main.ui.fragments.feedFragment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.sample.simpsonsviewer.R
import com.sample.simpsonsviewer.databinding.CardViewFeedItemBinding
import com.sample.simpsonsviewer.domain.models.Character
import com.sample.simpsonsviewer.main.ui.fragments.feedFragment.FeedItemClick
import com.sample.simpsonsviewer.main.ui.fragments.feedFragment.viewModel.FeedViewModel

// adapter for the recycler view
class FeedListAdapter(private val callback: FeedItemClick, private val viewModel:FeedViewModel): RecyclerView.Adapter<FeedListAdapter.PostManagementViewHolder>(){

// use this for testing only, the data should come from the view model.
    /*
    var charList:List<Char> = ArrayList()
        set(value){
            field = value

            notifyDataSetChanged()
        }

     */
    // get reference to the list of characters from the view model as a list of Char
    var charList:List<Character> = viewModel.getCharacterList()
        set(value){
            field = value

            notifyDataSetChanged()
        }
    /**
     * Called when RecyclerView needs a new {@link ViewHolder} of the given type to represent
     * an item.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedListAdapter.PostManagementViewHolder {
        val withDataBinding: CardViewFeedItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            FeedListAdapter.PostManagementViewHolder.LAYOUT,
            parent,
            false
        )
        return FeedListAdapter.PostManagementViewHolder(withDataBinding)
    }

    override fun getItemCount():Int = charList.size
    /**
     * Called by RecyclerView to display the data at the specified position. This method should
     * update the contents of the {@link ViewHolder#itemView} to reflect the item at the given
     * position.
     */
    override fun onBindViewHolder(holder: FeedListAdapter.PostManagementViewHolder, position: Int) {
        holder.viewDataBinding.also {
            it.character = charList[position]
            it.feedCallback = callback

        }

    }
    fun onRemoveItem(position: Int){viewModel.onRemovePost(position)}

    /**
     * ViewHolder for Profile items. All work is done by data binding.
     */
    class PostManagementViewHolder(val viewDataBinding: CardViewFeedItemBinding):
        RecyclerView.ViewHolder(viewDataBinding.root){

        companion object{
            @LayoutRes
            val LAYOUT = R.layout.card_view_feed_item
        }

    }

    fun removeItem(){}


}
