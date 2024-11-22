package com.example.ei13m5.ui


import com.example.ei13m5.ui.MainContract.Presenter
import com.example.ei13m5.util.PasswordUtils

class MainPresenter(private val view: MainContract.View) : Presenter {

    override fun evaluarContrasena(contrasena: String) {
        val fortaleza = PasswordUtils.calcularFuerzaContrasena(contrasena)
        view.mostrarFortaleza(fortaleza)
    }
}
