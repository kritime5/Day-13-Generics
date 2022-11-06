package com.bridge.generics;

import java.util.Scanner;

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

    private static void printMax(Integer x, Integer y, Integer z, Integer max) {
    }
}
