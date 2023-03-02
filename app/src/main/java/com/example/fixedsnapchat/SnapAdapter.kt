package com.example.fixedsnapchat

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import com.example.fixedsnapchat.databinding.ListItemLayoutBinding

class SnapAdapter(val snapList: List<Snap>) : RecyclerView.Adapter<SnapViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SnapViewHolder {
        val tiernan = ListItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SnapViewHolder(tiernan)
    }

    override fun onBindViewHolder(holder: SnapViewHolder, position: Int) {
        val currentCourse = snapList[position]
        holder.bindSnap(currentCourse)
    }

    override fun getItemCount(): Int {
        return snapList.size
    }
}
