package org.olivetsoftware.gadsleaderboard.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import org.olivetsoftware.gadsleaderboard.ui.view.FragmentLearningLeaders
import org.olivetsoftware.gadsleaderboard.ui.view.FragmentSkillIQLeaders

class ViewPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position){
            0-> {
                FragmentLearningLeaders()
            }
            else->{
                return FragmentSkillIQLeaders()
            }
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Learning Leaders"
            else -> return "Skill IQ Leaders"
        }
    }
}
