/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program prompts for the user's name and
// prints a greeting using the name scanned

package org.example;

import java.util.Scanner;

public class App{

    public static void main(String[] args) {

        // Initialize the scanner and name it scanner
        Scanner scanner = new Scanner(System.in);

        // Create a string called name to store the name entered by the user
        String name;

        // Create a string called output that will store the output to be printed
        // based on the assignment requirements
        String output;

        // prompt the user for a name
        System.out.print("What is your name? ");
        name = scanner.nextLine();

        // create and store the message to be outputted using string concatenation
        // method in java
        output = "Hello, ".concat(name).concat(", nice to meet you!");

        // print the output
        System.out.print(output);

    }
}
