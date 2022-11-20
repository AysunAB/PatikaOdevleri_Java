package patikaOdevleri_Hafta4;

public class DizidekiElemanlarinHarmonikOrtalamasi {

    public static void main(String[] args) {

        double harmonicAverage = 0;
        double harmonicSeries = 0;
        double[] arr = {1, 2, 3, 4, 5};

        for (double j : arr) {
            if (j != 0) {
                harmonicSeries += (1 / j);
                harmonicAverage = arr.length / harmonicSeries;

            }
        }

        System.out.println("Dizi Elemanlarinin Harmonik Ortalamasi: " + harmonicAverage);

    }
}

