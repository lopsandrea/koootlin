package it.koootlin.devfest.feedtalk

import android.support.v4.app.Fragment


class FragmentFormBase : Fragment() {
    val formActivity: MainActivity
        get() = (activity as MainActivity?)!!

    fun nextPage() {
        if (activity != null) {
            formActivity.nextPagerPage()
        }
    }

}