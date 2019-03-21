package com.thanapong.android_ohek.Model

class CountClick {
    companion object countNum {
        var countClick = 0

        fun count() {
            countClick++
        }
    }
}