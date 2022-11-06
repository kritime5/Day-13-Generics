package com.bridge.generics;

public class PrintArray<E> {
    private E[] inputArray;
    public PrintArray(E[] inputArray){
        this.inputArray=inputArray;
    }
    public  void toPrint(){
            PrintArray.toPrint(this.inputArray);
        }

    public static <E> void toPrint(E[] inputArray){
        for(E element:inputArray){
            System.out.printf("%s",element);
        }
        System.out.println();
}

    public static void main(String[] args) {
         Integer[] intArray={1,2,3,4,5};
        Double[] doubleArray={1.1,2.2,3.3,4.4};
        char[] charArray={1,2,3,4,5};

        new PrintArray(intArray).toPrint();
        PrintArray.toPrint(doubleArray);
        PrintArray.toPrint(new char[][]{charArray});

        }

    }

