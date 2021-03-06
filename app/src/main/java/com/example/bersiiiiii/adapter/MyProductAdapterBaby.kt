package com.example.bersiiiiii.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bersiiiiii.R
import com.example.bersiiiiii.model.ProductModel
import com.example.bersiiiiii.prdctBaby
import java.lang.StringBuilder

class MyProductAdapterBaby(
    private val context: prdctBaby,
    private val list:List<ProductModel>
): RecyclerView.Adapter<MyProductAdapterBaby.MyProductViewHolder>(){

    class MyProductViewHolder(itemView:android.view.View) : RecyclerView.ViewHolder(itemView){
        var imageView: ImageView?=null
        var txtName: TextView?=null
        var txtPrice: TextView?=null

        init {
            imageView = itemView.findViewById(R.id.productimg) as ImageView
            txtName = itemView.findViewById(R.id.txtName) as TextView
            txtPrice = itemView.findViewById(R.id.txtPrice) as TextView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyProductViewHolder {
        return MyProductViewHolder(LayoutInflater.from(context)
            .inflate(R.layout.layput_product_item,parent,false))
    }

    override fun onBindViewHolder(holder: MyProductViewHolder, position: Int) {
        Glide.with(context)
            .load(list[position].image)
            .into(holder.imageView!!)
        holder.txtName!!.text = StringBuilder().append(list[position].name)
        holder.txtPrice!!.text = StringBuilder("Rp.").append(list[position].price)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}