package com.example.saferpass.ui

interface MainContract {
    interface View {
        fun mostrarFortaleza(fortaleza: Int)
    }

    interface Presenter {
        fun evaluarContrasena(contrasena: String)
    }
}
