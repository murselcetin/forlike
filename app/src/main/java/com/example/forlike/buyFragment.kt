package com.example.forlike

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.forlike.databinding.FragmentBuyBinding


class buyFragment : Fragment() {
    private lateinit var binding: FragmentBuyBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBuyBinding.inflate(inflater, container, false)

        binding.rv.layoutManager = LinearLayoutManager(requireContext())

        val creditList = ArrayList<Credit>()
        val c1 = Credit(1, 50, 6.99, 9.99)
        val c2 = Credit(2, 100, 12.99, 24.99)
        val c3 = Credit(3, 250, 26.99, 55.99)
        creditList.add(c1)
        creditList.add(c2)
        creditList.add(c3)

        val adapter = CreditAdapter(requireContext(), creditList)
        binding.rv.adapter = adapter

        return binding.root
    }
}
