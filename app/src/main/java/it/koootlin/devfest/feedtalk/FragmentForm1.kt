package it.koootlin.devfest.feedtalk


import android.view.ViewGroup
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.view_qrcode.*
import android.content.Intent
import com.google.zxing.integration.android.IntentIntegrator


class FragmentForm1 : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?) : View? =
            inflater.inflate(R.layout.view_qrcode, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        laurantoCam.setOnClickListener {
            (activity as MainActivity).openlaurantocam()

        }
    }
}
