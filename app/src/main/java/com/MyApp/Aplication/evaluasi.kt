package com.MyApp.Aplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class evaluasi : AppCompatActivity() {
    private lateinit var inputke1: TextView
    private lateinit var inputke2: TextView
    private lateinit var inputke3: TextView
    private lateinit var inputke4: TextView
    private lateinit var inputke5: TextView
    private lateinit var inputke6: TextView
    private lateinit var inputke7: TextView
    private lateinit var inputke8: TextView
    private lateinit var inputke9: TextView
    private lateinit var inputke10: TextView
    private lateinit var inputke11: TextView
    private lateinit var inputke12: TextView
    private lateinit var inputke13: TextView
    private lateinit var btn: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_evaluasi)
        inputke1 = findViewById(R.id.input1)
        inputke2 = findViewById(R.id.input2)
        inputke3 = findViewById(R.id.input3)
        inputke4 = findViewById(R.id.input4)
        inputke5 = findViewById(R.id.input5)
        inputke6 = findViewById(R.id.input6)
        inputke7 = findViewById(R.id.input7)
        inputke8 = findViewById(R.id.input8)
        inputke9 = findViewById(R.id.input9)
        inputke10 = findViewById(R.id.input10)
        inputke11 = findViewById(R.id.input11)
        inputke12 = findViewById(R.id.input12)
        inputke13 = findViewById(R.id.input13)
        btn = findViewById(R.id.btnbtn)

        val intent = intent
        val input1 = intent.getStringExtra("inp1")
        val input2 = intent.getStringExtra("inp2")
        val input3 = intent.getStringExtra("inp3")
        val input4 = intent.getStringExtra("inp4")
        val input5 = intent.getStringExtra("inp5")
        val input6 = intent.getStringExtra("inp6")
        val input7 = intent.getStringExtra("inp7")
        val input8 = intent.getStringExtra("inp8")
        val input9 = intent.getStringExtra("inp9")
        val input10 = intent.getStringExtra("inp10")
        val input11 = intent.getStringExtra("inp11")
        val input12 = intent.getStringExtra("inp12")
        val input13 = intent.getStringExtra("inp13")
        inputke1.text = input1
        inputke2.text = input2
        inputke3.text = input3
        inputke4.text = input4
        inputke5.text = input5
        inputke6.text = input6
        inputke7.text = input7
        inputke8.text = input8
        inputke9.text = input9
        inputke10.text = input10
        inputke11.text = input11
        inputke12.text = input12
        inputke13.text = input13


        btn.setOnClickListener{
            val intent = Intent(this@evaluasi, home::class.java)
            startActivity(intent)
            finish()
        }


      /*  val intent = intent
        val data = intent.getStringExtra("data")
        val textView = findViewById<TextView>(R.id.text_view)
        textView.text = data*/

    }
}