package patikaOdevleri_Hafta1;

import java.util.Scanner;

public class UcgenAlaniHesaplama {

  /*  Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

    Formül
    Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

            𝑢 = (a+b+c) / 2

    Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/

    /**
     * @author aysun
     */

    public static void main(String[] args) {

        int x,y,z,cevre;//Variable'lar tanimlanir'
        double u,alan;

        Scanner scan = new Scanner(System.in);//Scanner klasindan scan objesi olusturulur
        System.out.print("Lutfen 1. kenar uzunlugunu giriniz : ");//Kullanicidan kenar uzunluklari istenir
        x=scan.nextInt();
        System.out.print("Lutfen 2. kenar uzunlugunu giriniz : ");
        y=scan.nextInt();
        System.out.print("Lutfen 3. kenar uzunlugunu giriniz : ");
        z=scan.nextInt();

        boolean ucgenOlmasarti=((x+y)>z)&&((x+z)>y)&&((y+z)>x);//Kullanicinin girdigi uzunluklarin bir ucgen olusturabilmesi icin
        // 1. ve 2. kenar toplaminin 3. kenardan kucuk olmasi sarti kosulur
        cevre=x+y+z;
        u=cevre/2;
        alan=u*(u-x)*(u-y)*(u-z);//ucgen cevresinin yarisinin kenarlardan farklari ile carpilmasi ile ucgen alani hesaplanir

        System.out.println("Kenar uzunluklarini girdiginiz ucgenin alani : "+alan);//Ucgen alani konsolda yazdirilir



    }
}
