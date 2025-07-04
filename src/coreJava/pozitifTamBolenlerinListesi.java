package coreJava;

import java.util.ArrayList;
import java.util.List;

public class pozitifTamBolenlerinListesi {

    public static void main(String[] args) {

        System.out.println(pozitifBolenListesi(240));


    }
    public static List<Integer> pozitifBolenListesi(int sayi){

        List<Integer> pozitifBolenlerListesi=new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){

                pozitifBolenlerListesi.add(i);
            }

        }

        return pozitifBolenlerListesi;
    }
}
