package com.pSerial;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;

public class ActReadWriteUsingObject {

    static ArrayList<AccountInfor> arrread = new ArrayList<>();

    static void writeAcctDetails( String fileName){

        AccountInfor aa = new AccountInfor("Ajay","H3155435","4353");
        AccountInfor aa1 = new AccountInfor("Snehal","H6546456","8798");
        AccountInfor aa2 = new AccountInfor("Sai","H7896745","55468");

        ArrayList<AccountInfor> arr = new ArrayList<>();

        arr.add(aa);
        arr.add(aa1);
        arr.add(aa2);
        try {
          File ff = new File(fileName);
           if (!ff.exists())
               ff.createNewFile();
               FileOutputStream fo = new FileOutputStream(ff);
               ObjectOutputStream os = new ObjectOutputStream(fo);
               os.writeObject(arr);
               os.close();

            }catch(IOException e){
                System.out.println(e.getMessage());

            }



    }

    static void readAcctDetails(String fileName){

        try{

            FileInputStream fi = new FileInputStream(fileName);
            ObjectInputStream obi = new ObjectInputStream(fi);
            Object ob = obi.readObject();

            arrread = (ArrayList<AccountInfor>) ob;

            for (AccountInfor x :arrread) {

                System.out.println(x);
            }

            //System.out.println(ob);



        }catch(IOException |ClassNotFoundException ex){

        }
    }
}
