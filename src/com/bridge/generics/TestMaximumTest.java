package com.bridge.generics;

import static org.junit.jupiter.api.Assertions.*;

class TestMaximumTest {
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