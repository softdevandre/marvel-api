package com.softdevandre.marvelapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.softdevandre.marvelapi.databinding.ActivityMainBinding
import com.softdevandre.marvelapi.model.Characters
import com.softdevandre.marvelapi.ui.ListCharacterAdapter

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvCharacterList.adapter = ListCharacterAdapter(loadCharacters())
        binding.rvCharacterList.layoutManager = GridLayoutManager(this, 2)
    }

    private fun loadCharacters(): List<Characters>{
        return arrayListOf(
            Characters("Iron Man"),
            Characters("Thor"),
            Characters("Captain America"),
        ).toList()
    }
}