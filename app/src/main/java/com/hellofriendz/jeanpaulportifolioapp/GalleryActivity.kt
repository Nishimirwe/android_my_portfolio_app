package com.hellofriendz.jeanpaulportifolioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hellofriendz.jeanpaulportifolioapp.databinding.ActivityGalleryBinding

class GalleryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGalleryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}