package com.company;

import java.util.Scanner;

public class Main {
    //finding if a number is true or false
    public static void main(String[] args) {
        while (true) {
            try {
                /*
                Integer.parseInt converts user input to an integer and throws
                and error if it's not an integer.
                 */
                System.out.println(TrueOrFalseNum(Integer.parseInt(UserNumberChoice())));
            }
            catch (Exception e) {
                break;
            }

        }
    }

    public static String UserNumberChoice() {
        System.out.println("please enter a number");
        Scanner input = new Scanner(System.in);
        return input.next();

    }

    public static boolean TrueOrFalseNum(int a) {
        return (a % 2 == 0);
    }

}
