package com.guichristovao.poke_themes

object Themes {

    private var current: Int = 0

    private val list = listOf(
        R.style.PokemonRedTheme to "Red",
        R.style.PokemonBlueTheme to "Blue",
        R.style.PokemonGreenTheme to "Green",
        R.style.PokemonYellowTheme to "Yellow"
    )

    fun getCurrent() = list[current]

    fun getPrevious() {
        current--
        if (current < 0) current = list.size - 1
    }

    fun getNext() {
        current++
        if (current >= list.size) current = 0
    }
}
