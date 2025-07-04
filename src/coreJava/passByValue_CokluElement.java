package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class passByValue_CokluElement {

    public static void main(String[] args) {

        int[] arr={6,9,2};


    }

    public static void yeniOlusturma (int[] arr){

        int[] yeniArr=new int[4];

        for (int i = 0; i <arr.length-1 ; i++) {

            yeniArr[i]=arr[i];


        }
        yeniArr[3]=3;

        arr=yeniArr;
        System.out.println(Arrays.toString(arr));
    }
}
