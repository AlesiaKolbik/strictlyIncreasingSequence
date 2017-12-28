package com.testpackage;
import java.lang.System;
import  java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        int [] inputSequence=scanner();
        printStrictlyIncreasingSequence(inputSequence);
    }

    private static int[] scanner() {
        Scanner scanner=new Scanner(System.in);
        out.println("Введите размер массива:");
        int size=scanner.nextInt();
        int [] array=new int[size];
        out.println("Ввести возрастающую последовательность:");
        for (int i=0;i<array.length;i++) {
            array[i]=scanner.nextInt();
        }
        return array;
    }

    private static void printStrictlyIncreasingSequence(int[] array) {
        out.print(array[0]+" ");
        for(int i=1;i<array.length;i++){
            if(array[i]>array[i-1]){
                out.print(array[i]+" ");
            }
        }
    }
}
