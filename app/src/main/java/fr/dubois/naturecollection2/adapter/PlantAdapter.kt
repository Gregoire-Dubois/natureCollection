package fr.dubois.naturecollection2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import fr.dubois.naturecollection2.R

class PlantAdapter : RecyclerView.Adapter<PlantAdapter.ViewHolder>() {

    // ViewHolder class to hold your components
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Plant image
        val plantImage = view.findViewById<ImageView>(R.id.image_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_horizontal_plant, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Bind data to views here
    }

    override fun getItemCount(): Int = 5
}
