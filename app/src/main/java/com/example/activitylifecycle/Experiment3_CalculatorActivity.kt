package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitylifecycle.databinding.ActivityExperiment3CalculatorBinding
import org.mariuszgromada.math.mxparser.Expression
import javax.xml.xpath.XPathExpression


class Experiment3_CalculatorActivity : AppCompatActivity() {

    lateinit var binding: ActivityExperiment3CalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityExperiment3CalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
      //  binding.txtwrite.showSoftInputOnFocus(false)

        binding.btn9.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"09")
            result()
        }

        binding.btn0.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"0")
            result()
        }
        binding.btn1.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"1")
            result()

        }
        binding.btn2.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"2")
            result()
        }
        binding.btn3.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"3")
            result()
        }
        binding.btn4.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"4")
            result()
        }
        binding.btn5.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"5")
            result()
        }
        binding.btn6.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"6")
            result()
        }
        binding.btn7.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"7")
            result()
        }
        binding.btn8.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"8")
            result()
        }
        binding.btn9.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"9")
            result()
        }
        binding.btnADD.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"+")
        }
        binding.btnSUB.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"-")
        }
        binding.btnMUL.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"*")
        }
        binding.btnDIV.setOnClickListener {
            val pre=binding.txtwrite.text.toString()
            binding.txtwrite.setText(pre+"/")
        }
        binding.btnCLR.setOnClickListener {
            binding.txtwrite.setText("")
            binding.txtres.setText("")
        }
        binding.btnEQL.setOnClickListener {
            result()
            binding.txtwrite.setText("")
        }
        binding.btndot.setOnClickListener {
            binding.txtwrite.setText(binding.txtwrite.text.toString()+".")
        }
        binding.btnback.setOnClickListener {

            val str:String=binding.txtwrite.text.toString()
            val length:Int=str.length

            if(length>0){
                binding.txtwrite.setText(str.substring(0,length-1))
                result()
            }
            else{
                binding.txtwrite.setText("0")
            }

        }

    }

    private fun result() {
        val str:String=binding.txtwrite.text.toString()
        val exp:Expression=Expression(str)
val res: Double =exp.calculate()
        binding.txtres.setText(res.toString())
    }
}