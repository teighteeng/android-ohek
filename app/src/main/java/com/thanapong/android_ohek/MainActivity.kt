package com.thanapong.android_ohek

import android.app.Application
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 1..9) {
            var bt = arrayOf(i)
            var name_bt = "bt+$i"
            print(name_bt)
            Toast.makeText(this, name_bt, Toast.LENGTH_LONG).show()
        }
    }
}
