package dev.mcg.parcial21100602

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        title = "Sign In"

        val emailSuccess: String = "admin@toolkitapp.com"
        val passwordSucess = "admin123"
        val etPassword: EditText = findViewById(R.id.etPassword)
        val etEmail: EditText = findViewById(R.id.etEmail)
        val btnLogin: Button = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            if(email == emailSuccess && password == passwordSucess){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

            val rootView: View = findViewById(android.R.id.content)
            Snackbar.make(rootView, "Credenciales incorrectas", Snackbar.LENGTH_SHORT).show()

            }
    }
}