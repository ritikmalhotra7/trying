package com.example.convo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class Home : AppCompatActivity() {

    private lateinit var user_rv: RecyclerView
    private lateinit var userList: ArrayList<User>
    private lateinit var adapter: UserAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        userList= ArrayList()
        adapter=UserAdapter(this,userList)


    }
}