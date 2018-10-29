package com.writeOnTwoFile;

public class rw_File_Thread_Main {

    public static void main(String[] args) {

        String readFile = "D:\\Amit\\Read\\readFile.txt";
        String writeOnFile1 = "D:\\Amit\\Write\\writeFile_1.txt";
        String writeOnFile2 = "D:\\Amit\\Write\\writeFile_2.txt";

        writeOnFile rwf = new writeOnFile();

        Thread t1 = new Thread(new writeMulti(rwf,readFile,writeOnFile1));

        Thread t2 = new Thread(new writeMulti(rwf, readFile,writeOnFile2));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();

        }catch (InterruptedException e){

            System.out.println("Error on thread join "+e.getMessage());
        }

    }
}
