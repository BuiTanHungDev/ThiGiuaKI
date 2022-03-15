package com.google.thigiuaki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.google.thigiuaki.databinding.ActivityInformationBinding

class information : AppCompatActivity() {
    private lateinit var binding: ActivityInformationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformationBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_information)

        var intent =intent
        var name = intent.getStringExtra("name")
        var address = intent.getStringExtra("email")
        var phone = intent.getStringExtra("phone")

        val sendname = findViewById<TextView>(R.id.sendname)
        val sendAddress = findViewById<TextView>(R.id.sendAddress)
        val sendphone = findViewById<TextView>(R.id.sendphone)
        sendname.text= name
        sendAddress.text= address
        sendphone.text= phone

    }
}