package com.red;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static int round(int userInput){
        Random random = new Random();
        int pc = random.nextInt(3)+1;
        System.out.println("Opponent's choice - " + define_choice(pc));
        int res = 0;
        if(userInput == pc) return 0;
        switch (userInput){
            case 1:
                if(pc == 2) res = 2;
                else res = 1;
                break;
            case 2:
                if(pc == 1) res = 1;
                else res = 2;
                break;
            case 3:
                if(pc == 2) res = 1;
                else res = 2;
                break;
        }
        return res;
    }

    private static String define_choice(int choice){
        switch (choice){
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                throw new RuntimeException("Something went wrong");
        }
    }
    private static String show_res(int res){
        if(res == 1) return "You Won!!!";
        else if(res == 2) return "You Lost!!!";
        else if (res == 0) return "It's a tie!!!";
        else throw new RuntimeException("Something went wrong");
    }

    private static String show_res(int[] res){
        if(res[1]>res[2]) return "You won the game!!!";
        else if(res[1]<res[2]) return "You lost the game!!!";
        else return "It's a tie!!!";
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
        String resp = scanner.nextLine();
        if(resp.toLowerCase().equals("yes")) play();
    }

}
