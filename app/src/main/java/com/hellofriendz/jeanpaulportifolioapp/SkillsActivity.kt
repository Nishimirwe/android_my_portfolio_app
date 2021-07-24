package com.hellofriendz.jeanpaulportifolioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hellofriendz.jeanpaulportifolioapp.databinding.ActivitySkillsBinding
import java.util.ArrayList

class SkillsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySkillsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySkillsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = ArrayList<SkillsContentsClass>()
        list.add(SkillsContentsClass(R.drawable.c_logo, 98, "C++", "The Father of other languages"))
        list.add(SkillsContentsClass(R.drawable.html_logo, 98, "HTML", "Web Development"))
        list.add(
            SkillsContentsClass(
                R.drawable.java_logo,
                97,
                "Java",
                "Multi-Purpose Programing Language"
            )
        )
        list.add(
            SkillsContentsClass(
                R.drawable.python_logo,
                95,
                "Python",
                "King of Data Science and AI builders"
            )
        )
        list.add(
            SkillsContentsClass(
                R.drawable.php_logo,
                94,
                "PHP",
                "Back-End for Web Development"
            )
        )
        list.add(
            SkillsContentsClass(
                R.drawable.css_logo,
                90,
                "CSS",
                "Formatting contents in Web development"
            )
        )
        list.add(
            SkillsContentsClass(
                R.drawable.js_logo,
                90,
                "JavaScript",
                "Assisting in Web Development"
            )
        )
        list.add(SkillsContentsClass(R.drawable.jquery_logo, 89, "JQuery", "JavaScript Frame Work"))
        list.add(
            SkillsContentsClass(
                R.drawable.android_logo,
                85,
                "Android with Java",
                "Smartphone apps development"
            )
        )
        list.add(
            SkillsContentsClass(
                R.drawable.kotlin_logo,
                85,
                "Android with Kotlin",
                "Advanced programming language to support java"
            )
        )

        binding.skillRecyclerViewId.adapter=SkillsAdapterClass(list)
    }
}