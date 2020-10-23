package com.bk.binpacking.RecyclerView;

import java.util.ArrayList;

/**
 * Created by bk on 02-05-2017.
 */

public class ListItem {
    ArrayList<Bin> finalAnswers;
    ListItem(ArrayList<Bin> inputWeights){
        this.finalAnswers =inputWeights;
    }
}
