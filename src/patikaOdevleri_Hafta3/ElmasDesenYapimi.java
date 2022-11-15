package patikaOdevleri_Hafta3;

import java.util.Scanner;

public class ElmasDesenYapimi {


    /* Java'da döngüler kullanarak yıldızlar ile elmas yapınız.



     *
     ***
     *****
     *******
     *********
     ***********
     *************
     ***********
     *********
     *******
     *****
     ***
     *

     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = scan.nextInt();


        for (int i = 0; i <= n ; i++) {        //ilk ucgenin yıldiz basamak sayisi girilir
            for (int j = 0; j < (n - i); j++) { //yukaridan asagi giderken her basamagin basina bosluk konulur
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {   //her basamakta bosluktan sonra yildiz konulur
                System.out.print("*");
            }
            System.out.println(" ");
        }

       for (int i = n-1; i >=0 ; i--) {          //ikinci ucgen icin yukaridaki islemlerin tersi uyglanir
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

