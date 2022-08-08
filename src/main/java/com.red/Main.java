package com.red;

public class Main {

    public static void main(String[] args) {
      task(2); //tasks 1-4
    }

    private static void task(int i){
        switch (i){
            case 1: RockPaperScissors.play();
                break;
            case 2: DogGenetics.action();
                break;
            case 3: HealthyHearts.action();
                break;
            case 4: SummativeSums.action();
                break;
            default: System.out.println("There's no such task");
                break;
        }
    }
}