package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sqrt

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var number1: Double? = null
    private var number2: Double? = null
    private var operation: String? = null
    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.img_one -> setText("1")
            R.id.img_two -> setText("2")
            R.id.img_three -> setText("3")
            R.id.img_four -> setText("4")
            R.id.img_five -> setText("5")
            R.id.img_six -> setText("6")
            R.id.img_seven -> setText("7")
            R.id.img_eight -> setText("8")
            R.id.img_nine -> setText("9")
            R.id.img_zero -> setText("0")
            R.id.img_c -> clear()
            R.id.img_percent -> percent()
            R.id.img_division -> operationsFalse(oprt, "/")
            R.id.img_multiply -> operationsFalse(oprt, "*")
            R.id.img_minus -> operationsFalse(oprt, "-")
            R.id.img_plus -> operationsFalse(oprt, "+")
            R.id.img_equal -> equal()
            R.id.img_maths -> maths()
            R.id.txt_comma -> comma()
            R.id.img_squareroot -> squareroot()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt_hsp.text = 0.toString()
        hesapla()
    }

    private fun hesapla() {
        img_one.setOnClickListener(this)
        img_two.setOnClickListener(this)
        img_three.setOnClickListener(this)
        img_four.setOnClickListener(this)
        img_five.setOnClickListener(this)
        img_six.setOnClickListener(this)
        img_seven.setOnClickListener(this)
        img_eight.setOnClickListener(this)
        img_nine.setOnClickListener(this)
        img_zero.setOnClickListener(this)
        img_c.setOnClickListener(this)
        img_division.setOnClickListener(this)
        img_equal.setOnClickListener(this)
        img_percent.setOnClickListener(this)
        img_plus.setOnClickListener(this)
        img_maths.setOnClickListener(this)
        img_minus.setOnClickListener(this)
        img_multiply.setOnClickListener(this)
        img_squareroot.setOnClickListener(this)
        txt_comma.setOnClickListener(this)
    }

    private fun clear() {
        txt_hsp.text = 0.toString()
    }

    private fun equal() {
        if (number1 != null) {
            when (operation) {
                "+" -> {
                    number2 = txt_hsp.text.toString().toDouble()
                    clear()
                    nmbr2.text = number2.toString()
                    txt_hsp.text = (number1!! + number2!!).toString()
                    operationsTrue()
                }
                "-" -> {
                    number2 = txt_hsp.text.toString().toDouble()
                    clear()
                    nmbr2.text = number2.toString()
                    txt_hsp.text = (number1!! - number2!!).toString()
                    operationsTrue()
                }
                "/" -> {
                    number2 = txt_hsp.text.toString().toDouble()
                    clear()
                    nmbr2.text = number2.toString()
                    txt_hsp.text = (number1!! / number2!!).toString()
                    operationsTrue()
                }
                "*" -> {
                    number2 = txt_hsp.text.toString().toDouble()
                    clear()
                    nmbr2.text = number2.toString()
                    txt_hsp.text = (number1!! * number2!!).toString()
                    operationsTrue()
                }
            }
        }
    }

    private fun operationsTrue() {
        img_plus.isClickable = true
        img_minus.isClickable = true
        img_division.isClickable = true
        img_multiply.isClickable = true
    }

    private fun operationsFalse(oprt: TextView, oprtn: String) {
        number1 = txt_hsp.text.toString().toDouble()
        operation = oprtn
        clear()
        nmbr1.text = number1.toString()
        nmbr2.text = ""
        oprt.text = oprtn
        img_plus.isClickable = false
        img_minus.isClickable = false
        img_division.isClickable = false
        img_multiply.isClickable = false
    }

    private fun maths() {
        if (txt_hsp.text.isNotEmpty() && txt_hsp.text != 0.toString()) {
            if (txt_hsp.text.toString().toDouble() > 0) {
                val txt = "-${txt_hsp.text}"
                txt_hsp.text = txt
            } else {
                val txt = ((txt_hsp.text.toString().toDouble()) * -1).toString()
                txt_hsp.text = txt
            }
        }
    }

    private fun comma() {
        val txt = "${txt_hsp.text}."
        txt_hsp.text = txt
        txt_comma.isClickable = false
    }

    private fun squareroot() {
        val txt = sqrt(txt_hsp.text.toString().toDouble()).toString()
        txt_hsp.text = txt
    }

    private fun setText(nmbr: String) {
        val getText = txt_hsp.text
        val setText = "$getText$nmbr"
        txt_hsp.text = setText
    }

    private fun percent() {
        val txt: String = (txt_hsp.text.toString().toDouble() / 100).toString()
        txt_hsp.text = txt
    }
}