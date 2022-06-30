package dev.nakayiza.recyclerviewsassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class number_recyclerview_adapetr (var numberList:List<Int>):RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
            var itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.number_list_items, parent, false)
            return NumbersViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
            holder.tvnum.text = numberList.get(position).toString()
        }

        override fun getItemCount(): Int {
            return numberList.size
        }

}
class NumbersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvnum=itemView.findViewById<TextView>(R.id.tvnum)
    }
