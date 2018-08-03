package com.example.a259.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class  BaseActivity : AppCompatActivity() {

    val tag = "lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(tag, "${javaClass.simpleName} oncreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(tag, "${javaClass.simpleName} onstart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(tag, "${javaClass.simpleName} onresume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(tag, "${javaClass.simpleName} onpause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(tag, "${javaClass.simpleName} onstop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(tag, "${javaClass.simpleName} onstop")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d(tag, "${javaClass.simpleName} onstop")
        super.onRestart()
    }
}
