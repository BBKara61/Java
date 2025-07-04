package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tekrarsizHaleGetirme {

    public static void main(String[] args) {


        int[] arr= {3,5,3,5,6,5,3,4,6,5,2,3,6,4,3,7};
        arr= uniqueHaleGetir(arr);

        System.out.println(Arrays.toString(arr));

        int[] arr2={1,23,12,2,3};
        Arrays.sort(arr2);
        System.out.println(Arrays.binarySearch(arr2,12));


    }
    public static int[] uniqueHaleGetir(int[] arr){

        List<Integer> uniquelist=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!uniquelist.contains(arr[i])){

                uniquelist.add(arr[i]);
            }

        }
        int[] yeniArr=new int[uniquelist.size()];

        for (int i = 0; i <yeniArr.length; i++) {

            yeniArr[i]= uniquelist.get(i);

        }
        arr=yeniArr;
        return arr;
    }

}
