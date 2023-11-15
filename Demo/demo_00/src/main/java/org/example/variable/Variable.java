package org.example.variable;

public class Variable {

    //region getVariable
    public static void getVariable(){

        byte b = 'A';
        b = 127;

        System.out.println("valeur de b :" + b );
        short s;
        s = 2000;
        int i = 12405651;
        long l = 1534L;
        char c = 'h';
        boolean bool = true;
        float f = 1.59f;
        double doub = 5.12124546;

        i = s;

        char c4 = (char) 69000;
        char c5 = 65000;

        System.out.println("La valeur de c4 " + c4);
        System.out.println("La valeur de c5 " + c5);

        int i3 = 545554554;

        System.out.println("i3 : " + i3);

        b = (byte) i3;

        System.out.println("i3 casté en byte " + b);
    }
    //endregion

}

