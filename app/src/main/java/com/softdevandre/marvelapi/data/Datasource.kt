package com.softdevandre.marvelapi.data

import com.softdevandre.marvelapi.R
import com.softdevandre.marvelapi.model.Characters

class Datasource {
    fun loadCharacters(): List<Characters>{
        return listOf<Characters>(
            Characters(R.string.iron_man, R.drawable.ironman),
            Characters(R.string.thor, R.drawable.thor),
            Characters(R.string.captain_america, R.drawable.captainamerica),
        ).toList()
    }
}