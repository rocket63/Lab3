package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {



        Scanner scnr = new Scanner(System.in);
        long userNum = 0;
        long i = 0;
        long square = 0;
        long cube = 0;
        char userResp = ' ';
        char caseCor = ' ';

        do {

            System.out.println("Please enter an integer: ");
            userNum = scnr.nextInt();

            System.out.println("Number         Squared           Cubed");
            System.out.println("------         -------           -----");
            System.out.println("------         -------           -----");

            for (i = 1; i <= userNum; i++) {
                square = i * i;
                cube = i * i * i;
                System.out.printf("%-15d %-17d %-20d \n", i, square, cube);
            }
            System.out.println("Would you like to continue? (y/n):");

            userResp = scnr.next().charAt(0);
            caseCor = Character.toLowerCase(userResp);
        }

        while (caseCor != 'n');

        System.out.println("Bye!");


        }



        }







