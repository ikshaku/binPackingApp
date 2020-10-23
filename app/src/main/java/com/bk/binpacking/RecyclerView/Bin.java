package com.bk.binpacking.RecyclerView;

import java.util.ArrayList;

/**
 * Created by bk on 02-05-2017.
 */

class Bin {
    public ArrayList<Integer> container = new ArrayList<>();
    int freeSpace = 0, capacity;

    public Bin(int capacity, int item) {
        this.capacity = capacity;
        if (freeSpace == 0 && container.size() == 0) {
            freeSpace = capacity;
            freeSpace -= item;
        } else {
            freeSpace -= item;
        }
        container.add(item);
    }

    void add(int item) {
        container.add(item);
        freeSpace-=item;
    }
}
