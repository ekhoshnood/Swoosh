package com.example.a259.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.a259.swoosh.Utilities.EXTRA_LEAGUE
import com.example.a259.swoosh.R

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        Toast.makeText(this, league, Toast.LENGTH_SHORT).show()
    }

    fun onFinishClicke(view: View){
        val intent = Intent(this, FinishActivity::class.java)
        startActivity(intent)
    }
}
