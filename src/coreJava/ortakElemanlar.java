package coreJava;

import java.util.ArrayList;
import java.util.List;

public class ortakElemanlar {

    public static void main(String[] args) {

        int[] array1={3,6,8,1,0,3,8,1,1};
        int[] array2={3,6,7,5,6,5,6,5,1};

        List<Integer> ortakElemanlarListesi=new ArrayList<>();

        for (int each1:array1){
            for (int each2:array2){

                if (each1==each2 && !ortakElemanlarListesi.contains(each1)){

                    ortakElemanlarListesi.add(each1);
                }
            }
        }
        System.out.println("Ortak elemanlar listesi: "+ ortakElemanlarListesi
        );
    }
}
