package com.LogicalScenario;

public class PrintPyramid {

    public static void main(String[] args) {

        String s ="*";

        for (int i = 1; i<5; i++ ){
            System.out.println(s);

            for (int j=0; j<i; j++){
                System.out.print(s);
            }

        }
    }
}
