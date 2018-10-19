package com.exception_handling;

public class InvalidPrincipalException extends Exception {

    public static  final double MIN_Principal = 10000;
    public static  final double MAX_Principal = 10000000;

    InvalidPrincipalException(){

        super("Principal amount must be in range 10000 to 1000000");
    }
}
