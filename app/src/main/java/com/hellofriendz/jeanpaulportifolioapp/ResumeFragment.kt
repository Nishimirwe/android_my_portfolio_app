package com.hellofriendz.jeanpaulportifolioapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.hellofriendz.jeanpaulportifolioapp.databinding.FragmentResumeBinding

class ResumeFragment : Fragment() {

    private lateinit var binding: FragmentResumeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentResumeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    //Down method is where we write all codes we want to run after a fragment is created
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.profileImageCardViewId.setOnClickListener {
            onRecyclerClicked()
        }

        val resumeCards:ArrayList<ResumeCardClass> = arrayListOf(
            ResumeCardClass("Education","Master of Science in Information Technology","2020-2022","Carnegie Institute of Technology, Carnegie Mellon University.",
                "Bachelor of Computer Science","2016 - 2020","University of Rwanda"),
            ResumeCardClass("Professional Experience","Software Engineer","2020 - Present","Student at Carnegie Mellon University.",
            "Leading a company","2019 - Now","CEO of HFRIENDZ.Ltd")
        )

        val recycler=binding.recyclerResumeId
        var adapter=ResumeCardAdapterClass()
        adapter.setList(resumeCards)
        recycler.adapter=adapter
    }

    private fun onRecyclerClicked() {
        Toast.makeText(context,"You want my full resume, find my contacts via CONTACT menu",Toast.LENGTH_LONG).show()
    }
}