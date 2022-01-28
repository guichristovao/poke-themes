package com.guichristovao.poke_themes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.guichristovao.poke_themes.player.PlayerView

class MainActivity : AppCompatActivity() {

    private val player: PlayerView by lazy { findViewById(R.id.player) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(Themes.getCurrent().first)
        setContentView(R.layout.activity_main)

        setupPlayer()
    }

    private fun setupPlayer() {
        player.run {
            setSongName("Pokémon ${Themes.getCurrent().second}")
            onPreviousButtonClick {
                Themes.getPrevious()
                updateTheme()
            }
            onNextButtonClick {
                Themes.getNext()
                updateTheme()
            }
        }
    }

    private fun updateTheme() {
        setTheme(Themes.getCurrent().first)
        Intent(this, javaClass).run {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(this)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}