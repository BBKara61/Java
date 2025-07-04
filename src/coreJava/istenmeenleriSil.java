package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class istenmeenleriSil{

    public static void main(String[] args) {


        List<String> isimler=new ArrayList<>(Arrays.asList("Seher","Seren","Meltem","Bekir","Sait"));
        String istenmeyenHarf="e";

        System.out.println(istenmeyenHarfleriSil(isimler, istenmeyenHarf));
    }

    public static List<String> istenmeyenHarfleriSil(List<String> isimler, String istenmeyenHarf){

        for (int i = 0; i < isimler.size(); i++) {

            if (isimler.get(i).contains(istenmeyenHarf)){

                isimler.remove(i);
                i--;
            }

        }


        return isimler;
    }
}
