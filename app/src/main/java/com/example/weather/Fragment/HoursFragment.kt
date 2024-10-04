package com.example.weather.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weather.Adapters.WeatherAdapter
import com.example.weather.Adapters.WeatherModel
import com.example.weather.R
import com.example.weather.databinding.FragmentHoursBinding
import com.example.weather.databinding.FragmentMainBinding


class HoursFragment : Fragment() {
    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WeatherAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHoursBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()

    }
    private fun initRcView() = with(binding){
         rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcView.adapter = adapter
        val list = listOf(WeatherModel(
            " ", "12:00", "Sunny",
            "20°C", "",
            "", "", ""),
            WeatherModel(
            " ", "13:00", "Sunny",
            "24°C", "",
            "", "", ""),
            WeatherModel(
                " ", "14:00", "Sunny",
                "26°C", "",
                "", "", "")
            )
        adapter.submitList(list)

    }

    companion object {

        @JvmStatic
        fun newInstance() = HoursFragment()
    }
}