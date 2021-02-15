package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"onCreate 1",Toast.LENGTH_SHORT).show()

       btnClose.setOnClickListener {
            finish()
       }


        btnActivity.setOnClickListener {
            var i2 = Intent(this,MainActivity2::class.java)
            i2.putExtra("name","Tamer")
            startActivity(i2)

        }

    }


    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart 1",Toast.LENGTH_SHORT).show()

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume 1",Toast.LENGTH_SHORT).show()

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause 1",Toast.LENGTH_SHORT).show()

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop 1",Toast.LENGTH_SHORT).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy 1",Toast.LENGTH_SHORT).show()

    }




}