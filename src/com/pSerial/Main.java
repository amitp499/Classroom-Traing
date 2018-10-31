package com.pSerial;

import static com.pSerial.ActReadWriteUsingObject.readAcctDetails;
import static com.pSerial.ActReadWriteUsingObject.writeAcctDetails;

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating object and serializing it");
        //writeAcctDetails("D:\\Amit\\data.emp");

        System.out.println("Reading File");
        readAcctDetails("D:\\Amit\\data.emp");
    }
}
