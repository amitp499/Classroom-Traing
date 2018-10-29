package com.writeOnTwoFile;

public class writeMulti implements Runnable {

        private writeOnFile rwfile;

        String rFile;
        String wFile;

        writeMulti(writeOnFile rwfile,String rFile, String wFile){
            super();
            this.rFile = rFile;
            this.wFile = wFile;
            this.rwfile = rwfile;

        }

    @Override
    public void run() {

            try {

                String name = Thread.currentThread().getName();
                System.out.println("----------------------------------------------------");
                System.out.println("name of the thread "+name);
                System.out.println("Read File "+rFile);
                System.out.println("Write File "+wFile);
                rwfile.readFromFile(rFile,wFile);

            }catch (Exception e){
                System.out.println("Error on running thread "+e.getMessage());
            }


    }
}
