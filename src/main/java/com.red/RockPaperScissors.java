package com.red;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static int round(int userInput){
        Random random = new Random();
        int pc = random.nextInt(3)+1;
        System.out.println("Opponent's choice - " + define_choice(pc));
        return userInput == pc ? 0 : userInput == 1 ? (pc == 2 ? 2 : 1) : (userInput==2 ? (pc == 1 ? 1 : 2) : (userInput==3 ? (pc == 2 ? 1 : 2) : 0));
    }

    private static String define_choice(int choice){
        return choice == 1 ? "Rock" : choice == 2 ? "Paper" : choice == 3 ? "Scissors" : "Something went wrong";
    }

    private static String show_res(int res){
        return res == 1 ? "You Won!!!" : res == 2 ? "You Lost!!!" : res == 0 ? "It's a tie!!!" : "Something went wrong";
    }

    private static String show_res(int[] res){
        return res[1]>res[2] ? "You won the game!!!" : res[1]<res[2] ? "You lost the game!!!" : "It's a tie!!!";
    }

    private static int[] game(int iter, Scanner scanner){
        int[] results = new int[3];
        for(int i=0;i<iter;i++){
            System.out.println("Game №" + (i+1) + "\nMake your choice - (1 = Rock, 2 = Paper, 3 = Scissors) ");
            int temp = scanner.nextInt();
            if(temp<1||temp>3){
                i--;
                System.out.println("Try again!!!");
                continue;
            }
            System.out.println("Your choice is - " + define_choice(temp));
            int temp_res = round(temp);
            results[temp_res]++;
            System.out.println(show_res(temp_res) + "\nStatistics: Wins - " + results[1] + " Loses - " + results[2] + " Ties - " + results[0]);
        }
        return results;
    }
    public static void play(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game !!!\nHow many rounds do you want to play (1-10):");
        int iter = scanner.nextInt();
        if(iter<1||iter>10) throw new RuntimeException("Wrong number of rounds");
        int[] results = game(iter,scanner);
        System.out.println(show_res(results) + "\nDo you want to play again? Yes or No");
        scanner.nextLine();
        if(scanner.nextLine().toLowerCase().equals("yes")) play();
    }

}
