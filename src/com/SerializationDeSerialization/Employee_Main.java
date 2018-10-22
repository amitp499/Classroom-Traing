package com.SerializationDeSerialization;

import static com.SerializationDeSerialization.SerializationDemo.*;

public class Employee_Main {

    public static void main(String[] args) {

        System.out.println("Creating object and serializing it");
        writeFile("D:\\Amit\\data.emp");
        System.out.println("Reading from file");
        readFile("D:\\Amit\\data.emp");

    }
}
