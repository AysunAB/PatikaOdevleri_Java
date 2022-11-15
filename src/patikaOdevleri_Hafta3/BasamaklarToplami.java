package patikaOdevleri_Hafta3;

import java.util.Scanner;



public class BasamaklarToplami {

    //Odev
    // Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

    public static void main(String[] args) {

        int a, b, result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        a = input.nextInt();


        while (a != 0) {

            b = a % 10;
            result += b;
            a = a / 10;
        }
        System.out.println("Sonuc : " + result);
    }
}