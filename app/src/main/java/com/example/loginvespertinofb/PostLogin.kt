package com.example.loginvespertinofb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginvespertinofb.databinding.ActivityMainBinding
import com.example.loginvespertinofb.databinding.ActivityPostLoginBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class PostLogin : AppCompatActivity() {
    //Agregar viewBinding
    private lateinit var binding: ActivityPostLoginBinding
    //importamos firebase auth
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Inicializar firebase auth
        auth = Firebase.auth

        binding.btnCerrarSesion.setOnClickListener {
            auth.signOut()
            finish()
        }
    }
}