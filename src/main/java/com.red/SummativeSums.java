package com.red;

public class SummativeSums {

    private static int sum(int[] arr){
        int sum = 0;
        for(int i:arr) sum+=i;
        return sum;
    }

    public static void action(){
        int[][] arr = {{ 1, 90, -33, -55, 67, -16, 28, -55, 15 },
                { 999, -60, -77, 14, 160, 301 },
                { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 }};
        for(int[] j:arr) System.out.println("Array sum - " + sum(j));
    }
}
