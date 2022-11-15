package patikaOdevleri_Hafta3;

import java.util.Scanner;

public class Mukemmelsayi {

   /* Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

    Mükemmel Sayı Nedir ?
    Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

    Senaryolar
    Bir sayı giriniz: 28
    28 Mükemmel sayıdır
    Bir sayı giriniz: 1
    1 Mükemmel sayı değildir.
    Bir sayı giriniz: 496
    496 Mükemmel sayıdır*/


    public static void main(String[] args) {

        int number, total = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sayı giriniz :");
        number = scan.nextInt();


        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                total = total + i;
            }

        }
        if (total == number) {

            System.out.println(number + " mukemmel sayidir");
        } else {
            System.out.println(number + " mukemmel sayi değildir.");


        }
    }
}