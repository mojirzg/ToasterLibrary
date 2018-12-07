package ir.gcorp.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage(val context : Context) {

    fun show(text : String){
        Toast.makeText(context,text,Toast.LENGTH_SHORT).show()
    }

}