package com.thanapong.android_ohek

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.thanapong.android_ohek.Model.Board
import com.thanapong.android_ohek.Model.CountClick
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var win = false

        ButtonBaord()

        Toast.makeText(this, Board.bt_1_check.toString(), Toast.LENGTH_LONG).show()

//        if (Board.bt_1_check == Board.bt_2_check && Board.bt_2_check == Board.bt_3_check){
//            Toast.makeText(this, "win", Toast.LENGTH_LONG).show()
//        }

    }

    fun ButtonBaord() {
        val str_o = "O"
        val str_x = "X"

        bt_1.setOnClickListener {
            if (bt_1.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_1.text = str_o
                    Board.bt_1_check = 0
                }
                else {
                    bt_1.text = str_x
                    Board.bt_1_check = 1
                }
            }
        }

        bt_2.setOnClickListener {
            if (bt_2.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_2.text = str_o
                    Board.bt_2_check = 0
                }
                else {
                    bt_2.text = str_x
                    Board.bt_2_check = 1
                }
            }
        }

        bt_3.setOnClickListener {
            if (bt_3.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_3.text = str_o
                    Board.bt_3_check = 0
                }
                else {
                    bt_3.text = str_x
                    Board.bt_3_check = 1
                }
            }
        }

        bt_4.setOnClickListener {
            if (bt_4.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_4.text = str_o
                    Board.bt_4_check = 0
                }
                else {
                    bt_4.text = str_x
                    Board.bt_4_check = 1
                }
            }
        }

        bt_5.setOnClickListener {
            if (bt_5.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_5.text = str_o
                    Board.bt_5_check = 0
                }
                else {
                    bt_5.text = str_x
                    Board.bt_5_check = 1
                }
            }
        }

        bt_6.setOnClickListener {
            if (bt_6.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_6.text = str_o
                    Board.bt_6_check = 0
                }
                else {
                    bt_6.text = str_x
                    Board.bt_6_check = 1
                }
            }
        }

        bt_7.setOnClickListener {
            if (bt_7.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_7.text = str_o
                    Board.bt_7_check = 0
                }
                else {
                    bt_7.text = str_x
                    Board.bt_7_check = 1
                }
            }
        }

        bt_8.setOnClickListener {
            if (bt_8.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_8.text = str_o
                    Board.bt_8_check = 0
                }
                else {
                    bt_8.text = str_x
                    Board.bt_8_check = 1
                }
            }
        }

        bt_9.setOnClickListener {
            if (bt_9.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_9.text = str_o
                    Board.bt_9_check = 0
                }
                else {
                    bt_9.text = str_x
                    Board.bt_9_check = 1
                }
            }
        }
    }
}
