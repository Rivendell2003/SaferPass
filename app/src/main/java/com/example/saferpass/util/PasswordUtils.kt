package com.example.saferpass.util

object PasswordUtils {
    fun calcularFuerzaContrasena(contrasena: String): Int {
        val lengthCriteria = contrasena.length >= 8
        val hasNumbers = contrasena.any { it.isDigit() }
        val hasLetters = contrasena.any { it.isLetter() }
        val hasSpecialChars = contrasena.any { it in "!@#$%^&*()-_+=<>?" }

        var strength = 0
        if (lengthCriteria) strength++
        if (hasNumbers) strength++
        if (hasLetters) strength++
        if (hasSpecialChars) strength++

        return strength
    }
}
