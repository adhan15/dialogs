package com.adhan.dialogue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.selects.select
import org.jetbrains.anko.*
import org.jetbrains.anko.design.longSnackbar
import org.jetbrains.anko.design.snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnToasts.setOnClickListener {
            toast("Hello,This is a toast message")
            longToast("Hello this is a toast that is longer")
        }

        btnSnackbar.setOnClickListener {
            //it.isEnabled=false
            //toast("Hello Button")
            snackbar(it,"Hello,Time for snacks")
            longSnackbar(it,"Hello long snackbar")
            it.snackbar("Hello Betterway")
            it.longSnackbar("Hello long snackbar")
        }

        btnAlert.setOnClickListener {
            /*alert (
                title="Warning!!!!", message="you will be removed  completely from the list"
            ){
                //okButton { toast("You been removed")
                //cancelButton { toast("You have cancelled") }}
                positiveButton("Delete"){toast("Deleted")}
                negativeButton("No, don't"){toast("Cancelled")}
            }.show()*/
        }

        var counties= listOf<String>("Nairobi","Mombasa","Turkana","Nakuru","Kiambu","Garissa")

        selector("your county", counties, {dialogInterface, i ->
            toast(counties.get(i))
        })

        btnProgress.setOnClickListener {
            progressDialog("Loading.. Please wait")
            indeterminateProgressDialog("Loading")
        }

        //make a phone call
        //share a text
        //send sms
    }

}
