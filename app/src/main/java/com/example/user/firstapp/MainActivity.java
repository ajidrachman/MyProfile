package com.example.user.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int hitungData = 0;
        String x = "dhdjdgshdj";
        boolean y = true;
        boolean z = false;

        final ImageView imageProfil;
        imageProfil = (ImageView) findViewById(R.id.img_profil);

        Button btnHalo;
        btnHalo = (Button) findViewById(R.id.btn_halo);

        btnHalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //on button clicked
                Toast.makeText(MainActivity.this, "Hai Jhonny!", Toast.LENGTH_SHORT).show();
                imageProfil.setImageResource(R.drawable.checked);
                imageProfil.setAlpha(0f);
                imageProfil.animate().alpha(1f).setDuration(1500);
            }
        });
    }
}
