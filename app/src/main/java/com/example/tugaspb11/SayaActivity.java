package com.example.tugaspb11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SayaActivity extends AppCompatActivity {

    private ImageButton btnprofil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_saya);

        btnprofil = findViewById(R.id.btnprofil);
        klik();
    }

    void klik(){
        btnprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnprofil = new Intent(SayaActivity.this, ProfilActivity.class);
                startActivity(btnprofil);
            }
        });
    }
}