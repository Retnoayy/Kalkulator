package com.retno.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText angkaPertamaEditText, angkaTerakhirEditText;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angkaPertamaEditText = findViewById(R.id.angkapertama);
        angkaTerakhirEditText = findViewById(R.id.angkaterakhir);
        hasilTextView = findViewById(R.id.hasil);

        Button penjumlahanButton = findViewById(R.id.penjumlahan);
        Button penguranganButton = findViewById(R.id.pengurangan);
        Button perkalianButton = findViewById(R.id.perkalian);
        Button pembagianButton = findViewById(R.id.pembagian);

        penjumlahanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungPenjumlahan();
            }
        });

        penguranganButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungPengurangan();
            }
        });

        perkalianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungPerkalian();
            }
        });

        pembagianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungPembagian();
            }
        });
    }

    private void hitungPenjumlahan() {
        double angkaPertama = Double.parseDouble(angkaPertamaEditText.getText().toString());
        double angkaTerakhir = Double.parseDouble(angkaTerakhirEditText.getText().toString());
        double hasil = angkaPertama + angkaTerakhir;
        hasilTextView.setText(String.valueOf(hasil));
    }

    private void hitungPengurangan() {
        double angkaPertama = Double.parseDouble(angkaPertamaEditText.getText().toString());
        double angkaTerakhir = Double.parseDouble(angkaTerakhirEditText.getText().toString());
        double hasil = angkaPertama - angkaTerakhir;
        hasilTextView.setText(String.valueOf(hasil));
    }

    private void hitungPerkalian() {
        double angkaPertama = Double.parseDouble(angkaPertamaEditText.getText().toString());
        double angkaTerakhir = Double.parseDouble(angkaTerakhirEditText.getText().toString());
        double hasil = angkaPertama * angkaTerakhir;
        hasilTextView.setText(String.valueOf(hasil));
    }

    private void hitungPembagian() {
        double angkaPertama = Double.parseDouble(angkaPertamaEditText.getText().toString());
        double angkaTerakhir = Double.parseDouble(angkaTerakhirEditText.getText().toString());
        if (angkaTerakhir == 0) {
            Toast.makeText(MainActivity.this, "Tidak bisa dibagi dengan 0", Toast.LENGTH_SHORT).show();
            return;
        }
        double hasil = angkaPertama / angkaTerakhir;
        hasilTextView.setText(String.valueOf(hasil));
    }
}
