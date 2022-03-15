package com.google.thigiuaki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.thigiuaki.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {


        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val name = findViewById<EditText>(R.id.name)
        val address = findViewById<EditText>(R.id.email)
        val phone = findViewById<TextView>(R.id.sdt)
        val dangnhap = findViewById<Button>(R.id.button)

        binding.button.setOnClickListener {
            var name = name.text.toString()
            var address = address.text.toString()
            var phone = phone.text.toString()


            val intent = Intent(this@MainActivity, information::class.java)
            startActivity(intent)
        }
    }
}