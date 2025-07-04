package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class enUzunKelime {

    public static void main(String[] args) {


        List<String> isimler=new ArrayList<>(Arrays.asList("Seher","Aslı","Efe","Sümeyra","Mustafa"));

        System.out.println(isimler);

        String enUzunKelime= isimler.get(0);

        for (int i = 0; i < isimler.size(); i++) {

            enUzunKelime = isimler.get(i);



        }
        System.out.println(enUzunKelime);
    }
}
