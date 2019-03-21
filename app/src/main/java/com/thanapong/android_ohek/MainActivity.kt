package com.thanapong.android_ohek

import android.annotation.SuppressLint
import android.app.Application
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.thanapong.android_ohek.Model.CountClick
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val str_o = "O"
        val str_x = "X"

        bt_1.setOnClickListener {
            if (bt_1.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_1.text = str_o
                }
                else {
                    bt_1.text = str_x
                }
            }
        }

        bt_2.setOnClickListener {
            if (bt_2.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_2.text = str_o
                }
                else {
                    bt_2.text = str_x
                }
            }
        }

        bt_3.setOnClickListener {
            if (bt_3.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_3.text = str_o
                }
                else {
                    bt_3.text = str_x
                }
            }
        }

        bt_4.setOnClickListener {
            if (bt_4.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_4.text = str_o
                }
                else {
                    bt_4.text = str_x
                }
            }
        }

        bt_5.setOnClickListener {
            if (bt_5.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_5.text = str_o
                }
                else {
                    bt_5.text = str_x
                }
            }
        }

        bt_6.setOnClickListener {
            if (bt_6.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_6.text = str_o
                }
                else {
                    bt_6.text = str_x
                }
            }
        }

        bt_7.setOnClickListener {
            if (bt_7.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_7.text = str_o
                }
                else {
                    bt_7.text = str_x
                }
            }
        }

        bt_8.setOnClickListener {
            if (bt_8.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_8.text = str_o
                }
                else {
                    bt_8.text = str_x
                }
            }
        }

        bt_9.setOnClickListener {
            if (bt_9.text.isEmpty()) {
                CountClick.count()
                if (CountClick.countClick%2 == 0) {
                    bt_9.text = str_o
                }
                else {
                    bt_9.text = str_x
                }
            }
        }
    }
}
