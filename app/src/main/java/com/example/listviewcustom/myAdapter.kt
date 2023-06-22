package com.example.listviewcustom

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView
import org.w3c.dom.Text

class myAdapter (val context : Activity, val arrayList: ArrayList<userData>) : ArrayAdapter<userData>(context, R.layout.eachitem, arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.eachitem, null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.name)
        val subtitle = view.findViewById<TextView>(R.id.subtitle)
        val time = view.findViewById<TextView>(R.id.time)

        name.text = arrayList[position].name
        subtitle.text = arrayList[position].subtitle
        time.text = arrayList[position].time
        image.setImageResource(arrayList[position].imageid)

        return view
    }
}