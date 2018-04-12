package com.example.fernana6.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.View;

import me.rishabhkhanna.recyclerswipedrag.OnDragListener;
import me.rishabhkhanna.recyclerswipedrag.OnSwipeListener;
import me.rishabhkhanna.recyclerswipedrag.RecyclerHelper;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    MyRecyclerViewAdapter adapter;
    public static final String TAG = "MainActivity";

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
        final RecyclerView recyclerView = findViewById(R.id.rvPersonas);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, personas);
        //adapter.setClickListener(this);

        recyclerView.setAdapter(adapter);

        final RecyclerHelper touchHelper = new RecyclerHelper<Persona>(personas, (RecyclerView.Adapter) adapter);
        touchHelper.setRecyclerItemDragEnabled(true).setOnDragItemListener(new OnDragListener() {
            @Override
            public void onDragItemListener(int fromPosition, int toPosition) {
                Log.d(TAG, "onDragItemListener: callback after dragging recycler view item");
            }
        });

        touchHelper.setRecyclerItemSwipeEnabled(true).setOnSwipeItemListener(new OnSwipeListener() {
            @Override
            public void onSwipeItemListener() {
                Log.d(TAG, "onSwipeItemListener: callback after swiping recycler view item");
            }
        });
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(touchHelper);
        itemTouchHelper.attachToRecyclerView(recyclerView);


    }

    /*@Override
    public void onItemClick(View view, int position) {
        //Toast.makeText(this, "You clicked " +  adapter.getItem(position).toString() + " on row number " + position, Toast.LENGTH_SHORT).show();
    }*/

}