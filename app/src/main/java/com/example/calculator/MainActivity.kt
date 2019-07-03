package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    var number1: Double? = null

    var number2: Double? = null

    var operation: String? = null

    var isMaths: Boolean = true

    override fun onClick(v: View?) {


        when (v!!.id) {


            R.id.img_one -> {

                val getText = txt_hsp.text
                val newText = "${getText}1"
                txt_hsp.setText(newText)

            }

            R.id.img_two -> {

                val getText = txt_hsp.text
                val newText = "${getText}2"
                txt_hsp.setText(newText)
            }

            R.id.img_three -> {

                val getText = txt_hsp.text
                val newText = "${getText}3"
                txt_hsp.setText(newText)
            }

            R.id.img_four -> {

                val getText = txt_hsp.text
                val newText = "${getText}4"
                txt_hsp.setText(newText)
            }

            R.id.img_five -> {

                val getText = txt_hsp.text
                val newText = "${getText}5"
                txt_hsp.setText(newText)
            }

            R.id.img_six -> {

                val getText = txt_hsp.text
                val newText = "${getText}6"
                txt_hsp.setText(newText)
            }

            R.id.img_seven -> {

                val getText = txt_hsp.text
                val newText = "${getText}7"
                txt_hsp.setText(newText)
            }

            R.id.img_eight -> {

                val getText = txt_hsp.text
                val newText = "${getText}8"
                txt_hsp.setText(newText)
            }

            R.id.img_nine -> {

                val getText = txt_hsp.text
                val newText = "${getText}9"
                txt_hsp.setText(newText)
            }

            R.id.img_zero -> {

                val getText = txt_hsp.text
                val newText = "${getText}0"
                txt_hsp.setText(newText)

            }

            R.id.img_c -> clear()

            R.id.img_percent -> {

                val txt: String = (txt_hsp.text.toString().toDouble() / 100).toString()
                txt_hsp.setText(txt)

            }

            R.id.img_division -> {
                number1 = txt_hsp.text.toString().toDouble()
                operation = "/"
                clear()
                img_division.isClickable = false
                nmbr1.setText(number1.toString())
                oprt.setText("/")

            }

            R.id.img_multiply -> {
                number1 = txt_hsp.text.toString().toDouble()
                operation = "*"
                clear()
                img_multiply.isClickable = false
                nmbr1.setText(number1.toString())
                oprt.setText("*")

            }

            R.id.img_minus -> {
                number1 = txt_hsp.text.toString().toDouble()
                operation = "-"
                clear()
                img_minus.isClickable = false
                nmbr1.setText(number1.toString())
                oprt.setText("-")
            }

            R.id.img_plus -> {
                number1 = txt_hsp.text.toString().toDouble()
                operation = "+"
                clear()
                img_plus.isClickable = false
                nmbr1.setText(number1.toString())
                oprt.setText("+")
            }

            R.id.img_equal -> {

                if (number1 != null) {
                    when (operation) {

                        "+" -> {
                            number2 = txt_hsp.text.toString().toDouble()
                            clear()
                            nmbr2.setText(number2.toString())
                            txt_hsp.setText((number1!! + number2!!).toString())
                            img_plus.isClickable = true
                        }
                        "-" -> {
                            number2 = txt_hsp.text.toString().toDouble()
                            clear()
                            nmbr2.setText(number2.toString())
                            txt_hsp.setText((number1!! - number2!!).toString())
                            img_minus.isClickable = true
                        }
                        "/" -> {
                            number2 = txt_hsp.text.toString().toDouble()
                            clear()
                            nmbr2.setText(number2.toString())
                            txt_hsp.setText((number1!! / number2!!).toString())
                            img_division.isClickable = true
                        }
                        "*" -> {
                            number2 = txt_hsp.text.toString().toDouble()
                            clear()
                            nmbr2.setText(number2.toString())
                            txt_hsp.setText((number1!! * number2!!).toString())
                            img_multiply.isClickable = true
                        }





                    }
                }


            }

            R.id.img_maths -> {
                if (isMaths) {

                    val txt = "-${txt_hsp.text}"
                    txt_hsp.setText(txt)


                } else {


                    txt_hsp.setText((txt_hsp.text.toString().toDouble() * -1).toString())
                }
            }

            R.id.txt_comma -> {

                val txt = "${txt_hsp.text},"
                txt_hsp.setText(txt)
                txt_comma.isClickable = false

            }

            R.id.img_squareroot ->{
                val txt = Math.sqrt(txt_hsp.text.toString().toDouble()).toString()
                txt_hsp.setText(txt)
            }

        }


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




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


    fun clear() {
        txt_hsp.setText("")
    }

}

