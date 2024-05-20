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

public class KotakMasuk2Activity extends AppCompatActivity {

    private ImageButton btnsaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kotak_masuk2);

        btnsaya = findViewById(R.id.btnsaya);
        klik();
    }

    void klik(){
        btnsaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnsaya = new Intent(KotakMasuk2Activity.this, SayaActivity.class);
                startActivity(btnsaya);
            }
        });
    }
}