package com.example.forlike

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.forlike.databinding.BuyRecyclerviewBinding

class CreditAdapter(var mContext: Context, var creditList: List<Credit>) :
    RecyclerView.Adapter<CreditAdapter.CreditCardDesign>() {
    inner class CreditCardDesign(binding: BuyRecyclerviewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var binding: BuyRecyclerviewBinding

        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CreditCardDesign {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = BuyRecyclerviewBinding.inflate(layoutInflater, parent, false)
        return CreditCardDesign(binding)
    }

    override fun onBindViewHolder(holder: CreditCardDesign, position: Int) {
        val credit = creditList[position]
        val t = holder.binding
        t.creditTextView.text = "${credit.credit_piece} KREDİ"
        t.priceTextView.text = "${credit.credit_price} ₺"
        t.dPriceTextView.text = "${credit.credit_dprice} ₺"
    }

    override fun getItemCount(): Int {
        return creditList.size
    }
}