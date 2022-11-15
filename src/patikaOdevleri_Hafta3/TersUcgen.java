package patikaOdevleri_Hafta3;

import java.util.Scanner;

public class TersUcgen {


    //Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
    // yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = scan.nextInt();


        for (int i = n-1; i >=0 ; i--) {
            for (int j = n-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
