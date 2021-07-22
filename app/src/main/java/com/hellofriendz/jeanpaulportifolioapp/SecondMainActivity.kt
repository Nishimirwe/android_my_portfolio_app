package com.hellofriendz.jeanpaulportifolioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.hellofriendz.jeanpaulportifolioapp.databinding.ActivitySecondMainBinding

class SecondMainActivity : AppCompatActivity(),
    BottomNavigationView.OnNavigationItemSelectedListener {
    private  lateinit var binding: ActivitySecondMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // by default, the default fragment would be profile
        supportFragmentManager.commit { replace(R.id.fragment_holder_id,ProfileFragment()) }

        //This is time to code tha BottomNavigation Menu
        binding.bottomNavigationMenuId.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        if(item.itemId==R.id.profile_bottom_menu_id)
        {
            onProfileMenuClicked()
            return true
        }
        else if(item.itemId==R.id.resume_bottom_menu_id)
        {
            onResumeMenuClicked()
            return true
        }
        else if(item.itemId==R.id.contact_bottom_menu_id)
        {
            onContactMenuClicked()
            return true
        }
        else
        {
            return false
        }
    }

    private fun onContactMenuClicked() {
        supportFragmentManager.commit { replace(R.id.fragment_holder_id,ContactFragment()) }
    }

    private fun onResumeMenuClicked() {
        supportFragmentManager.commit { replace(R.id.fragment_holder_id,ResumeFragment()) }
    }

    private fun onProfileMenuClicked() {
        supportFragmentManager.commit {
            replace(R.id.fragment_holder_id,ProfileFragment())
        }
    }
}