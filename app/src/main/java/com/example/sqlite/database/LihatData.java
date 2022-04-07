package com.example.sqlite.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.sqlite.R;

public class LihatData extends AppCompatActivity {

    TextView tvNama, tvTelpon;

    String nama, telpon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_data);

        tvNama = findViewById(R.id.tvDtlNama);
        tvTelpon = findViewById(R.id.tvDtlTelepon);

        Bundle bundle = getIntent().getExtras();

        nama = bundle.getString("nama");
        telpon = bundle.getString("telpon");

        tvNama.setText(nama);
        tvTelpon.setText(telpon);
    }
}