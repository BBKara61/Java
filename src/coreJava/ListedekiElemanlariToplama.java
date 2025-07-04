package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListedekiElemanlariToplama {

    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>(Arrays.asList(3,5,6,8,9,1));

        System.out.println(list);

        int toplam=0;

        for (int i = 0; i < list.size(); i++) {

            toplam+=list.get(i);

        }
        System.out.println(toplam);
    }
}
