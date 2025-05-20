package com.example.saferpass.ui

import com.example.saferpass.util.PasswordUtils

class MainPresenter(private val view: MainContract.View) : MainContract.Presenter {
    override fun evaluarContrasena(contrasena: String) {
        val fortaleza = PasswordUtils.calcularFuerzaContrasena(contrasena)
        view.mostrarFortaleza(fortaleza)
    }
}
