package ir.gcorp.toasterExample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ir.gcorp.toasterlibrary.ToasterMessage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToasterMessage(this).show("sss")
    }
}
