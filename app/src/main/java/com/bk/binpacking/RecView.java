package com.bk.binpacking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.bk.binpacking.RecyclerView.Data;
import com.bk.binpacking.RecyclerView.MyAdapter;

public class RecView extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView=(RecyclerView)findViewById(R.id.recView);
        int[] inputs=getIntent().getExtras().getIntArray("inputArray");
        int capacity=getIntent().getExtras().getInt("capacity");
        Data d=new Data(inputs,capacity);
        adapter=new MyAdapter(this,d.getList());
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);
    }
}
