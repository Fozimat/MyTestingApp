package com.fozimat.mytestingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnSetValue: Button
    private lateinit var tvText: TextView

    private var names = ArrayList<String>()

    private lateinit var imgPreview: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgPreview = findViewById(R.id.img_preview)
//        imgPreview.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.fronalpstock_big))
        Glide.with(this).load(R.drawable.fronalpstock_big).into(imgPreview)

        tvText = findViewById(R.id.tv_text)

        btnSetValue = findViewById(R.id.btn_set_value)
        btnSetValue.setOnClickListener(this)

        names.add("Fozimat Amhas")
        names.add("Lisa")
        names.add("Ari")
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.btn_set_value) {
            Log.d("MainActivity", names.toString())
            val name = StringBuilder()
            for (i in 0..2) {
                name.append(names[i]).append("\n")
            }
            tvText.text = "21"
        }
    }
}