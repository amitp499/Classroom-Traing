package com.exception_handling;

public class intCalc_Main {
    public static void main(String[] args) {


            try{
                interestCalculator.calc(100000, 30,25);
                //interestCalculator.calc(1000000, 2,150);
                //interestCalculator.calc(1000000, 9,11);

            }catch (Exception exp){
                System.out.println("Somthing went wrong "+exp.getMessage());

            }


    }




}
