package com.Comparator_Assignment;

import java.util.ArrayList;
import java.util.Comparator;

public class Account {

    String accountNo;
    String accountType;
    String accHolderName;
    String branchName;
    int curentBalance;

    public Account(String accountNo, String accountType, String accHolderName, String branchName, int curentBalance) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accHolderName = accHolderName;
        this.branchName = branchName;
        this.curentBalance = curentBalance;
    }


/* public int compareTo(Account bal1 , Account bal2){

        return ( bal1.curentBalance - bal2.curentBalance);

    }*/


    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public double getCurentBalance() {
        return curentBalance;
    }

    public void setCurentBalance(int curentBalance) {
        this.curentBalance = curentBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo='" + accountNo + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accHolderName='" + accHolderName + '\'' +
                ", branchName='" + branchName + '\'' +
                ", curentBalance=" + curentBalance +
                '}';
    }

    //static ArrayList<Account> arr = new ArrayList<>();



}
