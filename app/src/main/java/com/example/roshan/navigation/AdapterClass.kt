package com.example.roshan.navigation

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

import android.content.Context.LAYOUT_INFLATER_SERVICE
import com.squareup.picasso.Picasso

/**
 * Created by roshan on 9/21/17.
 */

class AdapterClass : ArrayAdapter<Model_flower> {

    var flowerList: ArrayList<Model_flower>
    private val resource: Int
    private val inflater: LayoutInflater

    //constructor(context: Context, resource: Int) : super(context, resource) {}
    constructor(context: Context, resource: Int, flowerList: ArrayList<Model_flower>) : super(context, resource, flowerList) {

        this.flowerList = flowerList
        this.resource = resource
        inflater = context.getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val holder: ViewHolder
        if (convertView == null) {
            holder = ViewHolder()
            convertView = inflater.inflate(R.layout.adapter, null)
            holder.imageView = convertView!!.findViewById(R.id.iv_flower) as ImageView
            holder.tvIname = convertView.findViewById(R.id.tv_name) as TextView
            holder.tvDesc = convertView.findViewById(R.id.tv_des) as TextView

            convertView.tag = holder

        } else {
            holder = convertView.tag as ViewHolder
        }
        holder.tvIname!!.text = flowerList[position].str_name
        holder.tvDesc!!.text = flowerList[position].str_des

        Picasso.with(context).load(flowerList[position].int_image).into(holder.imageView)
        return convertView
    }

    internal inner class ViewHolder {
        var imageView: ImageView? = null
        var tvIname: TextView? = null
        var tvDesc: TextView? = null
    }
}
