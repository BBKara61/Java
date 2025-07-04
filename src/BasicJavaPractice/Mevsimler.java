package BasicJavaPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Mevsimler {

    public static void main(String[] args) {

        String[] mevsimler=new String[4];

        mevsimler[0]="Ilkbahar";
        mevsimler[1]="Yaz";
        mevsimler[2]="Sonbahar";
        mevsimler[3]="Kıs";

        System.out.println(Arrays.toString(mevsimler));

        String boskova=mevsimler[0];
        mevsimler[0]=mevsimler[1];
        mevsimler[1]=boskova;

        String boskova1=mevsimler[2];
        mevsimler[2]=mevsimler[3];
        mevsimler[3]=boskova1;


        System.out.println("Yeni hali: "+Arrays.toString(mevsimler));

    }
}
