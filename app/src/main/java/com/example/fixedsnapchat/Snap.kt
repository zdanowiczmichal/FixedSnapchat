package com.example.fixedsnapchat

import android.graphics.Color

data class Snap(val username: String, val profileID: Int, val time: String, var opened: Boolean) {
    val status: String
        get() =
            if (opened)
                "Received"
            else
                "New Snap"
    val rectangleID: String
        get() =
            if (opened)
                R.drawable.rectangle_no.toString()
            else
                R.drawable.rectangle_filled.toString()
    val textColor: Int
        get() =
            if (opened)
                (Color.parseColor("#F60047"))
            else
                (Color.GRAY)
}