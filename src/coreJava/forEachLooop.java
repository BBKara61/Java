package coreJava;

public class forEachLooop {

    public static void main(String[] args) {

        int[] arr={3,2,4,1};

        karelerinToplami(arr);


    }

    public static void karelerinToplami(int[] arr){

        int toplam=0;

        for (int each : arr){

            toplam+=each*each;

        }
        System.out.println("Arraydaki sayiların karelerinin toplami: "+toplam);

    }
}
