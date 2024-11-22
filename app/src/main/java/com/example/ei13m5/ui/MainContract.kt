package com.example.ei13m5.ui

interface MainContract {

    interface View {
        fun mostrarFortaleza(fortaleza: Int)
    }

    interface Presenter {
        fun evaluarContrasena(contrasena: String)
    }
}
