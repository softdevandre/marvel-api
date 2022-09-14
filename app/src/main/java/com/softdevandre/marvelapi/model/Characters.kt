package com.softdevandre.marvelapi.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Characters(
    @StringRes val name: Int,
    @DrawableRes val image: Int
)
