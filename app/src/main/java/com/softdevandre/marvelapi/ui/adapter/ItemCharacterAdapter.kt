package com.softdevandre.marvelapi.ui.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.softdevandre.marvelapi.databinding.ItemCharacterBinding
import com.softdevandre.marvelapi.model.Characters
import com.softdevandre.marvelapi.ui.DetailCharacterActivity

class ItemCharacterAdapter(private val context: Context, private val dataset: List<Characters>) :
    RecyclerView.Adapter<ItemCharacterAdapter.CharacterViewHolder>() {

    class CharacterViewHolder(binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val textView: TextView = binding.tvCharacterName
        val imageView: ImageView = binding.ivCharacter
        val materialCard: MaterialCardView = binding.mcvCharacter
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
        holder.materialCard.setOnClickListener {
            val intent = Intent(context, DetailCharacterActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size
}
