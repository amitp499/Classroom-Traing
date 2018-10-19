package com.exception_handling;

public class InvalidRateofInterest extends Exception {

    public static  final double MIN_InterestRate = 4;
    public static  final double MAX_InterestRate = 24;

    InvalidRateofInterest(){

        super("Interest Rate  must be in range 4 to 25");
    }

}
