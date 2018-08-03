package com.example.a259.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectdLeague =  ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View){
        if (selectdLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectdLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league!", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMensClicked (view: View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectdLeague = "mens"
    }

     fun onWomensClicked(view: View){
         mensLeagueBtn.isChecked = false
         coedLeagueBtn.isChecked = false

         selectdLeague = "womens"
     }

    fun onCoedClicked(view: View){
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false

        selectdLeague = "co-ed"
    }

}
