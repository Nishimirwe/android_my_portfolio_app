package com.hellofriendz.jeanpaulportifolioapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ContactCardAdapterClass(private var list:Array<ContactDetailsClass>) :
    RecyclerView.Adapter<ContactCardAdapterClass.ContactCardViewHolder>() {

    class ContactCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        fun bind(cdc:ContactDetailsClass)
        {
            itemView.findViewById<ImageView>(R.id.contact_kind_logo_id).setImageResource(cdc.getImage())
            itemView.findViewById<TextView>(R.id.contact_value_text_id).text=cdc.getValue()
            itemView.findViewById<TextView>(R.id.primary_or_not_id).text=cdc.getPrimary()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactCardViewHolder {
        return ContactCardViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.contact_card,parent,false))
    }

    override fun onBindViewHolder(holder: ContactCardViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int=list.size
}