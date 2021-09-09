package com.company;

import java.util.Scanner;

public class Main {
    //finding if a number is true or false
    public static void main(String[] args) {
         System.out.println(TrueOrFalseNum(UserNumberChoice()));
    }

    public static int UserNumberChoice(){
        System.out.println("please enter a number");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static boolean TrueOrFalseNum(int a) {
        return (a % 2 == 0);
    }




}
