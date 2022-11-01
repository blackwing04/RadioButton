package com.example.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rgGender = findViewById<RadioGroup>(R.id.rgGender)
        val etAge = findViewById<EditText>(R.id.etAge)
        val btnOk = findViewById<Button>(R.id.btnOk)
        btnOk.setOnClickListener {
            when(rgGender.checkedRadioButtonId){
                R.id.rbMale ->{
                    val age = etAge.text.toString().toInt()
                    when{
                        age < 28 -> Toast.makeText(this,getString(R.string.no_hurry), Toast.LENGTH_SHORT).show()
                        age in 28 .. 33 -> Toast.makeText(this,getString(R.string.find_partner), Toast.LENGTH_SHORT).show()
                        age > 33 -> Toast.makeText(this,getString(R.string.get_marry), Toast.LENGTH_SHORT).show()
                    }
                }
                else ->{
                    val age = etAge.text.toString().toInt()
                    when{
                        age < 25 -> Toast.makeText(this,getString(R.string.no_hurry), Toast.LENGTH_SHORT).show()
                        age in 25 .. 30 -> Toast.makeText(this,getString(R.string.find_partner), Toast.LENGTH_SHORT).show()
                        age > 30 -> Toast.makeText(this,getString(R.string.get_marry), Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}