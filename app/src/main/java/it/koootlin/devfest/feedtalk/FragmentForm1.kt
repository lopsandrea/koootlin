package it.koootlin.devfest.feedtalk

import android.support.v4.app.Fragment

import android.view.ViewGroup
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View


class FragmentForm1 : Fragment() {

<<<<<<< HEAD
    var model: FormViewModel
=======
>>>>>>> 371b4f219b3cd6c28d39cf654c5c82d832070c88

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        val rootView = inflater.inflate(
                R.layout.view_qrcode, container, false) as ViewGroup


        return rootView
    }


}
