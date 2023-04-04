package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitylifecycle.databinding.ActivityCalBinding
import org.mariuszgromada.math.mxparser.Expression

class CalActivity : AppCompatActivity() {

    lateinit var binding: ActivityCalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityCalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn0.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"0")
            res()
        }

        binding.btn1.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"0")
        }

        binding.btn2.setOnClickListener {

        }
    }

    private fun res() {
       val str:String=binding.txtwrite.text.toString()
        val expression:Expression=Expression(str)
        val result:Double=expression.calculate()
        binding.txtres.setText(result.toString())
    }
}