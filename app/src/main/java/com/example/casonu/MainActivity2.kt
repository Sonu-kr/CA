package com.example.casonu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var edit = findViewById<EditText>(R.id.edit1)
        var button = findViewById<Button>(R.id.button8)
        var radio = findViewById<RadioGroup>(R.id.radioGroup)
        var option1 = findViewById<RadioButton>(R.id.option1)
        var option2 = findViewById<RadioButton>(R.id.option2)
        var checkBox = findViewById<CheckBox>(R.id.checkBox)
        button.setOnClickListener {
            Toast.makeText(this,edit.text.toString(),Toast.LENGTH_SHORT).show()
        }
        radio.setOnCheckedChangeListener { radioGroup, i ->
            if(i == R.id.option1)
                Toast.makeText(this,option1.text.toString(),Toast.LENGTH_SHORT).show()
            if(i == R.id.option2)
                Toast.makeText(this,option2.text.toString(),Toast.LENGTH_SHORT).show()
        }
        checkBox.setOnCheckedChangeListener{checkBox,isChecked->
            if(isChecked){
                Toast.makeText(this,"Checked",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Not Checked",Toast.LENGTH_SHORT).show()
            }
        }

    }
}