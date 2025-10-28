package com.example.listview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listview.R;
import com.example.listview.model.Mahasiswa;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

    private ArrayList<Mahasiswa> data_list;

    public MahasiswaAdapter(ArrayList<Mahasiswa> data_list) {
        this.data_list = data_list;
    }

    @NonNull
    @Override
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }

    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {
        holder.txtNamaLengkap.setText(data_list.get(position).getNama_lengkap());
        holder.txtNim.setText(data_list.get(position).getNim());
        holder.txtProdi.setText(data_list.get(position).getProdi());
        holder.imgPerson.setImageResource(R.drawable.ic_person);
        holder.txtJenisKelamin.setText(data_list.get(position).getJenis_kelamin());
        holder.txtTanggalLahir.setText(data_list.get(position).getTgl_lahir());
        holder.txtNoHp.setText(data_list.get(position).getNo_hp());
        holder.txtAlamat.setText(data_list.get(position).getAlamat());
    }

    @Override
    public int getItemCount() {
        return (data_list != null)?data_list.size():0;
    }
    public static class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNamaLengkap, txtNim, txtProdi, txtAlamat, txtJenisKelamin, txtTanggalLahir, txtNoHp;
        private ImageView imgPerson;

        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNamaLengkap = itemView.findViewById(R.id.txt_nama_lengkap);
            txtNim = itemView.findViewById(R.id.txt_nim);
            txtProdi = itemView.findViewById(R.id.txt_prodi);
            imgPerson = itemView.findViewById(R.id.img_person);
            txtJenisKelamin = itemView.findViewById(R.id.txt_jenis_kelamin);
            txtTanggalLahir = itemView.findViewById(R.id.txt_tanggal_lahir);
            txtNoHp = itemView.findViewById(R.id.txt_no_hp);
            txtAlamat = itemView.findViewById(R.id.txt_alamat);
        }
    }
}
