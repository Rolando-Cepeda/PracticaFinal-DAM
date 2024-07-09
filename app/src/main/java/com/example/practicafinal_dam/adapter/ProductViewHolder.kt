package com.example.practicafinal_dam.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practicafinal_dam.Product
import com.example.practicafinal_dam.R

class ProductViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val nameP = view.findViewById<TextView>(R.id.tvProductName)
    val priceProduct = view.findViewById<TextView>(R.id.tvPrice)
    val descriptionProduct = view.findViewById<TextView>(R.id.tvDescription)
    val photo = view.findViewById<ImageView>(R.id.ivProduct)

    fun render(productModel: Product) {
        nameP.text = productModel.nameProduct
        priceProduct.text = productModel.price.toString()
        descriptionProduct.text = productModel.description

    }
}