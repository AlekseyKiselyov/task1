package com.company;

import java.util.Arrays;

public class CycleArray {
    private int[] array;
    private int length;


    public CycleArray(int length) {
        this.length = length;
        this.array = new int[length];
        for (int i = 0; i<length; i++){
            array[i] = i+1;
        }
    }
    public int getElement(int position){
        return array[position%length];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
