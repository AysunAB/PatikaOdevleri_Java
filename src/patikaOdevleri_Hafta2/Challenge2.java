package patikaOdevleri_Hafta2;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number");
        int n = scan.nextInt();


        if (n % 2 != 0) {
            System.out.print("Weird");
        } else {

            if (n >= 2 && n <= 5 && n > 20) {
                System.out.print("Not Weird");
            }

            if (n >= 6 && n<= 20) {
                System.out.print("Weird");
            }

        }
    }
}