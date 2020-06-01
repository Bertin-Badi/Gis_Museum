package com.example.gismuseumdibali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    TextView dataNama,dataAlamat,dataTelepon;
    Button btnCall;
    ImageView dataGambar;

    public static String id,nama,alamat,telepon,gambar;
    public static Double latitude,longitude;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_detail);

        dataNama = findViewById (R.id.data_nama);
        dataAlamat = findViewById (R.id.data_alamat);
        dataTelepon = findViewById (R.id.data_telepon);
        btnCall = findViewById (R.id.btn_call);
        dataGambar = findViewById (R.id.data_gambar);

        Picasso.get().load(gambar).into(dataGambar);

        dataNama.setText (nama);
        dataAlamat.setText (alamat);
        dataTelepon.setText (telepon);

        btnCall.setOnClickListener (this);

    }

    @Override
    public void onClick(View v) {
        Intent call = new Intent (Intent.ACTION_DIAL, Uri.parse ("tel:"+telepon ));
        startActivity (call);
    }
}
