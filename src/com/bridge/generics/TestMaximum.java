package com.bridge.generics;

public class TestMaximum{
    //uc1-IN 3 INTEGER FIND MAXIMUM
    public  static Integer testMax(Integer X,Integer Y,Integer Z){
        Integer max=X;
        if(Y.compareTo(max)>0){
            max=Y;
        }
        if(Z.compareTo(max)>0){
            max=Z;
        }
        printMax(X,Y,Z,max);
        return max;

    }
    //UC2-FIND MAXIMUM AMONG THREE FLOAT
    public  static Float testMax1(Float A, Float B, Float C){
        Float max=A;
        if(B.compareTo(max)>0){
            max=B;
        }
        if(C.compareTo(max)>0){
            max=C;
        }
        printMax(A,B,C,max);
        return max;

    }

    private static void printMax(Float a, Float b, Float c, Float max) {
    }
//uc3- find maximum among 3 string
    public  static String testMax2(String R, String S, String T){
        String max=R;
        if(S.compareTo(max)>0){
            max=S;
        }
        if(T.compareTo(max)>0){
            max=T;
        }
        printMax2(R,S,T, max );
        return max;

    }

    private static void printMax2(String r, String s, String t, String max) {
    }




    private static void printMax(Integer x, Integer y, Integer z, Integer max) {
    }



    public static void main(String[] args) {
        System.out.println("ENTER THE VALE OF X,Y,Z");
        System.out.println(testMax(2,9,6));
        System.out.println(testMax1(5F, 8F, 10F));
        System.out.println(testMax2("Rama","Tina","Bharat"));

    }


}
