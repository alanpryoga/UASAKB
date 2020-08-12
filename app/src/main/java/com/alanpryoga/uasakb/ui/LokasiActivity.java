/**
 * NIM      : 10117210
 * Nama     : Ade Syahlan Prayoga
 * Kelas    : IF-7
 */
package com.alanpryoga.uasakb.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.alanpryoga.uasakb.R;
import com.squareup.picasso.Picasso;

public class LokasiActivity extends AppCompatActivity {

    private String nama;

    private String deskripsi;

    private String gambar;

    private String longitude;

    private String latitude;

    private TextView namaDetail;

    private ImageView gambarDetail;

    private TextView deskripsiDetail;

    private WebView mapDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lokasi);

        nama = getIntent().getStringExtra("nama");
        deskripsi = getIntent().getStringExtra("deskripsi");
        gambar = getIntent().getStringExtra("gambar");
        longitude = getIntent().getStringExtra("longitude");
        latitude = getIntent().getStringExtra("latitude");

        namaDetail = (TextView) findViewById(R.id.nama_detail);
        gambarDetail = (ImageView) findViewById(R.id.gambar_detail);
        deskripsiDetail = (TextView) findViewById(R.id.deskripsi_detail);
        mapDetail = (WebView) findViewById(R.id.map_detail);
        mapDetail.getSettings().setJavaScriptEnabled(true);
        mapDetail.setWebViewClient(new WebViewClient());

        namaDetail.setText(nama);
        Picasso.with(this)
                .load(gambar)
                .into(gambarDetail);
        deskripsiDetail.setText(deskripsi);
        mapDetail.loadUrl("https://maps.google.com/maps?q=" + latitude + "," + longitude + "&z=14");
    }
}