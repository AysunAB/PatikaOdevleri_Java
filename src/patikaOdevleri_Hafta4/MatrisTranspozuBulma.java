package patikaOdevleri_Hafta4;

import java.util.Scanner;

public class MatrisTranspozuBulma {

   //Odev: Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Matrisin satir sayisini giriniz : ");
        int row = scan.nextInt();
        System.out.print("Matrisin sutun sayisini giriniz : ");
        int column = scan.nextInt();
        int[][] matris = new int[row][column];
        System.out.print("\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print((i + 1) + ". satir - " + (j + 1) + ". sutun : ");
                matris[i][j] = scan.nextInt();
            }
            System.out.print("\n");
        }
        System.out.println("Matris :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("\t" + matris[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("Transpoze :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= column; j++) {
                System.out.print("\t" + matris[j][i]);
            }
            System.out.print("\n");
        }
    }
}
