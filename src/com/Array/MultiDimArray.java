package com.Array;

import com.Annotation.Author_Annotation;

public class MultiDimArray {

    public static void main(String[] args) {

        int data[][] = new int[4][3];

        data[0] = new int[]{55,66,77};
        data[1] = new int[]{11,22,24};
        data[2] = new int[]{15,26,37};
        data[3] = new int[]{05,60,70};

        for (int i=0; i<data.length;i++){

            int sum=0;

            for (int j=0; j<data[i].length;j++){

                sum+= data[i][j];

            }
            System.out.println("Sum is "+sum);
        }

    }


}
