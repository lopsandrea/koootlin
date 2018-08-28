package it.koootlin.devfest.feedtalk

import android.support.v4.app.Fragment
import android.widget.RadioButton
import android.widget.RadioGroup
import android.annotation.SuppressLint
import android.view.ViewGroup
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View


class FragmentForm1 : FragmentFormBase() {

    internal var model: FormViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(
                R.layout.view_qrcode, container, false) as ViewGroup
        model = ViewModelProviders.of(activity).get(FormViewModel)


        val continueView = rootView.findViewById(R.id.review_fab)
        continueView.setOnClickListener(object : View.OnClickListener() {
            fun onClick(v: View) {
                nextPage()
            }
        })
        return rootView
    }


}
