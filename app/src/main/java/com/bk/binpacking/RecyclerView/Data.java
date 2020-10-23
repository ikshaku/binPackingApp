package com.bk.binpacking.RecyclerView;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bk on 02-05-2017.
 */

public class Data {
    ArrayList<ListItem> list=new ArrayList<>();
    ArrayList<Bin> bins=new ArrayList<>();
    String status;
    public Data(int[] inputs,int capacity){
        for (int i = 0; i < inputs.length; i++) {
            if (bins.size() == 0) {
                System.out.println("New bin created");
                bins.add(new Bin(capacity, inputs[i]));
            } else {
                for (Bin bin : bins) {
                    status = "notPlaced";
                    if (bin.freeSpace >= inputs[i]) {
                        bin.add(inputs[i]);
                        System.out.println("Added to "+bin.freeSpace);
                        status = "Placed";
                        break;
                    }
                }//100 98 96 93 91 87 81 59 58 55 50 43 22 21 20 15 14 10 8 6 5 4 3 1
                if (!(status.equals("Placed")))
                {
                    bins.add(new Bin(capacity, inputs[i]));
                }
            }
        }
    }
    public List getList(){
        for (Bin bin:bins){
            for (int i:bin.container){
                Log.d("See this",i+"");
            }
        }
        return bins;
    }
}
