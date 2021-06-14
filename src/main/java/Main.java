/*
 *  UCF COP3330 Summer 2021 Assignment 35 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String entry = "temp";
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        Random number = new Random();
        boolean e = true;
        while (e) {
            System.out.print("Enter a name: ");
            entry = input.next();
            if (entry.equals("")) {
                e = false;
            } else {
                names.add(entry);
            }
        }
        int winner = number.nextInt(names.size());
        System.out.printf("The winner is... %s.", names.get(winner));
    }
}
