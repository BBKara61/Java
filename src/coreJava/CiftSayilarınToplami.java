package coreJava;

public class CiftSayilarınToplami {

    public static void main(String[] args) {

        int[][] arr={{3,2},{5,6,2},{6,9,7,2,1},{2}};

        ciftSayilarinTopla(arr);
    }

    public static void ciftSayilarinTopla(int[][] arr){

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]%2==0){

                    toplam+=arr[i][j];
                }

            }

        }
        System.out.println("Array'deki çift sayilarin toplami: " +toplam);


    }
}
