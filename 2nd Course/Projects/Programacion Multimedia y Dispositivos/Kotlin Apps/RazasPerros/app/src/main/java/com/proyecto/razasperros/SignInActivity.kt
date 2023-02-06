package com.proyecto.razasperros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.proyecto.razasperros.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignInBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.textView.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener {
            val email = binding.emailEt.text.toString()
            val pass = binding.passET.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty()) {
                firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
                    if (it.isSuccessful) {
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Email o contraseña incorrectos", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "No se permiten campos vacíos", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // ************* SI EL USUARIO YA ESTA LOGUEADO, DIRECTAMENTE SE LE MUESTRA EL MAIN ACTIVITY Y NO TIENE QUE PASAR POR LA PANTALLA DE INICIO DE SESIÓN
//    override fun onStart(){
//        super.onStart()
//        if (firebaseAuth.currentUser != null ){
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
//    }
}