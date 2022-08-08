package com.red;

import java.util.Scanner;

public class HealthyHearts {

    private static int[] range(int age){
        int[] range = new int[3];
        range[0] = 220 - age;
        range[1] = (int) (range[0]*0.5);
        range[2] = (int) (range[0]*0.85);
        return range;
    }

    public static void action(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int[] range = range(scanner.nextInt());
        System.out.println("Your maximum heart rate should be  "+ range[0] +"  beats per minute\n" +
                "Your target HR Zone is " + range[1] + " - " +  range[2] + " beats per minute");
    }
}
