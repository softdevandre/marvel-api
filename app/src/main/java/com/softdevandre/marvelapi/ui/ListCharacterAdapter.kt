package com.softdevandre.marvelapi.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.softdevandre.marvelapi.databinding.ItemCharacterBinding
import com.softdevandre.marvelapi.model.Characters
import com.softdevandre.marvelapi.ui.ListCharacterAdapter.CharacterViewHolder

class ListCharacterAdapter(private val characters: List<Characters>) :
    RecyclerView.Adapter<CharacterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val binding =
            ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharacterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(characters[position])
    }

    override fun getItemCount(): Int {
        return characters.size
    }

    class CharacterViewHolder(private val binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Characters) =
            with(binding) {
                tvCharacterName.text = data.name
            }
    }

}