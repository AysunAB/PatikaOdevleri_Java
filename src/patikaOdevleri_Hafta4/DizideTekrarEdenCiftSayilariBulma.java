package patikaOdevleri_Hafta4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DizideTekrarEdenCiftSayilariBulma {


    public static void main(String[] args) {

        int [] arr ={28,99,6,54,2,9,6,82,8,1,55,29,82};
        int []  duplicate = new int[arr.length];
        int startIndex = 0;
        Arrays.sort(arr);

        for (int i =0; i<arr.length-1; i++) {
            if (arr[i]==arr[i+1]){
                duplicate[startIndex++] = arr[i];
            }
        }
        System.out.println("Tekrar eden çift Sayılar :");
        for (int i=0;i<duplicate.length-1;i++){
            int value =duplicate[i];
            if (value != duplicate[i+1] && value !=0 && value%2==0 ){
                System.out.println(value);
            }
        }
    }
}
