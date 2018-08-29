package it.koootlin.devfest.feedtalk

import android.support.v4.app.Fragment

import android.view.ViewGroup
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View


class FragmentForm1 : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        val rootView = inflater.inflate(
                R.layout.view_qrcode, container, false) as ViewGroup


        return rootView
    }


}
