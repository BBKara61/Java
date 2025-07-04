package coreJava;

public class innerArraylerinİlkElemanlariniTopla {

    public static void main(String[] args) {


        int[][] arr={{3,2},{5,6,2},{6,9,7,2,1},{2}};
        ilkElemanlariTopla(arr);
    }

    public static void ilkElemanlariTopla(int[][] arr){


        int toplam=0;

        for (int i = 0; i < arr.length; i++) {


            toplam+=arr[i][0];

        }
        System.out.println("İlk elementlerin toplami: "+ toplam);
    }
}
