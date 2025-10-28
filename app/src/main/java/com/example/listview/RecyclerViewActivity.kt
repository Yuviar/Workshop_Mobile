package com.example.listview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listview.adapter.MahasiswaAdapter
import com.example.listview.model.Mahasiswa

class RecyclerViewActivity : AppCompatActivity() {
    private val data_list = ArrayList<Mahasiswa>();
    private val adapter = MahasiswaAdapter(data_list);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        addData()
        setContentView(R.layout.activity_recycler_view)
        val recyclerView = findViewById<RecyclerView>(R.id.rec_view_mhs);
        recyclerView.layoutManager = LinearLayoutManager(this);
        recyclerView.adapter = adapter
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun addData(){
        data_list.add(Mahasiswa("Yuviar Nuzul", "E0987654", "DIV - Teknik Informatika","10-01-2000","08123456789","Laki-laki","Jl. Merdeka No. 1"));
        data_list.add(Mahasiswa("Nabila Windy", "E0983454", "DIV - Teknik Informatika","15-05-2001","08765432109","Perempuan","Jl. Sudirman No. 2"));
        data_list.add(Mahasiswa("Raya Ghaniyya", "E0979254", "DIV - Teknik Informatika","20-09-2000","08555544433","Laki-laki","Jl. Diponegoro No. 3"));
        data_list.add(Mahasiswa("Achmad Alisyahbana", "E0911234", "DIV - Teknik Informatika","25-03-2000","08112233445","Laki-laki","Jl. Pahlawan No. 7"));
        data_list.add(Mahasiswa("Chairunisya Cici", "E0956789", "DIV - Teknik Informatika","01-08-2002","08998877665","Perempuan","Jl. Mawar No. 10"));
    }
}