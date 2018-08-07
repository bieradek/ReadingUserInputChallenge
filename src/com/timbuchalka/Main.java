package com.timbuchalka;

import java.util.Scanner;

public class Main {

    //    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int counter = 1;
//        int sum = 0;
//        while (counter <= 10) {
//            System.out.println("Enter number #" + counter + ":");
//            boolean hasNextInt = scanner.hasNextInt();
//            if (hasNextInt) {
//                int input = scanner.nextInt();
//                sum += input;
//                counter++;
//            } else {
//                scanner.nextLine();
//                System.out.println("Invalid Number");
//                scanner.nextLine();
//            }
//        }
//        System.out.println(sum);
//        scanner.close();
//    }
    /*
    TIMS CODE
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number %" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("Sum equals =" + sum);
        scanner.close();
    }
}