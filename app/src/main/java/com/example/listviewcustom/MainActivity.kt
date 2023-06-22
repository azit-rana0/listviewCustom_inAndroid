package com.example.listviewcustom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var userArrayList: ArrayList<userData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Azit Rana", "Aman Raj", "Rahul Muskan", "Pankaj Mandal", "Harsh Nitin", "Milan Kumar Mahto", "Vijay Rana", "Suraj Muskan")
        val subtitle = arrayOf("Hey WhatasApp", "I am Fine", "Good", "Awesome", "Cool" , "Smart", "Super", "Bhombha")
        val time = arrayOf("6:25 AM", "7:00 PM", "5:00 AM", "6:35 GM", "8:00 PM" , "5:00 AM", "4:00 AM" , "10:00 AM")
        val number = arrayOf("7643053169", "8434707282", "8809245223","978234823","9798734287", "9113443543", "9818709067", "9987889739")
        val email = arrayOf("azr.rana1236@gmail.com", "aman.in@gmail.com", "rahulmuskan2002@gmail.com", "pankajgupta.si@gmail.com",
                            "nitinharsh@gmail.com" , "milankuamar65759@gmail.com", "vizzo300@gmail.com", "bhombah200@gmail.com")
        val imgId = arrayOf(R.drawable.azr, R.drawable.aman, R.drawable.azr3, R.drawable.azr4, R.drawable.harsh, R.drawable.milan, R.drawable.vizzo, R.drawable.azr2)

        userArrayList = ArrayList()

        for(eachIndex in name.indices){
            val user = userData(name[eachIndex], subtitle[eachIndex], time[eachIndex], number[eachIndex],email[eachIndex], imgId[eachIndex])

            userArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.listview)
        listView.isClickable = true
        listView.adapter = myAdapter(this, userArrayList)



        listView.setOnItemClickListener { parent, view, position, id ->

            val userName = name[position]
            val userPhone = number[position]
            val userEmail = email[position]
            val imageId = imgId[position]

            val i = Intent(this, userActivity::class.java)

            i.putExtra("name", userName)
            i.putExtra("phone", userPhone)
            i.putExtra("email", userEmail)
            i.putExtra("image", imageId)

            startActivity(i)
        }
    }
}