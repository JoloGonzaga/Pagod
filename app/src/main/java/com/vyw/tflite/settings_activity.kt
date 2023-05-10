package com.vyw.tflite

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class settings_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val return_icon = findViewById<ImageView>(R.id.back)
        val title = findViewById<TextView>(R.id.toolbar_title)
        return_icon.setOnClickListener {
            startActivity(
                Intent(
                    this@settings_activity,
                    MainActivity::class.java
                )
            )
            fun locButton_btnClick(view: View) {
                val fragment = MapFragment()
                val fragmentManager = supportFragmentManager
                val transaction = fragmentManager.beginTransaction()
                transaction.replace(R.id.MY_MAP, fragment)
                transaction.commit()
            }

        }

        }
    }






