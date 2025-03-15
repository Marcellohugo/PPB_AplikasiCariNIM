package com.example.aplikasinim;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi komponen
        EditText etNama = findViewById(R.id.etNama);
        EditText etNim = findViewById(R.id.etNim);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        TextView tvHasil = findViewById(R.id.tvHasil);

        // Event Listener untuk tombol Submit
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString().trim();
                String nim = etNim.getText().toString().trim();

                if (!nama.isEmpty() && !nim.isEmpty()) {
                    tvHasil.setText("Nama: " + nama + "\nNIM: " + nim);
                } else {
                    tvHasil.setText("Harap masukkan Nama dan NIM!");
                }
            }
        });
    }
}