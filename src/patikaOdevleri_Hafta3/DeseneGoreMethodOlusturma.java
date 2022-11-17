package patikaOdevleri_Hafta3;

import java.util.Scanner;

public class DeseneGoreMethodOlusturma {

    /*Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında
ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

Senaryo
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16 */

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int  n= scan.nextInt();

       desen(n,n,0);

    }
    static void desen(int x,int y,int n){

        if(x>0 && n==0){
            System.out.print(x+" ");
            x-=5;
            desen(x,y,0);

        }
        else if(x <=0){
            System.out.print(x+" ");
            x +=5;
            desen(x,y,1);
        }

        else if (x> 0 && x<=y && n==1){
            System.out.print(x+" ");
            x +=5;
            desen(x,y,1);
        }

    }

}