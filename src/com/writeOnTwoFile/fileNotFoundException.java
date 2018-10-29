package com.writeOnTwoFile;

public class fileNotFoundException extends Exception {


    fileNotFoundException(){

        super("Read/Write found not found at a specified path");
    }


}
