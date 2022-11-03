package patikaOdevleri_Hafta2;

import java.util.Scanner;

public class Calculator {

    // hesap makinesini switch-case kullanarak yapınız.

    /**
     * @author aysun
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int number1, number2, select;

        System.out.println("Lutfen 0'dan farkli bir tamsayi giriniz");
        number1 =scan.nextInt();
        System.out.println("Lutfen 0'dan farkli baska bir tamsayi giriniz");
        number2 =scan.nextInt();
        System.out.println("Lutfen bir islem seciniz : \n1)+ \n2)- \n3)* \n4)/");
        select=scan.nextInt();

        switch (select){

            case 1:
                System.out.println(number1+number2);
                break;
            case 2:
                System.out.println(number1-number2);
                break;
            case 3:
                System.out.println(number1*number2);
                break;
            case 4:
                System.out.println(number1/number2);
                break;
            default:
                System.out.println("Gecersiz giris yaptiniz");
        }



    }
}