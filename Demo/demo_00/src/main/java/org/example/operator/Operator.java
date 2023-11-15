package org.example.operator;

public class Operator {

    //region getOperator
    public static void getOperator() {

        System.out.println(" ***** les opérateurs ***** ");

        int i = 10;
        int i2 = -10;

        int i3 = ++i;
        System.out.println("i3 : "+ i3);
        int i4 = i++;
        System.out.println("i4 : "+ i4);
        int i5 = i;
        System.out.println("i5 : "+ i5);
        int i6 = --i;
        System.out.println("i6 : "+ i6);
        int i7 = i--;
        System.out.println("i7 : "+ i7);
        int i8 = i;
        System.out.println("i8 : "+ i8);
    }
    //endregion
    // region getExpression
    public static void getExpression() {
        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1L;
        float f = 1.0f;
        double d = 1.0;
        char c = 1;

        int express = b + b;
        int express2 = b + s;
        int express3 = b + i +s;
        long express4 = l + i;
        float express5 = l + f;
        double express6 = d + f;

        int t = 2_000_887_697;
        int t2 = 2_000_887_697;

        int total = t + t2;
        System.out.println(" t + t2 = " + total);
    }
    //endregion
    public static void getOperatorComparaison() {
        int int1 = 12588;
        int int2 = 12588;
        System.out.println("int 1 == int 2 " + (int1 == int2));

        Integer int3 = 128;
        Integer int4 = 128;
        System.out.println("int 3 == int 4 " + (int3 == int4));
        System.out.println(int4.intValue() == int3.intValue());
        System.out.println(int3.equals(int4));

        Integer int5 = 127;
        Integer int6 = 127;
        System.out.println("int 5 == int 6 " + (int5 == int6));

        Integer int7 = new Integer(127);
        Integer int8 = new Integer(127);
        System.out.println("int 7 == int 8 " + (int7 == int8));

        Integer int9 = Integer.valueOf(127);
        Integer int10 = Integer.valueOf(127);
        System.out.println("int 9 == int 10 " + (int9 == int10));

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        System.out.println("arr 1 == arr 2 " + (arr1 == arr2));
    }
    
}
