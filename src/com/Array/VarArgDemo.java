package com.Array;

public class VarArgDemo {


    static int doSum(int[] data) {

        int sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }

        return sum;
    }

    static int doSum2(int... data) {

        int sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }

        return sum;
    }


    public static void main(String[] args) {

        int[] array = {10, 20, 30};

        int sum1 = doSum(array);
        System.out.println(sum1);
        int sum4 = doSum2();
        int sum2 = doSum2(10, 02, 35, 40, 50);
        System.out.println(sum2);
        int sum3 = doSum(new int[]{4, 65, 78});
        System.out.println(sum3);
        System.out.println(sum4);
    }
}