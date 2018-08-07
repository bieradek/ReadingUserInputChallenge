package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please provide input");
//        boolean hasNextInt = scanner.hasNextInt();
//        System.out.println(hasNextInt);


        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt)
            {
                int input = scanner.nextInt();
                //scanner.nextLine(); not necessary?
                sum += input;
                counter++;
            }

            else

                {
                System.out.println("Invalid Number");
            }
        }
        System.out.println(sum);
        scanner.close();

    }
}