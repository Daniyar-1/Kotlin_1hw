package com.example.kotlin1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intentValue = intent.getStringExtra(key1)
        tv_second_page.text = intentValue

        btn_ok_second.setOnClickListener {
            if (!et_second_page.text.isNullOrEmpty()) {
                intent = Intent(this, MainActivity::class.java)
                intent.putExtra(key2, et_second_page.text.toString())
                startActivity(intent)
            } else {
                Toast.makeText(this, "Заполните поле!", Toast.LENGTH_LONG).show()

            }
        }
    }
}