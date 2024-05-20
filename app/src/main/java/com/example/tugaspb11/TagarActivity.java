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

public class TagarActivity extends AppCompatActivity {

    private ImageButton btnkotakmasuk1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tagar);

        btnkotakmasuk1 = findViewById(R.id.btnkotakmasuk1);
        klik();
    }

    void klik(){
        btnkotakmasuk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnkotakmasuk1 = new Intent(TagarActivity.this, KotakMasuk1Activity.class);
                startActivity(btnkotakmasuk1);
            }
        });
    }
}