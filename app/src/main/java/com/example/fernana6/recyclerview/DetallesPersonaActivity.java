package com.example.fernana6.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetallesPersonaActivity extends AppCompatActivity {

    TextView tvName, tvSurname, tvEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_persona);

        tvName = findViewById(R.id.tvName);
        tvSurname = findViewById(R.id.tvSurname);
        tvEmail = findViewById(R.id.tvEmail);

        tvName.setText(getIntent().getStringExtra("name"));
        tvSurname.setText(getIntent().getStringExtra("surname"));
        tvEmail.setText(getIntent().getStringExtra("email"));
    }
}
