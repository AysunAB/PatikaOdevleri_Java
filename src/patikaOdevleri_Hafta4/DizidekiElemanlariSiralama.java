package patikaOdevleri_Hafta4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {

   /* Odev:
   Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

            Senaryo
    Dizinin boyutu n : 5
    Dizinin elemanlarını giriniz :
            1. Elemanı : 99
            2. Elemanı : -2
            3. Elemanı : -2121
            4. Elemanı : 1
            5. Elemanı : 0
    Sıralama : -2121 -2 0 1 99*/

    public static void main(String[] args) {


       Scanner scan=new Scanner(System.in);
        System.out.println("dizinin boyutunu giriniz");
        int length=scan.nextInt();
        System.out.println("dizinin elemanlarini giriniz");
        int[] arr=new int[length];
        for (int i=0; i<arr.length; i++){

            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
    }


}
