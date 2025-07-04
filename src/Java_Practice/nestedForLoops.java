package Java_Practice;

public class nestedForLoops {
    public static void main(String[] args) {

        /*Yıldızlar ile baklava deseni oluşturunuz.

         */

        int boyut=5;
        for (int i = 1; i < boyut; i++) {
            for (int j = 1; j < boyut-i; j++) {
                System.out.print(" ");

                }
            for (int k = 1; k <=i ; k++) {
                System.out.print("* ");

            }System.out.println();
            }
        for (int i = boyut-1; i >=1 ; i--) {
            for (int j = 1; j <=boyut-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <i ; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        }
    }

