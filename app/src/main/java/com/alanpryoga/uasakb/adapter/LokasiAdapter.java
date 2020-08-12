/**
 * NIM      : 10117210
 * Nama     : Ade Syahlan Prayoga
 * Kelas    : IF-7
 */
package com.alanpryoga.uasakb.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alanpryoga.uasakb.R;
import com.alanpryoga.uasakb.data.model.Lokasi;
import com.alanpryoga.uasakb.ui.LokasiActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class LokasiAdapter extends RecyclerView.Adapter<LokasiAdapter.LokasiViewHolder> {

    private Context context;

    private ArrayList<Lokasi> list;

    public LokasiAdapter(ArrayList<Lokasi> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public LokasiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.card_item, parent, false);

        context = parent.getContext();

        return new LokasiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LokasiViewHolder holder, final int position) {
        holder.nama.setText(list.get(position).getNama());
        holder.deskripsi.setText(list.get(position).getDeskripsi());

        Picasso.with(context)
                .load(list.get(position).getGambar())
                .into(holder.gambar);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, LokasiActivity.class);
                intent.putExtra("nama", list.get(position).getNama());
                intent.putExtra("deskripsi", list.get(position).getDeskripsi());
                intent.putExtra("gambar", list.get(position).getGambar());
                intent.putExtra("longitude", list.get(position).getLongitude());
                intent.putExtra("latitude", list.get(position).getLatitude());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (this.list != null) ? this.list.size() : 0;
    }

    public class LokasiViewHolder extends RecyclerView.ViewHolder {
        private TextView nama;

        private TextView deskripsi;

        private ImageView gambar;

        public LokasiViewHolder(@NonNull View itemView) {
            super(itemView);

            nama = (TextView) itemView.findViewById(R.id.nama);
            deskripsi = (TextView) itemView.findViewById(R.id.deskripsi);
            gambar = (ImageView) itemView.findViewById(R.id.gambar);
        }
    }
}
