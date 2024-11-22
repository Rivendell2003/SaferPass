package com.example.ei13m5

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.TextWatcher
import android.text.Editable
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.ei13m5.ui.MainContract.View
import com.example.ei13m5.ui.MainPresenter

class MainActivity : AppCompatActivity(), View {

    private lateinit var passwordEditText: EditText
    private lateinit var strengthTextView: TextView
    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        passwordEditText = findViewById(R.id.passwordEditText)
        strengthTextView = findViewById(R.id.strengthTextView)


        presenter = MainPresenter(this)


        passwordEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

                val contrasena = s.toString()
                presenter.evaluarContrasena(contrasena)
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        })
    }


    @SuppressLint("SetTextI18n")
    override fun mostrarFortaleza(fortaleza: Int) {

        val fortalezaText = when (fortaleza) {
            0 -> "Muy débil"
            1 -> "Débil"
            2 -> "Moderada"
            3 -> "Fuerte"
            4 -> "Muy fuerte"
            else -> "Desconocida"
        }


        strengthTextView.text = "Fortaleza: $fortalezaText"
    }
}
