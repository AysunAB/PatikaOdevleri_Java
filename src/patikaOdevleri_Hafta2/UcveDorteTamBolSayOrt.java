package patikaOdevleri_Hafta2;

import java.util.Scanner;

public class UcveDorteTamBolSayOrt {

   /* Ödev
    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
    ortalamasını hesaplayan programı yazınız.*/


    public static void main(String[] args) {

        int input,score=-1,total=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        input=scan.nextInt();

        for (int i = 0; i <=input ; i++) {

            if(i%3==0 && i%4==0){
                total+=i;
                score++;
            }

        }

        System.out.print(total/score);

    }
}