package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Experiment1ActivityLifeCycleActivity : AppCompatActivity() {

    lateinit var txt1:TextView
    lateinit var ed1:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_experiment1_life_cycle)

        txt1=findViewById(R.id.txtwelcometext)
        ed1=findViewById(R.id.editTextTextPersonName)
        var str=txt1.text.toString()
        ed1.setText(str)


      val toast=  Toast.makeText(this, "$str",Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        val toast=Toast.makeText(this,"OnStartMethod",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        val toast=Toast.makeText(this,"OnResumeMethod",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        val t=Toast.makeText(this,"OnPauseMethod",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        val t=Toast.makeText(this,"OnStopMethod",Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        val t=Toast.makeText(this,"OnRestartMethod",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val t=Toast.makeText(this,"onDestroyMethod",Toast.LENGTH_LONG).show()
    }


}