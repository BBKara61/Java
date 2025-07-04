package coreJava;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        int[][] arr={{3,2},{5,6,2},{6,9,7,2,1},{2}};

        elemanlarinToplaminiYazdir(arr);
    }

    public static void elemanlarinToplaminiYazdir(int[][] arr){
      int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                toplam+= arr[i][j];
            }

        }
        System.out.println("Verilen array'daki elementlerin toplami: "+toplam);
    }
}
