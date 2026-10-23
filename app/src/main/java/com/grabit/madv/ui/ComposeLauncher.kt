package com.grabit.madv.ui

import androidx.compose.ui.platform.ComposeView
import com.grabit.madv.ui.theme.GrabItTheme

object ComposeLauncher {
    @JvmStatic
    fun setShoppingScreenContent(composeView: ComposeView) {
        composeView.setContent {
            GrabItTheme {
                ShoppingScreen()
            }
        }
    }
}
