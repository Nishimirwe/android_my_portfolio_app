package com.hellofriendz.jeanpaulportifolioapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SkillsAdapterClass(private var list:ArrayList<SkillsContentsClass>) : RecyclerView.Adapter<SkillsAdapterClass.SkillsViewHolder>() {

    class SkillsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        fun bind(scc:SkillsContentsClass)
        {
            itemView.findViewById<ImageView>(R.id.skill_image_id).setImageResource(scc.getImage())
            itemView.findViewById<TextView>(R.id.skill_name_id).text=scc.getName()
            itemView.findViewById<TextView>(R.id.skill_percent_id).text="${scc.getPercentage()}"
            itemView.findViewById<TextView>(R.id.skill_description_id).text=scc.getDescription()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillsViewHolder {
        return SkillsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.skills_card_view,parent,false))
    }

    override fun onBindViewHolder(holder: SkillsViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int =list.size
}