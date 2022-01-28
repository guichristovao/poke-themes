package com.guichristovao.poke_themes.player

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView

class PlayerView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val tvPlayerSubtitle: TextView by lazy { findViewById(R.id.tvPlayerSubtitle) }
    private val btPrevious: View by lazy { findViewById(R.id.btPrevious) }
    private val btNext: View by lazy { findViewById(R.id.btNext) }

    init {
        inflate(context, R.layout.player, this)
    }

    fun setSongName(name: String) {
        tvPlayerSubtitle.text = name
    }

    fun onPreviousButtonClick(onClick: OnClickListener) {
        btPrevious.setOnClickListener(onClick)
    }

    fun onNextButtonClick(onClick: OnClickListener) {
        btNext.setOnClickListener(onClick)
    }
}
