package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

// Configura o botão de login para verificar as credenciais
        binding.buttonEntrar.setOnClickListener {
            val username = "João"
            val password = "15"

// Verifica se o nome de usuário e a senha estão corretos
            if (username.equals("João") && password.equals("15")) {
                val i = Intent(this, MainActivity::class.java)
                i.putExtra("username", username)

                startActivity(i) // Inicia a tela MainActivity
                finish() // Encerra a tela de Login
            } else {
                Toast.makeText(applicationContext, "Errou", Toast.LENGTH_LONG).show()
 // Aparece uma mensagem de erro se as credenciais estiverem erradas
            }
        }

    }
}
