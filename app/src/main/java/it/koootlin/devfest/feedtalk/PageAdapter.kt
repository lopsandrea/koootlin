package it.koootlin.devfest.feedtalk

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class PageAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when {
            position === 0 -> return FragmentForm1()
            position === 1 -> return FragmentForm2()
            position === 2 -> return FragmentForm3()
            else -> return FragmentForm1()
        }

    }
    override fun getCount(): Int {
        return 3
    }

}