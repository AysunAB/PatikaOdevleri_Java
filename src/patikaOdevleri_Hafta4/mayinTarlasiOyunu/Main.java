package patikaOdevleri_Hafta4.mayinTarlasiOyunu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Mayin tarlasi basliyooorrr");
        Scanner scan = new Scanner(System.in);
        System.out.print("Satir sayisi girin: ");
        int row = scan.nextInt();
        System.out.print("Sutun sayisi girin: ");
        int column = scan.nextInt();

        MineSweeper mine = new MineSweeper(row, column);

        mine.printArea();

        do {
            System.out.print("Enter the row: ");
            row = scan.nextInt();
            System.out.print("Enter the column: ");
            column = scan.nextInt();
            mine.sweep(row, column);
        }

        while (!mine.isGameOver);

    }
}
