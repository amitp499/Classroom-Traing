package com.exception_handling;

public class InvalidDuration extends RuntimeException {
    public static  final double MIN_Duration = 12;
    public static  final double MAX_Duration = 240;

    InvalidDuration(){

        super("Duration must be in range 12 to 240");

    }


}
