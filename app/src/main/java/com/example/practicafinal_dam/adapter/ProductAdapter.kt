package com.example.practicafinal_dam.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practicafinal_dam.Product
import com.example.practicafinal_dam.R

class ProductAdapter (private val productList: List<Product>): RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        return ProductViewHolder(layoutInflater.inflate(R.layout.item_product, parent,false))
    }

    override fun getItemCount(): Int {
       return productList.size
    }
    // override fun getItemCount(): Int = productList.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
       val item = productList[position]
        holder.render(item)
    }
}