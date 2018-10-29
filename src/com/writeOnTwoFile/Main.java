package com.writeOnTwoFile;

public class Main {

    public static void main(String[] args) {

        String readFile = "D:\\Amit\\Read\\readFile.txt";
        String writeOnFile1 = "D:\\Amit\\Write\\writeFile_2.txt";

        writeOnFile wof = new writeOnFile();

        try {

            wof.readFromFile(readFile,writeOnFile1);

        }catch (Exception ex){

          System.out.println(ex.getMessage());        }


    }
}
