package patikaOdevleri_Hafta3;

import java.util.*;

import static java.util.Collections.sort;

public class MinVeMaxDegerBulma {


    public static void main(String[] args) {

        int i, number, max = 0, min = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac tane sayi gireceksiniz");
        int n = scan.nextInt();


        for (i = 1; i <= n; i++) {
            System.out.println(i + ". Sayiyi giriniz:");
            number = scan.nextInt();

            if (i == 1) {
                min = number;
                max = number;
            }
                if (number < min) {
                    min = number;

                } else if (number > max) {
                    max = number;
                }
            }
        System.out.println("En buyuk sayı: " + max);
        System.out.println("En kucuk sayı: " + min);

        }
    }


