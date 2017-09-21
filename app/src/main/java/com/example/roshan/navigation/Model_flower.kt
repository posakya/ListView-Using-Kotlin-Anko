package com.example.roshan.navigation

/**
 * Created by roshan on 9/21/17.
 */
class Model_flower {

    var str_name:String =""
    var str_des:String =""
    var int_image:Int=0

    constructor(){

    }




    constructor(str_name:String,int_image:Int,str_des:String){
        this.int_image=int_image
        this.str_name=str_name
        this.str_des=str_des

    }

}