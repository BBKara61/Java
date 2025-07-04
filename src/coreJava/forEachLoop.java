package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEachLoop {

    public static void main(String[] args) {

        int[] arr={3,3,4,4,5,4,3,2,3,6,5,4,3,2};

        List<Integer> benzersizList=new ArrayList<>();

        for (int each :arr){
            if (!benzersizList.contains(each)){

                benzersizList.add(each);
            }

        }
        System.out.println(benzersizList);


        arr=new int[benzersizList.size()];

        for (int i = 0; i < arr.length; i++) {

            arr[i]=benzersizList.get(i);


        }
        System.out.println("Array'in son hali: "+ Arrays.toString(arr));
    }
}
