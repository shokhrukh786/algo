package org.example.algorithms.osnovnoyPonyatiya.bazaviy_model_progrivomaniya;

import java.util.Arrays;

public class ArrayEx {
    public int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++)
            if (max < arr[i + 1]) max = arr[i + 1];
        return max;
    }
    public int middleValue(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
    public int[] copy(int[] arr){
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < copyArr.length; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }
    public int[] tezkariArr(int[] arr){
        int N = arr.length;
        for (int i = 0; i < N/2; i++) {
            int x = arr[i];
            arr[i] = arr[N-1-i];
            arr[N-1-i] = x;
        }
        return arr;
    }
}

class arrayExTest{
    public static void main(String[] args) {
        ArrayEx arrayEx = new ArrayEx();
        int[] arr = new int[]{21, 43, 11, 89, 43, 45, 5, 24, 50};
        int result = arrayEx.maxValue(arr);
        System.out.println("Max value: " + result);
        int result2 = arrayEx.middleValue(arr);
        System.out.println("Middle value: " + result2);
        int[] result3 = arrayEx.copy(arr);
        System.out.println("Copy value: " + Arrays.toString(result3));
        int[] result4 = arrayEx.tezkariArr(arr);
        System.out.println("Tezkari array: " + Arrays.toString(result4));
    }
}
