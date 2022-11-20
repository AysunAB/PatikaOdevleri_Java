package patikaOdevleri_Hafta4;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiEnYakinMinMaxDegerleri {

    // Odev
    // Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arr[] = {5, 10, 15, 16, 22, 25, 56, 3};
        System.out.println("Dizi : " + Arrays.toString(arr));
        System.out.println("Bir sayi giriniz");
        int number = scan.nextInt();

        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (number<i) {
                max = i;
                break;
            }

            if (number >i) {
                min = i;
            }
        }
        System.out.println("Girilen sayiya en yakin max sayi : " + max);
        System.out.println("Girilen sayiya en yakin min sayi: " + min);


    }
}