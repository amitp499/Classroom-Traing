package com.pSerial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ActReadWriteUsingNonObj {

    static void WriteRecord(String fileName){

        AccountInfor qq1 = new AccountInfor("Sunil","H5435534543","543532453");
        AccountInfor qq2 = new AccountInfor("Sunil","H5435534543","543532453");
        AccountInfor qq3 = new AccountInfor("Sunil","H5435534543","543532453");

        ArrayList<AccountInfor> no = new ArrayList<>();

        no.add(qq1);
        no.add(qq2);
        no.add(qq3);

        try{

            File ff = new File(fileName);

            FileOutputStream fos = new FileOutputStream(ff);




        }catch (FileNotFoundException e){

        }

    }

}
