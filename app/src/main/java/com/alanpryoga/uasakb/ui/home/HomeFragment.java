/**
 * Tanggal Pengerjaan   : 08/08/2020
 * NIM                  : 10117210
 * Nama                 : Ade Syahlan Prayoga
 * Kelas                : IF-7
 */
package com.alanpryoga.uasakb.ui.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alanpryoga.uasakb.R;
import com.alanpryoga.uasakb.adapter.LokasiAdapter;
import com.alanpryoga.uasakb.data.model.Lokasi;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements HomeContract.View {

    private RecyclerView recyclerView;

    private LokasiAdapter adapter;

    private ArrayList<Lokasi> arrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        addData();

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        adapter = new LokasiAdapter(arrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        arrayList = new ArrayList<>();
        arrayList.add(new Lokasi(1, "Air Panas Cibolang", "Objek wisata Pangalengan memang menjadi destinasi utama wisatawan lokal maupun mancanegara yang sedang liburan ke Bandung. Alasannya bisa kita lihat dan rasakan dari tempatnya yang memang berhawa sejuk dengan suhu udara antara 12 – 28 oC, dengan pemandangan alam yang alami, asri, dan segar, seperti di kawasan Cibolang.", "https://infopromodiskon.com/userfiles/uploads/pemandian-air-panas-cibolang-bandung-4.jpg", "107.617314","-7.232514"));
        arrayList.add(new Lokasi(2, "Air Panas Cimanggu", "Wisata pemandian air panas Cimanggu sudah menjadi destinasi banyak orang yang sedang berkunjung ke Ciwidey, Bandung bagian selatan. Kolam tersebut terletak di Cimanggu. Destinasi pemandian air panas ini cocok untuk para pengujung yang datang dari ibu kota untuk melepas penat setelah aktifitas yang padat dan perjalanan yang cukup jauh tentunya.", "https://infopromodiskon.com/userfiles/uploads/taman-wisata-alam-air-panas-cimanggu-3.jpg", "107.39036", "-7.146564"));
    }
}