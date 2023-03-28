package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.example.activitylifecycle.databinding.ActivityExperiment2SplashScreenBinding

class Experiment2_SplashScreenActivity : AppCompatActivity() {
    lateinit var binding: ActivityExperiment2SplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityExperiment2SplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var txt=binding.textView.text.toString()

        Handler().postDelayed({

            val toast=Toast.makeText(this,txt,Toast.LENGTH_LONG).show()
            val intent:Intent=Intent(this,Experiment2_LoginActivity::class.java)
            startActivity(intent)
        },3000)
    }
}

