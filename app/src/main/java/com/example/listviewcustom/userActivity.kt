package com.example.listviewcustom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView
import org.w3c.dom.Text

class userActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val userName = intent.getStringExtra("name")
        val userPhone = intent.getStringExtra("phone")
        val userEmail = intent.getStringExtra("email")
        val userImage = intent.getIntExtra("image", R.drawable.azr)

        val nameTv = findViewById<TextView>(R.id.tvName)
        val phoneTv = findViewById<TextView>(R.id.tvPhone)
        val emailTv = findViewById<TextView>(R.id.tvEmail)
        val imageId = findViewById<CircleImageView>(R.id.userProfile_image)

        nameTv.text = userName
        phoneTv.text = userPhone
        emailTv.text = userEmail
        imageId.setImageResource(userImage)

    }
}