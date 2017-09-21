package com.example.roshan.navigation


import android.os.Bundle
import android.support.v4.app.Fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.ListView

import org.jetbrains.anko.support.v4.toast


/**
 * A simple [Fragment] subclass.
 */
class Gallery : Fragment() {
    val al_flower=ArrayList<Model_flower>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view= inflater!!.inflate(R.layout.fragment_gallery, container, false)

        al_flower.add(Model_flower("Rosa",R.drawable.rosa,"A rose is a woody perennial flowering plant of the genus Rosa, in the family Rosaceae, or the flower it bears. There are over a hundred species and thousands of cultivars"))
        al_flower.add(Model_flower("Lotus",R.drawable.lotus,"Nelumbo nucifera, also known as Indian lotus, sacred lotus, bean of India, Egyptian bean or simply lotus, is one of two extant species of aquatic plant in the family Nelumbonaceae."))

        al_flower.add(Model_flower("Cherry Blossom",R.drawable.cherry_blossom,"A cherry blossom (or commonly known in Japan as sakura) is the flower of any of several trees of genus Prunus, particularly the Japanese cherry, Prunus serrulata"))

        al_flower.add(Model_flower("Bird of Paradise",R.drawable.birdofparadise,"The birds-of-paradise are members of the family Paradisaeidae of the order Passeriformes. The majority of species are found in eastern Indonesia, Papua New Guinea, and eastern Australia. The family has 42 species in 15 genera"))

        al_flower.add(Model_flower("Tulips",R.drawable.tulips,"The tulip is a Eurasian and North African genus of herbaceous, perennial, bulbous plants in the lily family, with showy flowers. About 75 wild species are accepted"))

        al_flower.add(Model_flower("Dahlia",R.drawable.dahlia,"Dahlia is a genus of bushy, tuberous, herbaceous perennial plants native to Mexico. A member of the Asteraceae, dicotyledonous plants, related species include the sunflower, daisy, chrysanthemum, and zinnia."))

        al_flower.add(Model_flower("Water Lilies",R.drawable.waterlilies,"Lilium is a genus of herbaceous flowering plants growing from bulbs, all with large prominent flowers. Lilies are a group of flowering plants which are important in culture and literature in much of the world."))

        al_flower.add(Model_flower("Gazania",R.drawable.gazania,"Gazania is a genus of flowering plants in the family Asteraceae, native to Southern Africa. They produce large, daisy-like composite flowerheads in brilliant shades of yellow and orange, over a long period in summer."))

        al_flower.add(Model_flower("Orchid",R.drawable.orchid,"The Orchidaceae are a diverse and widespread family of flowering plants, with blooms that are often colourful and fragrant, commonly known as the orchid family. Along with the Asteraceae, they are one of the two largest families of flowering plants"))
        var list=view.findViewById(R.id.lv_flower) as ListView

        val adapter : AdapterClass
        adapter = AdapterClass(activity,R.layout.adapter,al_flower)
        list.adapter=adapter

        list.setOnItemClickListener { adapterView, view, i, l ->
            //  Log.d("Data", "position" + adapterView.getItemAtPosition(i))

            var value=adapterView.getItemAtPosition(i) as Model_flower
            var item_name=value.str_name

        //using anko library for toast
           toast(item_name)
        }


        return view;
    }




}