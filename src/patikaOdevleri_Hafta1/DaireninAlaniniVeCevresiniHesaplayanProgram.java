package patikaOdevleri_Hafta1;

import java.util.Scanner;

public class DaireninAlaniniVeCevresiniHesaplayanProgram {

    /*Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

    Alan Formülü : π * r * r;

    Çevre Formülü : 2 * π * r;

    Ödev
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

    𝜋 sayısını = 3.14 alınız.

            Formül : (𝜋 * (r*r) * 𝛼) / 360*/

    /**
     * @author aysun
     */

    public static void main(String[] args) {

        int yaricap,aci;
        double cevre,pi=3.14,alan,daireDilimAlani;

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen dairenin yaricap ini tam sayi degeri olarak giriniz : ");
        yaricap= scan.nextInt();

        cevre=2*pi*yaricap;
        System.out.print("Dairenin cevresi : " + cevre);
        System.out.println();
        alan=pi*yaricap*yaricap;
        System.out.print("Dairenin alani : "+alan);
        System.out.println();

        System.out.print("Lutfen alani hesaplanacak dailre dilimin merkez acisini tam sayi cinsinden giriniz : ");
        aci= scan.nextInt();
        daireDilimAlani=(pi*yaricap*yaricap*aci)/360;
        System.out.println("Daire dilminin alani : "+daireDilimAlani);




    }
}
