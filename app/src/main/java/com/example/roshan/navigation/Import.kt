package com.example.roshan.navigation


import android.content.SharedPreferences
import android.os.Bundle

import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_import.*


class Import : Fragment() {

    val PREFS_FILENAME = "com.teamtreehouse.colorsarefun.prefs"
    val email1 = "email"
    var prefs: SharedPreferences? = null


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        val view: View= inflater!!.inflate(R.layout.fragment_import, container, false)

    prefs = activity.getSharedPreferences(PREFS_FILENAME, 0)
    val name = prefs!!.getString(email1, "")


        val button=view.findViewById(R.id.button) as Button
        val txt_email=view.findViewById(R.id.txt_email) as TextView
        txt_email.text = name
        button.setOnClickListener {
            Edit()
            txt_email.text = name
        }
        return view;
    }

    fun Edit(){
        val editor = prefs!!.edit()
        editor.putString(email1, email.text.toString())
        editor.apply()
    }

}
