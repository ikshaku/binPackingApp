package com.bk.binpacking.RecyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bk.binpacking.R;

import java.util.List;

/**
 * Created by bk on 02-05-2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder> {
    public List<Bin> listdata;
    LayoutInflater inflater;
    Context context;
    public MyAdapter(Context context,List<Bin> listdata){
        this.context=context;
        this.listdata=listdata;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.bin_li, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        Bin bin = listdata.get(position);
        String text="";
        for (int i=0;i<bin.container.size();i++)
        {
            text+=bin.container.get(i)+"\n";
        }
        holder.bin.setText(text);
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    class Holder extends RecyclerView.ViewHolder
    {
        TextView bin;
        public Holder(View itemView) {
            super(itemView);
            bin=(TextView)itemView.findViewById(R.id.binTV);
        }
    }
}
