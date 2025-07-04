package BasicJavaPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MevsimlerinArrayList {

    public static void main(String[] args) {

        ArrayList<String>mevsimler=new ArrayList<>();
        mevsimler.add("Ilkbahar");
        mevsimler.add("Yaz");
        mevsimler.add("Sonbahar");
        mevsimler.add("Kıs");
        System.out.println(mevsimler);

        yerDegistir(mevsimler,0,1,2,3);
        System.out.println(mevsimler);
    }

    public static void yerDegistir(ArrayList<String>liste,int index0,int index1,int index2, int index3){

        String boskova=liste.get(index0);
        liste.set(index0,liste.get(index1));
        liste.set(index1, boskova);

        String boskova1= liste.get(index2);
        liste.set(index2,liste.get(index3));
        liste.set(index3,boskova1);

    }



}
