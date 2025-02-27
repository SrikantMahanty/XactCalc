package com.srikant.xactcalc.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.srikant.xactcalc.databinding.RecyclerRowBinding
import com.srikant.xactcalc.model.History
import java.util.ArrayList

class HistoryAdapter: RecyclerView.Adapter<HistoryAdapter.MyViewHolder>() {

    var historyList= ArrayList<History>()

    class MyViewHolder(val binding:RecyclerRowBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val i = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(i)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.binding.islemText.text = historyList.get(position).process
        holder.binding.sonucText.text = historyList.get(position).result
    }

    override fun getItemCount(): Int {
        return historyList.size
    }

    fun setData(history: List<History>){
        historyList = history as ArrayList<History>
        notifyDataSetChanged()
    }
}