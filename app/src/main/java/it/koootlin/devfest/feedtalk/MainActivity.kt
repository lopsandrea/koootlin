package it.koootlin.devfest.feedtalk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.zxing.integration.android.IntentIntegrator
import android.widget.Toast
import com.google.zxing.integration.android.IntentResult
import android.content.Intent




class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.rootLayout, FragmentForm1())
        ft.commit()
    }


    fun openlaurantocam(){
        IntentIntegrator(this).initiateScan(); // `his` is the current Fragment
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)

        if (result != null) {
            if (result.contents == null) {
                Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Il risultato è: ${result.contents}", Toast.LENGTH_LONG).show()
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }
}
