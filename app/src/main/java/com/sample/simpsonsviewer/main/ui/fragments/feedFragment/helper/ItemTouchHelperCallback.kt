package com.sample.simpsonsviewer.main.ui.fragments.feedFragment.helper

import android.graphics.Canvas
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.sample.simpsonsviewer.main.ui.fragments.feedFragment.adapters.FeedListAdapter

// Item touch helper for the recycler view
class FeedItemTouchHelperCallback(private val adapter:FeedListAdapter): ItemTouchHelper.SimpleCallback(
    ItemTouchHelper.UP or ItemTouchHelper.DOWN,
    ItemTouchHelper.LEFT
) {
    companion object {
        const val ALPHA_FULL = 1.0f
        const val ALPHA_MAGNIFICATION = 1.2f
    }
    /**We have no reason to use onMove yet**/
    override fun onMove(recyclerView: RecyclerView, holder: RecyclerView.ViewHolder, target: RecyclerView.ViewHolder): Boolean {
        val from = holder.adapterPosition
        val to = target.adapterPosition
        //adapter.onMoveItem(from, to)
        return true
    }
    /**Should trigger the view model to remove an item from firebase**/
    override fun onSwiped(holder: RecyclerView.ViewHolder, direction: Int) {
        val from = holder.adapterPosition
        adapter.onRemoveItem(from)
    }

    override fun onChildDraw(c: Canvas, recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, dX: Float, dY: Float, actionState: Int, isCurrentlyActive: Boolean) {
        if (actionState == ItemTouchHelper.ACTION_STATE_SWIPE) {
            val alpha = ALPHA_FULL - (Math.abs(dX) / viewHolder.itemView.width.toFloat()) * ALPHA_MAGNIFICATION
            viewHolder.itemView.alpha = alpha
            viewHolder.itemView.translationX = dX
        } else {
            super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
        }
    }
}