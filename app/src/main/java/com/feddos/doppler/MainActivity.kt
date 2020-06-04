package com.feddos.doppler

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.feddos.doppler.authentication.Authentication
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        authButton.setOnClickListener{
            AuthClickListener()
        }
    }
    private fun AuthClickListener(){
        if(Authentication().AuthenticateLogged(loginBox.text.toString(), passwordBox.text.toString())){
            authResultColor.setBackgroundColor(Color.parseColor("#00ff2a"))

        }
        else{
            authResultColor.setBackgroundColor(Color.parseColor("#fc0303"))
        }
    }
}