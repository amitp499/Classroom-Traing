package com.Training_19_Oct_2018;

public class SavingAccount extends account {

    SavingAccount(int accountNo, String Name, long balance){

        super(accountNo,Name, balance );
        System.out.println("Saving account constructor");

    }

    void abDeposit(long sdepositAmount){

        System.out.println("Entered Saving Deposit");

    }

    void abWithdrawl(long swithAmount){

        System.out.println("Entered Saving withdrawal");

    }


}
