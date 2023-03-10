package com.MyApp.Aplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase

class InsertionActivity : AppCompatActivity() {
    private lateinit var inputke1: EditText
    private lateinit var inputke2: EditText
    private lateinit var inputke3: EditText
    private lateinit var inputke4: EditText
    private lateinit var inputke5: EditText
    private lateinit var inputke6: EditText
    private lateinit var inputke7: EditText
    private lateinit var inputke8: EditText
    private lateinit var inputke9: EditText
    private lateinit var inputke10: EditText
    private lateinit var inputke11: EditText
    private lateinit var inputke12: EditText
    private lateinit var inputke13: EditText
    private lateinit var nama: EditText
    private lateinit var no: EditText
    private lateinit var kelas: EditText


    private lateinit var btnSaveData: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insertion)
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
        nama = findViewById(R.id.nama)
        no = findViewById(R.id.no)
        kelas = findViewById(R.id.kelas)
        btnSaveData = findViewById(R.id.btnSave)
        val btnexit = findViewById<ImageButton>(R.id.btnbtn)




        var dbRef = FirebaseDatabase.getInstance().getReference("inputdata")

        btnexit!!.setOnClickListener(View.OnClickListener {
            val set = Intent(this, home::class.java)
            startActivity(set)
        })

        btnSaveData.setOnClickListener(View.OnClickListener{

            val k4 = inputke1.text.toString()
            val k5 = inputke2.text.toString()
            val k6 = inputke3.text.toString()
            val k7 = inputke4.text.toString()
            val k8 = inputke5.text.toString()
            val k9 = inputke6.text.toString()
            val k10 = inputke7.text.toString()
            val k11 = inputke8.text.toString()
            val k12 = inputke9.text.toString()
            val k13 = inputke10.text.toString()
            val k14 = inputke11.text.toString()
            val k15 = inputke12.text.toString()
            val k16 = inputke13.text.toString()
            val intent = Intent(this@InsertionActivity, evaluasi::class.java)
            intent.putExtra("inp1", k4)
            intent.putExtra("inp2", k5)
            intent.putExtra("inp3", k6)
            intent.putExtra("inp4", k7)
            intent.putExtra("inp5", k8)
            intent.putExtra("inp6", k9)
            intent.putExtra("inp7", k10)
            intent.putExtra("inp8", k11)
            intent.putExtra("inp9", k12)
            intent.putExtra("inp10", k13)
            intent.putExtra("inp11", k14)
            intent.putExtra("inp12", k15)
            intent.putExtra("inp13", k16)
            startActivity(intent)
            saveEmployeeData()
            finish()
        })
    }

    private fun saveEmployeeData() {
        var dbRef = FirebaseDatabase.getInstance().getReference("inputdata")
        //getting values
        val ke1 = nama.text.toString()
        val ke2 = no.text.toString()
        val ke3 = kelas.text.toString()
        val ke4 = inputke1.text.toString()
        val ke5 = inputke2.text.toString()
        val ke6 = inputke3.text.toString()
        val ke7 = inputke4.text.toString()
        val ke8 = inputke5.text.toString()
        val ke9 = inputke6.text.toString()
        val ke10 = inputke7.text.toString()
        val ke11 = inputke8.text.toString()
        val ke12 = inputke9.text.toString()
        val ke13 = inputke10.text.toString()
        val ke14 = inputke11.text.toString()
        val ke15 = inputke12.text.toString()
        val ke16 = inputke13.text.toString()





        if (inputke1.text.isEmpty()) {
            inputke1.error =    Toast.makeText(this, "Data Masih Ada Yang Kosong Silahkan Di Cek!", Toast.LENGTH_LONG).show().toString()
        }
        else if (inputke2.text.isEmpty()) {
            inputke2.error =    Toast.makeText(this, "Data Masih Ada Yang Kosong Silahkan Di Cek!", Toast.LENGTH_LONG).show().toString()

        }
        else if (inputke3.text.isEmpty()) {
            inputke3.error =    Toast.makeText(this, "Data Masih Ada Yang Kosong Silahkan Di Cek!", Toast.LENGTH_LONG).show().toString()

        }
        else if (inputke4.text.isEmpty()) {
            inputke4.error =    Toast.makeText(this, "Data Masih Ada Yang Kosong Silahkan Di Cek!", Toast.LENGTH_LONG).show().toString()

        }
        else if (inputke5.text.isEmpty()) {
            inputke5.error =    Toast.makeText(this, "Data Masih Ada Yang Kosong Silahkan Di Cek!", Toast.LENGTH_LONG).show().toString()

        }
        else if (inputke6.text.isEmpty()) {
            inputke6.error =    Toast.makeText(this, "Data Masih Ada Yang Kosong Silahkan Di Cek!", Toast.LENGTH_LONG).show().toString()

        }
        else if (inputke7.text.isEmpty()) {
            inputke7.error =    Toast.makeText(this, "Data Masih Ada Yang Kosong Silahkan Di Cek!", Toast.LENGTH_LONG).show().toString()

        }
        else if (inputke8.text.isEmpty()) {
            inputke8.error =    Toast.makeText(this, "Data Masih Ada Yang Kosong Silahkan Di Cek!", Toast.LENGTH_LONG).show().toString()

        }
        else if (inputke9.text.isEmpty()) {
            inputke9.error =    Toast.makeText(this, "Data Masih Ada Yang Kosong Silahkan Di Cek!", Toast.LENGTH_LONG).show().toString()

        }
        else if (inputke10.text.isEmpty()) {
            inputke10.error =    Toast.makeText(this, "Data Masih Ada Yang Kosong Silahkan Di Cek!", Toast.LENGTH_LONG).show().toString()

        }
        else if (inputke11.text.isEmpty()) {
            inputke11.error =    Toast.makeText(this, "Data Masih Ada Yang Kosong Silahkan Di Cek!", Toast.LENGTH_LONG).show().toString()

        }
        else if (inputke12.text.isEmpty()) {
            inputke12.error =    Toast.makeText(this, "Data Masih Ada Yang Kosong Silahkan Di Cek!", Toast.LENGTH_LONG).show().toString()

        }
        else if (inputke13.text.isEmpty()) {
            inputke13.error =    Toast.makeText(this, "Data Masih Ada Yang Kosong Silahkan Di Cek!", Toast.LENGTH_LONG).show().toString()

        }
        else if (nama.text.isEmpty()) {
            nama.error =Toast.makeText(this, "Data Masih Ada Yang Kosong Silahkan Di Cek!", Toast.LENGTH_LONG).show().toString()

        }
        else if (no.text.isEmpty()) {
            no.error =    Toast.makeText(this, "Data Masih Ada Yang Kosong Silahkan Di Cek!", Toast.LENGTH_LONG).show().toString()
        }
        else if (kelas.text.isEmpty()) {
            kelas.error =
                Toast.makeText(this, "Data Masih Ada Yang Kosong Silahkan Di Cek!", Toast.LENGTH_LONG).show().toString()

        }
        else {

            val empId = dbRef.push().key!!

            val employee = EmployeeModel(
                empId,
                ke1,
                ke2,
                ke3,
                ke4,
                ke5,
                ke6,
                ke7,
                ke8,
                ke9,
                ke10,
                ke11,
                ke12,
                ke13,
                ke14,
                ke15,
                ke16
            )

            dbRef.child(empId).setValue(employee)
                .addOnCompleteListener {
                    Toast.makeText(this, "Data inserted successfully", Toast.LENGTH_LONG).show()
                    nama.text.clear()
                    no.text.clear()
                    kelas.text.clear()
                    inputke1.text.clear()
                    inputke2.text.clear()
                    inputke3.text.clear()
                    inputke4.text.clear()
                    inputke5.text.clear()
                    inputke6.text.clear()
                    inputke7.text.clear()
                    inputke8.text.clear()
                    inputke9.text.clear()
                    inputke10.text.clear()
                    inputke11.text.clear()
                    inputke12.text.clear()
                    inputke13.text.clear()



                }.addOnFailureListener { err ->
                    Toast.makeText(this, "Error ${err.message}", Toast.LENGTH_LONG).show()
                }
        }
    }
}