package com.example.demo.app

import com.example.demo.view.MainView
import jfxtras.styles.jmetro8.JMetro
import tornadofx.*

class MyApp: App(MainView::class, Styles::class) {
    override fun onBeforeShow(view: UIComponent) {
        JMetro(JMetro.Style.LIGHT).applyTheme(view.root)
    }
}