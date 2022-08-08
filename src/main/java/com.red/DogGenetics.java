package com.red;

import java.util.*;

public class DogGenetics {

    private static void show_stat(int[] arr){
        List<String> dogs = new ArrayList<String>(){{
            add("St. Bernard");
            add("Chihuahua");
            add("Dramatic RedNosed Asian Pug");
            add("Common Cur");
            add("King Doberman");
        }};
        Collections.shuffle(dogs);
        System.out.println(arr[0] + "% " + dogs.get(0) + "\n" +
                arr[1] + "% "+ dogs.get(1) +"\n" +
                arr[2] + "% "+ dogs.get(2) +"\n" +
                arr[3] + "% "+ dogs.get(3) +"\n" +
                arr[4] + "% "+ dogs.get(4));
    }


    private static int[] gen_stat(){
        Random random = new Random();
        int sum = 0;
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(101-sum);
            sum += arr[i];
        }
        return arr;
    }

    public static void action(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        String name = sc.nextLine();
        System.out.println("Well then, I have this highly reliable report on "+ name +"'s prestigious background right here.\n\n" +
               name + " is:");
        show_stat(gen_stat());
    }
}
