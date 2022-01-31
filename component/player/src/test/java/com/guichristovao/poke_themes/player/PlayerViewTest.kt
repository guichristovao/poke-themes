package com.guichristovao.poke_themes.player

import app.cash.paparazzi.DeviceConfig.Companion.PIXEL_4
import app.cash.paparazzi.Paparazzi
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
class PlayerViewTest(
    @TestParameter theme: Theme
) {

    enum class Theme(
        val themeName: String
    ) {
        RED("PokemonRedTheme"),
        BLUE("PokemonBlueTheme"),
        GREEN("PokemonGreenTheme"),
        YELLOW("PokemonYellowTheme")
    }

    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = PIXEL_4,
        theme = theme.themeName,
//        renderExtensions = setOf(AccessibilityRenderExtension())
    )

    @Test
    fun default() {
        val view = paparazzi.inflate<PlayerView>(R.layout.launch).apply {
            setSongName("Song name")
        }
        paparazzi.snapshot(view)
    }
}
