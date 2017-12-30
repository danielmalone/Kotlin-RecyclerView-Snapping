package com.danielmalone.horizontalsnapping

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.row_post.view.*

class PostsAdapter(val posts: ArrayList<String>) : RecyclerView.Adapter<PostsAdapter.PostsViewHolder>() {

    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        holder.username.text = posts[position]
    }

    override fun getItemCount() = posts.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_post, parent, false)
        return PostsViewHolder(view)
    }

    class PostsViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val username: TextView = itemview.username
    }
}