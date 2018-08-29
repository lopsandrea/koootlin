package it.koootlin.devfest.feedtalk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.zxing.integration.android.IntentIntegrator
import android.widget.Toast
import android.content.Intent
import android.os.PersistableBundle


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeLayout(FragmentQr())


    }

    override fun onResume() {
        super.onResume()
    }

    fun changeLayout(fragment: android.support.v4.app.Fragment){
        if (!this.isFinishing) {
            supportFragmentManager.beginTransaction()
                .add(R.id.rootLayout, fragment)
                    .commitNow()
        }
    }

    fun infoTalk(id: String){
        val repository = TalkRepository()
        repository.getTalk(id).addOnCompleteListener {
            if (it.isSuccessful) {

                val talk: Talk? = it.result.toObject(Talk::class.java)

                changeLayout(FragmentRating())

            }
        }
    }


    fun openlaurantocam(){
        IntentIntegrator(this).initiateScan() // `his` is the current Fragment
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)

        if (result != null) {
            if (result.contents == null) {
                Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Il risultato è: ${result.contents}", Toast.LENGTH_LONG).show()
                infoTalk(result.contents)
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }
}
