package com.example.convo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class UserAdapter(private val context: Context, private val userList:ArrayList<User>):RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view:View=LayoutInflater.from(context).inflate(R.layout.user_layout,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val currentUser=userList[position]
        holder.textName.text=currentUser.name
    }

    override fun getItemCount(): Int {
        return userList.size
    }
    class UserViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val textName: TextView =itemView.findViewById<TextView>(R.id.text_name)
    }
}