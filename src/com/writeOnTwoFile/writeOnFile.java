package com.writeOnTwoFile;

import java.io.*;

public class writeOnFile {

    public void Delay(){
        try {
            Thread.sleep(100);
        }catch (InterruptedException g){

            System.out.println(g.getMessage());
        }

    }

    public void readFromFile(String fileToRead, String fileToWrite)throws Exception {

        Delay();
        String rTemp=null;

        try {

            File rFile = new File(fileToRead);

            File wFile = new File(fileToWrite);


            if (rFile.exists() && wFile.exists() ) {

                FileReader fr = new FileReader(rFile);

                BufferedReader br = new BufferedReader(fr);

                FileWriter fw = new FileWriter(wFile,true);

                BufferedWriter bw = new BufferedWriter(fw);
                Delay();
                while ((rTemp = br.readLine()) != null) {

                       bw.write(rTemp);
                       bw.newLine();

                }

                br.close();
                fr.close();

                bw.close();
                fw.close();


            } else {

                throw new fileNotFoundException();

            }



       } catch (IOException e) {

            System.out.println(e.getMessage());

        }


        }



    }


