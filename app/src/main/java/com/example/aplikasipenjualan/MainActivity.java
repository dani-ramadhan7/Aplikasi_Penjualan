package com.example.aplikasipenjualan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNamaPelanggan;
    EditText etNamaBarang;
    EditText etJmlBarang;
    EditText etHarga;
    EditText etJmlUang;
    Button btnProses;
    Button btnHapus;
    Button btnKeluar;
    TextView tvNamaPembeli;
    TextView tvNamaBarang;
    TextView tvJmlBarang;
    TextView tvHarga;
    TextView tvUangBayar;
    TextView tvTotal;
    TextView tvKembalian;
    TextView tvBonus;
    TextView tvKeterangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNamaPelanggan = findViewById(R.id.etNamaPelanggan);
        etNamaBarang = findViewById(R.id.etNamaBarang);
        etJmlBarang = findViewById(R.id.etJmlBarang);
        etHarga = findViewById(R.id.etHarga);
        etJmlUang = findViewById(R.id.etJmlUang);
        btnProses = findViewById(R.id.btnProses);
        btnHapus = findViewById(R.id.btnHapus);
        btnKeluar = findViewById(R.id.btnKeluar);
        tvNamaPembeli = findViewById(R.id.tvNamaPembeli);
        tvNamaBarang = findViewById(R.id.tvNamaBarang);
        tvJmlBarang = findViewById(R.id.tvJmlBarang);
        tvHarga = findViewById(R.id.tvHarga);
        tvUangBayar = findViewById(R.id.tvUangBayar);
        tvTotal = findViewById(R.id.tvTotal);
        tvKembalian = findViewById(R.id.tvKembalian);
        tvBonus = findViewById(R.id.tvBonus);
        tvKeterangan = findViewById(R.id.tvKeterangan);

        btnProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NamaPembeli = etNamaPelanggan.getText().toString();
                String NamaBarang = etNamaBarang.getText().toString();
                int JmlBarang = Integer.parseInt(etJmlBarang.getText().toString());
                int Harga = Integer.parseInt(etHarga.getText().toString());
                int JmlUang = Integer.parseInt(etJmlUang.getText().toString());
                double Total = JmlBarang * Harga;
                double Kembalian = JmlUang - Total;
                String Bonus = "SSD 1TB";
                String Keterangan = "Tunggu kembalian";

                tvNamaPembeli.setText("Nama Pembeli : " + NamaPembeli);
                tvNamaBarang.setText("Nama Barang : " + NamaBarang);
                tvJmlBarang.setText("Jumlah Barang : " + JmlBarang);
                tvHarga.setText("Harga Barang : " + Harga);
                tvUangBayar.setText("Uang Bayar : " + JmlUang);
                tvTotal.setText("Total Belanja : " + Total);
                tvKembalian.setText("Uang Kembalian : " + Kembalian);
                tvBonus.setText("Bonus : " + Bonus);
                tvKeterangan.setText("Keterangan : " + Keterangan);
            }
        });

        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NamaPembeli = "";
                String NamaBarang = "";
                int JmlBarang = 0;
                int Harga = 0;
                int JmlUang = 0;
                double Total = JmlBarang * Harga;
                double Kembalian = JmlUang - Total;
                String Bonus = "";
                String Keterangan = "";

                tvNamaPembeli.setText("Nama Pembeli : " + NamaPembeli);
                tvNamaBarang.setText("Nama Barang : " + NamaBarang);
                tvJmlBarang.setText("Jumlah Barang : " + JmlBarang);
                tvHarga.setText("Harga Barang : " + Harga);
                tvUangBayar.setText("Uang Bayar : " + JmlUang);
                tvTotal.setText("Total Belanja : " + Total);
                tvKembalian.setText("Uang Kembalian : " + Kembalian);
                tvBonus.setText("Bonus : " + Bonus);
                tvKeterangan.setText("Keterangan : " + Keterangan);
            }
        });

        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}