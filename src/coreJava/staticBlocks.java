package coreJava;

public class staticBlocks {

    staticBlocks(){
        System.out.println("Constructor calisti.");
    }

    public static void main(String[] args) {

        System.out.println("Main method calisti.");

        staticBlocks obj = new staticBlocks();

    }

    public static void method1(){

        System.out.println("Method1 calisti.");
    }

    static {
        System.out.println("Static block calisti.");

    }
}
