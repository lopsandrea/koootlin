package it.koootlin.devfest.feedtalk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.zxing.integration.android.IntentIntegrator
import android.content.Intent
import android.widget.ImageButton
import android.support.v4.view.PagerAdapter
import android.util.Log
import android.view.View


class MainActivity : AppCompatActivity() {

    var adapter: PagerAdapter
    var pager: NonScrollableViewPager
    var model: FormViewModel
    var previous: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        model = ViewModelProviders.of(this).get(FormViewModel::class.java)

        pager = findViewById(R.id.review_pager)
        adapter = FormPagerAdapter(supportFragmentManager)
        pager.setAdapter(adapter)
        pager.setCurrentItem(model.pagerPosition)
        previous = findViewById(R.id.purchasePrevius)

        previous.setOnClickListener(object : View.OnClickListener() {
            override fun onClick(v: View) {
                previousPagerPage()
            }
        })
    }

    fun nextPagerPage() {
        Log.e("tag", model.getPagerPosition() + "")
        if (model.getPagerPosition() !== 2) {
            model.setPagerPosition(model.getPagerPosition() + 1)
            pager.setCurrentItem(model.getPagerPosition())
        } else {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }
    }

    fun previousPagerPage() {
        if (model.getPagerPosition() !== 0) {
            model.setPagerPosition(model.getPagerPosition() - 1)
            pager.setCurrentItem(model.getPagerPosition())
        } else {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
