package com.example.tokodfaa.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.tokodfaa.R
import com.example.tokodfaa.adapter.AdapterProduk
import com.example.tokodfaa.adapter.AdapterSlider
import com.example.tokodfaa.model.Produk


/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    lateinit var vp_slider: ViewPager
    lateinit var rvProduk:RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        vp_slider = view.findViewById(R.id.vp_slider)
        rvProduk = view.findViewById(R.id.rv_produk)

        val arrSlider = ArrayList<Int>()
        arrSlider.add(R.drawable.slider1)
        arrSlider.add(R.drawable.slider2)
        arrSlider.add(R.drawable.slider3)

        val adapterSlider = AdapterSlider(arrSlider, activity)
        vp_slider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        rvProduk.adapter = AdapterProduk(arrProduk)
        rvProduk.layoutManager = layoutManager

        return view
    }

    val arrProduk: ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "Uniqlo BT21"
        p1.harga = "Rp.45.000"
        p1.gambar = R.drawable.beteduasatu

        val p2 = Produk()
        p2.nama = "Uniqlo Mickey"
        p2.harga = "Rp.45.000"
        p2.gambar = R.drawable.mickey

        val p3 = Produk()
        p3.nama = "Uniqlo Snoopy"
        p3.harga = "Rp.50.000"
        p3.gambar = R.drawable.snoopy

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }
}