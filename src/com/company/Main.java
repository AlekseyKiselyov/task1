package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CycleArray array = new CycleArray(Integer.parseInt(args[0]));
        int step = Integer.parseInt(args[1]) - 1;
        int left = array.getElement(0);
        int right ;
        ArrayList<Integer> path = new ArrayList<Integer>();
        for (int i = step ; true ; i = i + step){
            path.add(left);
            right = array.getElement(i);
            if (right == 1){
                break;
            }
            left = right;
        }
        for (Integer i : path){
            System.out.print(i);
        }
        System.out.println();

        // write your code here
    }
}
