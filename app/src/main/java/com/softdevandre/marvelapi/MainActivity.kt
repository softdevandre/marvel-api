package com.softdevandre.marvelapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.softdevandre.marvelapi.data.Datasource
import com.softdevandre.marvelapi.databinding.ActivityMainBinding
import com.softdevandre.marvelapi.ui.adapter.ItemCharacterAdapter

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val myDataset = Datasource().loadCharacters()

        val recyclerView = binding.rvCharacterList
        recyclerView.adapter = ItemCharacterAdapter(this, myDataset)

    }
}