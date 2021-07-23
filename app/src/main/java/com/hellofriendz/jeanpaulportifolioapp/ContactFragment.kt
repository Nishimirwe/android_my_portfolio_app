package com.hellofriendz.jeanpaulportifolioapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hellofriendz.jeanpaulportifolioapp.databinding.FragmentContactBinding

class ContactFragment : Fragment() {

    private lateinit var binding: FragmentContactBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentContactBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val r=binding.recyclerViewContactId
        val phone="+250 789 336 678"
        val list:Array<ContactDetailsClass> = arrayOf(
            ContactDetailsClass(R.drawable.gmail_logo,"Email","nishimirwepaul2015@gmail.com"),
            ContactDetailsClass(R.drawable.phone_call_logo,"Phone Call",phone),
            ContactDetailsClass(R.drawable.message_logo,"Message",phone),
            ContactDetailsClass(R.drawable.whatsapp_logo,"WhatsApp",phone),
            ContactDetailsClass(R.drawable.telegram_logo,"Telegram",phone),
            ContactDetailsClass(R.drawable.linkedin_logo,"LinkedIn","Jean Paul Nishimirwe"),
            ContactDetailsClass(R.drawable.github_logo,"GitHub","Nishimirwe"),
            ContactDetailsClass(R.drawable.facebook_logo,"Facebook","J Paul Nishimirwe"),
            ContactDetailsClass(R.drawable.twitter_logo,"Twitter","NishimirweJean"),
            ContactDetailsClass(R.drawable.instagram_logo,"Instagram","jpaulkll")
        )

        val adp=ContactCardAdapterClass(list)
        r.adapter=adp
    }

}