package com.softdevandre.marvelapi.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.softdevandre.marvelapi.databinding.ItemCharacterBinding
import com.softdevandre.marvelapi.model.Characters

class ItemCharacterAdapter(private val context: Context, private val dataset: List<Characters>) :
    RecyclerView.Adapter<ItemCharacterAdapter.CharacterViewHolder>() {

    class CharacterViewHolder(private val binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val textView: TextView = binding.tvCharacterName
        val imageView: ImageView = binding.ivCharacter
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        // create new view
        val adapterLayout =
            ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharacterViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.name)
        holder.imageView.setImageResource(item.image)
    }

    override fun getItemCount() = dataset.size
}
