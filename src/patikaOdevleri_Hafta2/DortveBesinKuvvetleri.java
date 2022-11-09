package patikaOdevleri_Hafta2;

import java.util.Scanner;

public class DortveBesinKuvvetleri {

    public static void main(String[] args) {

        int input,x;
        Scanner scan = new Scanner(System.in);

        int n;
        System.out.print("Lutfen bir sayi giriniz ");
        input=scan.nextInt();

        System.out.println("Girdiginiz sayidan kucuk 4'un katlari");
        for (int i = 1; i <= input; i *= 4) {
            System.out.println(" :" +i );
        }

        System.out.println("\nGirdiginiz sayidan kucuk 5'in katlari");
        for (int i = 1; i <= input; i *= 5) {
            System.out.println(" :"+i);
        }


    }

}

