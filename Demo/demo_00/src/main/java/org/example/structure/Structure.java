package org.example.structure;

public class Structure {

    static int int1 = 100;
    static int int2 = 200;

    public static void getIfElse() {
        if(int1 > int2) {
            System.out.println("int1 > int 2");
        }else if(int1 == int2) {
                System.out.println("int 1 = int 2");
        } else {
                System.out.println("int 1 < int 2");
        }
    }


    public static void getSwitch() {
        String val = "titi";
        switch (val){
            case "titi":
                System.out.println("c'est titi");
                break;
            case "toto":
                System.out.println("c'est toto");
                break;
            case "tata":
                System.out.println("c'est tata");
                break;
            default:
                System.out.println("ya rien");
        }
    }
}
