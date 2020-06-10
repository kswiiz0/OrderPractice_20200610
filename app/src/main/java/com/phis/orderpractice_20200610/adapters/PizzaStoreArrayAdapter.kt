package com.phis.orderpractice_20200610.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.phis.orderpractice_20200610.R
import com.phis.orderpractice_20200610.datas.Store
import de.hdodenhof.circleimageview.CircleImageView
import java.util.zip.Inflater

class PizzaStoreArrayAdapter(context: Context, resId: Int, list: List<Store>) :
    ArrayAdapter<Store>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        tempRow?.let {

        }.let {
            tempRow = inf.inflate(R.layout.listview_item_pizza_store, null)
        }

        val row = tempRow!!
        val civImg = row.findViewById<CircleImageView>(R.id.civImg)
        val tvName = row.findViewById<TextView>(R.id.tvPizzaStoreName)

        val store: Store = mList[position]

        Glide.with(mContext)
            .load(store.imgUrl)
            .into(civImg)

        tvName.text = store.name
        return row
    }


}