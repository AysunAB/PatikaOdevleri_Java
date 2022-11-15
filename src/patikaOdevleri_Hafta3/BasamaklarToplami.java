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
    /* Method ile:
    class Recursion{
        static int basamaklarToplami(int sayi){
            if (sayi == 0){
                return 0;
            }else
               return sayi % 10 + basamaklarToplami(sayi / 10);
        }
        public static void main(String[] args){
      		  System.out.println("Basamak toplami: "+basamaklarToplami(45612));
        }
     */
}