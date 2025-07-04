package coreJava;

public class sonElementlerinToplami {
    public static void main(String[] args) {


        int[][] arr={{3,2},{5,6,2},{6,9,7,2,1},{2}};
        sonElemanlariTopla(arr);

    }

    public static void sonElemanlariTopla(int[][] arr){

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            toplam+=arr[i][arr[i].length-1];

            }
        System.out.println("Son elemanlarin toplami: "+toplam);
            }

        }




