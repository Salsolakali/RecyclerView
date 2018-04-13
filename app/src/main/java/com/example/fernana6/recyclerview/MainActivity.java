package com.example.fernana6.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Alberto", "Fernandez", "sucorreo"));
        personas.add(new Persona("Alberto", "Fernandez", "sucorreo"));
        personas.add(new Persona("Alberto", "Fernandez", "sucorreo"));
        personas.add(new Persona("Alberto", "Fernandez", "sucorreo"));
        personas.add(new Persona("Alberto", "Fernandez", "sucorreo"));
        personas.add(new Persona("Alberto", "Fernandez", "sucorreo"));
        personas.add(new Persona("Alberto", "Fernandez", "sucorreo"));
        personas.add(new Persona("Alberto", "Fernandez", "sucorreo"));
        personas.add(new Persona("DAvid", "Fernandez", "sucorreo"));
        personas.add(new Persona("Patri", "Fernandez", "sucorreo"));
        personas.add(new Persona("Luis", "Fernandez", "sucorreo"));
        personas.add(new Persona("Fer", "Fernandez", "sucorreo"));
        personas.add(new Persona("Miguel", "Fernandez", "sucorreo"));
        personas.add(new Persona("Otro david", "Fernandez", "sucorreo"));
        personas.add(new Persona("Señor Tumnus", "Fernandez", "sucorreo"));
        personas.add(new Persona("Cristobal Colon", "Fernandez", "sucorreo"));

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvPersonas);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, personas);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {

        Toast.makeText(this, "You clicked " +
                adapter.getItem(position).getName() + " " +  adapter.getItem(position).getSurname()
                + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}
