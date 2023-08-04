package com.muffakir.kashtour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.muffakir.kashtour.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding : ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.btnMain.setOnClickListener{
            Toast.makeText(this@SignUp, "Hello World", Toast.LENGTH_SHORT).show()
        }        
    }


}