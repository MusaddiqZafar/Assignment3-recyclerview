package com.example.assignment4recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recylerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recylerView = findViewById(R.id.recylerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recylerView.setLayoutManager(layoutManager);

        List<ModelClass>modelClassList = new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.a,"The Usual","horror,comedy,Fight"));
        modelClassList.add(new ModelClass(R.drawable.b,"Student of the year","horror,comedy,Fight"));
        modelClassList.add(new ModelClass(R.drawable.c,"Confusion","horror,comedy,Fight"));
        modelClassList.add(new ModelClass(R.drawable.d,"Revenge","horror,comedy,Fight"));
        modelClassList.add(new ModelClass(R.drawable.e,"Madaari","horror,comedy,Fight"));
        modelClassList.add(new ModelClass(R.drawable.a,"The Usual","horror,comedy,Fight"));
        modelClassList.add(new ModelClass(R.drawable.b,"Student of the year","horror,comedy,Fight"));
        modelClassList.add(new ModelClass(R.drawable.c,"Confusion","horror,comedy,Fight"));

        Adapter adapter = new Adapter(modelClassList);
        recylerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}
