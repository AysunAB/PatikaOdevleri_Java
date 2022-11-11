package patikaOdevleri_Hafta1;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] argh) {


        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
            try {


                long x = sc.nextLong();
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println(x + " can be fitted in: \n* byte \\n* short \n* int \n* long");
                } else if ((x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)) {
                    System.out.println(x + " can be fitted in:  \n* short \n* int \n* long");
                } else if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println(x + " can be fitted in: \n* int \n* long");
                } else if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println(x + " can be fitted in: \n* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
    }
}
