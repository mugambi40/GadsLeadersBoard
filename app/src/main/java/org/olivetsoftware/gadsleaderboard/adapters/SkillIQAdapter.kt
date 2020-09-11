package org.olivetsoftware.gadsleaderboard.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.olivetsoftware.gadsleaderboard.R
import org.olivetsoftware.gadsleaderboard.models.SkillIQ
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.skill_iq_recyclerview_row.view.*

class SkillIQAdapter( private val context: Context) : RecyclerView.Adapter<SkillIQAdapter.ViewHolder>() {
    private var list: List<SkillIQ> = ArrayList()

    fun setTopSkillIQLeadersList(list: List<SkillIQ>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = list[position].name
        Picasso.get().load(list[position].badgeUrl).into(holder.image_url)
        holder.score_and_country.text = "${list[position].score} Skill IQ Score, ${list[position].country}"

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.skill_iq_recyclerview_row, parent, false))
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val name = v.skill_iq_leader_name!!
        val image_url = v.skill_iq_leader_badge!!
        val score_and_country = v.skill_iq_score_and_country!!
    }
}
