package com.example.demo;

import java.util.Arrays;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class Practice {

    public static void main(String[] args) {

        int arr [] =  {1,2,2,3,3,4,5,4};

        /*if (arr.length <= 1) {
            return arr;
        }
*/
        int lastFound = arr[0];

        int currPos = 1;
        for (int i = 1; i < arr.length; ++i) {
            int num = arr[i];
            if (lastFound != num) {
                lastFound = num;
                arr[currPos++] = num;
            }
        }

        System.out.println();


        //Arrays.stream(arr).forEach(value -> System.out.println(value));

        int result [] = Arrays.copyOf(arr, currPos);

        for (int i : result) {
            System.out.println(i);
        }

    }
}




