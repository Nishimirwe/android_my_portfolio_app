package com.hellofriendz.jeanpaulportifolioapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hellofriendz.jeanpaulportifolioapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // binding variable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater) // adding layout to binding variable
        var view:View=binding.root // view to hold our parent container
        setContentView(view)  // setting a content view

        // email me is clicked
        binding.optionEmailCardViewId.setOnClickListener { emailMeClickedOn() }

        // call me is clicked
        binding.optionCallCardViewId.setOnClickListener { callMeClickedOn() }

        //Text me is clicked
        binding.optionTextCardViewId.setOnClickListener { textMeClickedOn() }

        //get to my portfolio is clicked
        binding.getToPortfolioButtonId.setOnClickListener { getToPortfolio() }

        // Large Image of mine is clicked on
        binding.myPhotoCardViewId.setOnClickListener { getToPortfolio() }

    }

    // function of getting to portfolio button
    private fun getToPortfolio() {
        val intent=Intent(this,SecondMainActivity::class.java)
        startActivity(intent)
    }

    //function to send SMS to me
    private fun textMeClickedOn() {
        val number:String="0789336678"
        val message:String="""
            Dear Jean Paul,
            
            
        """.trimIndent()
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("smsto:$number")
            putExtra("sms_body", message)
        }
        startActivity(intent)
    }

    // function to call a number
    private fun callMeClickedOn() {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:+250789336678")
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

    // function to compose an email
    private fun emailMeClickedOn() {
        val message:String="""
            Dear Jean Paul,
            
            
        """.trimIndent()
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:nishimirwepaul2015@gmail.com") // only email apps should handle this
            putExtra(Intent.EXTRA_TEXT, message)
            putExtra(Intent.EXTRA_SUBJECT,"Contact Jean Paul")
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}