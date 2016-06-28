/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nepinfo;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("MARKSHEET OF STUDENT");

        System.out.println("1.Name: RAM BAHADUR RANA ");
        System.out.println("2.Name: Sam Shrestha ");
        System.out.println("3.Name:Sita Pun ");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Choose The Student Name From Above: ");
            int choice = input.nextInt();
            String[] subjects = {"math", "science", "social", "english", "computer"};
            int total = 0;
            float percentage;

            int[] marks = new int[subjects.length];
            switch (choice) {
                case 1:

                    for (int i = 0; i < subjects.length; i++) {
                        System.out.println("Enter The Marks In " + subjects[i] + ":");
                        marks[i] = input.nextInt();
                        total = marks[i] + total;
                    }
                    System.out.println("The Total Marks You Have Secured Is: " + total);

                    //calculations of percentage//
                    percentage = total / 5;
                    System.out.println("Percentage% : " + percentage + "%");
                    ///decision//

                    if (percentage <= 100 && percentage >= 80) {
                        System.out.println("CONGRATULATION!!! You Have Secured Distinction Division!");
                    } else if (percentage < 80 && percentage >= 60) {
                        System.out.println("CONGRATULATION!!! You Have Secured First Division!");
                    } else if (percentage < 60 && percentage >= 40) {
                        System.out.println("CONGRATULATION!!! You Have Secured Second Division!");
                    } else {
                        System.out.println("You Are Failed!!! BETTER LUCK NEXT TIME");
                    }
                    break;
                case 2:

                    for (int i = 0; i < subjects.length; i++) {
                        System.out.println("Enter The Marks In " + subjects[i] + ":");
                        marks[i] = input.nextInt();
                        total = marks[i] + total;
                    }
                    System.out.println("The Total Marks You Have Secured Is: " + total);

                    //calculations of percentage//
                    percentage = total / 5;
                    System.out.println("Percentage% : " + percentage + "%");
                    ///decision//

                    if (percentage <= 100 && percentage >= 80) {
                        System.out.println("CONGRATULATION!!! You Have Secured Distinction Division!");
                    } else if (percentage < 80 && percentage >= 60) {
                        System.out.println("CONGRATULATION!!! You Have Secured First Division!");
                    } else if (percentage < 60 && percentage >= 40) {
                        System.out.println("CONGRATULATION!!! You Have Secured Second Division!");
                    } else {
                        System.out.println("You Are Failed!!! BETTER LUCK NEXT TIME");
                    }
                    break;
                case 3:
                    for (int i = 0; i < subjects.length; i++) {
                        System.out.println("Enter The Marks In " + subjects[i] + ":");
                        marks[i] = input.nextInt();
                        total = marks[i] + total;
                    }
                    System.out.println("The Total Marks You Have Secured Is: " + total);

                    //calculations of percentage//
                    percentage = total / 5;
                    System.out.println("Percentage% : " + percentage + "%");
                    ///decision//

                    if (percentage <= 100 && percentage >= 80) {
                        System.out.println("CONGRATULATION!!! You Have Secured Distinction Division!");
                    } else if (percentage < 80 && percentage >= 60) {
                        System.out.println("CONGRATULATION!!! You Have Secured First Division!");
                    } else if (percentage < 60 && percentage >= 40) {
                        System.out.println("CONGRATULATION!!! You Have Secured Second Division!");
                    } else {
                        System.out.println("You Are Failed!!! BETTER LUCK NEXT TIME");
                    }
                    break;

            }
            System.out.println("DO YOU WANT TO CONTINUE? : ");
            if (input.next().equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }
}
