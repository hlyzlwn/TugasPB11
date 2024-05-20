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

public class KotakMasuk1Activity extends AppCompatActivity {

    private ImageButton btnkotakmasuk2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kotak_masuk1);

        btnkotakmasuk2 = findViewById(R.id.btnkotakmasuk2);
        klik();
    }

    void klik(){
        btnkotakmasuk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnkotakmasuk1 = new Intent(KotakMasuk1Activity.this, KotakMasuk2Activity.class);
                startActivity(btnkotakmasuk1);
            }
        });
    }
}