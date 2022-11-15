package patikaOdevleri_Hafta3;

import java.util.Scanner;

public class HarmonikSeri {

    // Java ile girilen sayinin harmonik serisini bulan program yaziniz

    //Harmonik Seri Formülü :1+(1/2)+(1/3)+(1/4)+(1/5)...+(1/n)


    public static void main(String[] args) {

        int number;
        double total=0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz:");
        number = scan.nextInt();

            for (double i = 1; i <= number; i++) {

                total += 1 / i;
            }
        System.out.println(total);
        }

    }
