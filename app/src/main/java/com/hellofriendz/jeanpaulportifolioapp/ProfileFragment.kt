package com.hellofriendz.jeanpaulportifolioapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.hellofriendz.jeanpaulportifolioapp.databinding.ActivityMainBinding
import com.hellofriendz.jeanpaulportifolioapp.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding//binding variable
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentProfileBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    // when everything is done, let us do this
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cardToGalleryId.setOnClickListener { onCardToGalleryClicked() }
        binding.cardToSkillsId.setOnClickListener { onCardToSkillsClicked() }
    }

    private fun onCardToSkillsClicked() {
        val intent=Intent(context,SkillsActivity::class.java)
        startActivity(intent)
    }

    private fun onCardToGalleryClicked() {
        val intent=Intent(context,GalleryActivity::class.java)
        startActivity(intent)


    }

}