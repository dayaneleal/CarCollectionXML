package com.example.carcollection.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.carcollection.R
import com.example.carcollection.model.CarValue
import com.example.carcollection.ui.loadUrl

class ItemAdapter(
    private val cars: List<CarValue>,
    private val onItemClick: (CarValue) -> Unit,
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView = view.findViewById<ImageView>(R.id.image)
        val nameTextView = view.findViewById<TextView>(R.id.name)

        val yearTextView = view.findViewById<TextView>(R.id.year)
        val licenseTextView = view.findViewById<TextView>(R.id.license)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.car_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = cars[position]
        holder.nameTextView.text = item.name
        holder.yearTextView.text = item.year
        holder.licenseTextView.text = item.licence

        item.imageUrl.let {
            holder.imageView.loadUrl(it)
        }
        holder.itemView.setOnClickListener {
            onItemClick(item)
        }
    }

    override fun getItemCount(): Int = cars.size

}
