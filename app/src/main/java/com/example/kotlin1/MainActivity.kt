package com.example.kotlin1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

const val key1 = "FIRST_TO_SECOND"
const val key2 = "SECOND_TO_FIRST"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_ok_first.setOnClickListener {
            if (!et_first_page.text.isNullOrEmpty()) {
                intent = Intent(this, SecondActivity::class.java)
                intent.putExtra(key1, et_first_page.text.toString())
                startActivity(intent)
            } else {
                Toast.makeText(this, "Заполните поле!", Toast.LENGTH_LONG).show()
            }
        }
        tv_first_page.visibility = View.VISIBLE
        val intentValue = intent.getStringExtra(key2)
            tv_first_page.text = intentValue

    }
}