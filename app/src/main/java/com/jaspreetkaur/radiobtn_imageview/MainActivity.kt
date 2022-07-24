package com.jaspreetkaur.radiobtn_imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etNumber :EditText
    lateinit var ivHotel : ImageView
    lateinit var rgGender: RadioGroup
    lateinit var rbHe: RadioButton
    lateinit var rbShe: RadioButton
    lateinit var rbOther: RadioButton
    lateinit var etOtherName: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etName)
        etNumber = findViewById(R.id.etNumber)
        ivHotel = findViewById(R.id.ivHotel)
        etOtherName = findViewById(R.id.etOtherName)
        rbHe = findViewById(R.id.rbHe)
        rbShe = findViewById(R.id.rbShe)
        rbOther = findViewById(R.id.rbOther)
        rgGender = findViewById(R.id.rgGender)

        ivHotel.setOnClickListener {
            Toast.makeText(this, resources.getString(R.string.hotel_image_clicked), Toast.LENGTH_LONG).show()
        }

        rgGender.setOnCheckedChangeListener { radioGroup, id ->
            when(id){
                R.id.rbOther->{
                    Toast.makeText(this, resources.getString(R.string.others), Toast.LENGTH_LONG).show()
                    etOtherName.visibility = View.VISIBLE
                }
                else->{
                    etOtherName.visibility = View.GONE
                }
            }
        }


    }
}