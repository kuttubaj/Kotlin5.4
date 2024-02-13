package com.example.kotlin54.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlin54.data.model.ListItem
import com.example.kotlin54.databinding.BrawlStarsItemBinding

class BrawlStarsAdapter : RecyclerView.Adapter<BrawlStarsAdapter.BrawlStarsViewHolder>() {

    private var brawlStarsList = listOf<ListItem>()

    fun setListItem(_characterList: List<ListItem>) {
        this.brawlStarsList = _characterList
        notifyDataSetChanged()
    }

    inner class BrawlStarsViewHolder(private val binding: BrawlStarsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(brawlStarsItem: ListItem) = with(binding) {
            tvItem.text = brawlStarsItem.name
            Glide.with(ivItem).load(brawlStarsItem.imageUrl).load(ivItem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrawlStarsViewHolder {
        val binding =
            BrawlStarsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BrawlStarsViewHolder(binding)
    }

    override fun getItemCount() = brawlStarsList.size

    override fun onBindViewHolder(holder: BrawlStarsViewHolder, position: Int) {
        holder.onBind(brawlStarsList[position])
    }
}