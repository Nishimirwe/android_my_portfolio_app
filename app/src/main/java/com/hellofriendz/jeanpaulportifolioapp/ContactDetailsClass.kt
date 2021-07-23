package com.hellofriendz.jeanpaulportifolioapp

class ContactDetailsClass(private var image:Int,
                          private var value:String,
                          private var primary:String
) {
    fun getImage()=image;
    fun getValue()=value
    fun getPrimary()=primary
}