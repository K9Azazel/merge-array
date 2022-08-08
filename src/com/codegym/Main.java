package com.codegym;

import java.util.Arrays;

    class Main{
        public static void main(String[] args){
            int[] arr1 = {13, 33, 24, 11};
            int[] arr2 = {23, 13, 44};
            int[] arr3 = new int[arr1.length + arr2.length];

            System.arraycopy(arr1, 0, arr3, 0, arr1.length);
            System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

            System.out.println(Arrays.toString(arr3));
        }
    }