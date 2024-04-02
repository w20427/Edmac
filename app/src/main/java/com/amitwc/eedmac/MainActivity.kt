package com.amitwc.eedmac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val cardHtmls = findViewById<ImageView>(R.id.img2)
        val cardYoga = findViewById<ImageView>(R.id.img6)
        val cardAutocad = findViewById<ImageView>(R.id.img5)


        cardHtmls.setOnClickListener{
            intent= Intent(this@MainActivity,FscreenAct::class.java)
            startActivity(intent)
        }
        cardYoga.setOnClickListener{
            intent= Intent(this@MainActivity,YogaActivity::class.java)
            startActivity(intent)
        }
        cardAutocad.setOnClickListener{
            intent= Intent(this@MainActivity,AutocadActivity::class.java)
            startActivity(intent)
        }
    }
}