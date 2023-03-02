package com.example.fixedsnapchat

import androidx.recyclerview.widget.RecyclerView
import androidx.navigation.findNavController
import com.example.fixedsnapchat.databinding.ListItemLayoutBinding


class SnapViewHolder (val tiernan: ListItemLayoutBinding) :
    RecyclerView.ViewHolder(tiernan.root) {

    private lateinit var currentSnap: Snap

    init {
        tiernan.root.setOnClickListener { view ->
            val action = MainFragmentDirections.actionMainFragmentToPrankSnapFragment()
            tiernan.root.findNavController().navigate(action)
            currentSnap.opened = true
            setSnapStatus()
        }
    }

    fun bindSnap(snap: Snap) {
        currentSnap = snap
        tiernan.username.text = currentSnap.username
        tiernan.time.text = currentSnap.time
        tiernan.image.setImageResource(currentSnap.profileID)
        setSnapStatus()
    }
    fun setSnapStatus() {
        tiernan.status.text = currentSnap.status
        tiernan.redThing.setImageResource((currentSnap.rectangleID).toInt())
        tiernan.status.setTextColor(currentSnap.textColor)
    }
}