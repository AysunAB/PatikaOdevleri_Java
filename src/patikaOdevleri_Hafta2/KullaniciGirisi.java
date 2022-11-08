package patikaOdevleri_Hafta2;

import java.util.Scanner;

public class KullaniciGirisi {

   /* Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
    eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
    unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise
     ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
    */

    public static void main(String[] args) {

        String myUserName="Aysun";
        String myPassword="2880";
        String word,newPassword;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kullanici adini ve sifrenizi giriniz");
        String userName = scanner.nextLine();
        String password = scanner.nextLine();
        if (userName.equals(myUserName) && password.equals(myPassword)) {
            System.out.println("Dogru giriş yaptınız.");
        } else {
            System.out.println("Yanlis giriş yaptınız .");
            System.out.print("Şifrenizi Sıfırlamak istiyorsanız 'Evet' yaziniz: ");
            word = scanner.nextLine();

            if (word.equals("Evet")) {
                System.out.println("Yeni sifre giriniz: ");

                newPassword = scanner.nextLine();
                if (newPassword.equals(myPassword)) {
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                } else {
                    System.out.println("Sifre olusturuldu.");
                }
            } else {
                System.out.println("Yeni sifre olusturulamadi.");
            }
        }
    }
}
