package com.example.radiobuttoninkotlin


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.RadioGroup



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radio_group.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        button.setOnClickListener{
            var id: Int = radio_group.checkedRadioButtonId
            if (id!=-1){
                val radio:RadioButton = findViewById(id)
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun radio_button_click(view: View){
        val radio: RadioButton = findViewById(radio_group.checkedRadioButtonId)
        Toast.makeText(applicationContext,"On click : ${radio.text}",
            Toast.LENGTH_SHORT).show()
    }
}
