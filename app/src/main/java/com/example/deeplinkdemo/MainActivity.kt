package com.example.deeplinkdemo

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var messageTV: TextView
    private var uri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // initializing our variable
        messageTV = findViewById(R.id.idTVMessage)
        // getting the data from our intent in our uri.
        uri = intent.data

        // checking if the uri is null or not.
        if (uri != null) {
            // if the uri is not null then we are getting
            // the path segments and storing it in list.
            val parameters = uri!!.pathSegments

            // after that we are extracting string
            // from that parameters.
            val param = parameters[parameters.size - 1]

            // on below line we are setting that
            // string to our text view which
            // we got as params.
            messageTV.text = param
        }

    }
}