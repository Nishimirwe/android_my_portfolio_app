package com.hellofriendz.jeanpaulportifolioapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ResumeCardAdapterClass() : RecyclerView.Adapter<ResumeCardAdapterClass.ResumeCardViewHolder>() {

    private lateinit var rcc:ArrayList<ResumeCardClass>

    fun setList(r:ArrayList<ResumeCardClass>)
    {
        rcc=r
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResumeCardViewHolder {
        val view:View=LayoutInflater.from(parent.context).inflate(R.layout.resume_card_view,parent,false)

        return ResumeCardViewHolder(view)
    }

    override fun onBindViewHolder(holder: ResumeCardViewHolder, position: Int) {
        holder.bind(rcc[position])
    }

    override fun getItemCount(): Int=rcc.size


    class ResumeCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        fun bind(rcc:ResumeCardClass)
        {
            itemView.findViewById<TextView>(R.id.card_header_one_id).text=rcc.getHeader1()
            itemView.findViewById<TextView>(R.id.card_header_two_id).text=rcc.getHeader2()
            itemView.findViewById<TextView>(R.id.card_year_one_id).text=rcc.getYear1()
            itemView.findViewById<TextView>(R.id.card_value_one_id).text=rcc.getValue1()
            itemView.findViewById<TextView>(R.id.card_header_three_id).text=rcc.getHeader3()
            itemView.findViewById<TextView>(R.id.card_year_two_id).text=rcc.getYear2()
            itemView.findViewById<TextView>(R.id.card_value_two_id).text=rcc.getValue2()
        }

    }
}