package patikaOdevleri_Hafta3;

import java.util.Scanner;

public class AsalSayiBulanMethod {
    //Odev
    //Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
    //Ornek:Sayı Giriniz : 22
    //22 sayısı ASAL değildir !

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Bir Sayı giriniz : ");
        int sayi = input.nextInt();
        isAsal(sayi, 2);
    }

    static boolean isAsal(int sayi, int i) {


            if (i == sayi) {
                System.out.println(sayi + "  asal sayıdır.");
                return true;

            } else if (sayi % i == 0) {
                System.out.println(sayi + "  asal sayı değildir.");
                return false;

            }

        return isAsal(sayi, i + 1);

    }

}