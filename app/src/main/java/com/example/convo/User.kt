package com.example.convo

class User {
    var name:String?=null
    private var number:String?=null
    private var uid:String?=null

    constructor(){}
    constructor(name:String?, number:String?, uid:String){
        this.name=name
        this.number=number
        this.uid=uid
    }

}