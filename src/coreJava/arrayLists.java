package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayLists {

    public static void main(String[] args) {


        List<String> isimler=
                new ArrayList<>(Arrays.asList("Seren","Eghbal","Ilgar","Joanna","Ali Cabbar"));
            int toplamKarakterSayisi=0;
        for (int i = 0; i < isimler.size(); i++) {
            toplamKarakterSayisi+=isimler.get(i).length();

        }

        System.out.println("Toplam karakter sayisi: "+ toplamKarakterSayisi);
    }
}
