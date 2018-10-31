package com.pSerial;

import java.io.Serializable;

public class AccountInfor implements Serializable {

    String accountName;
    String acctNo;
    String actBalance;

    public AccountInfor(String accountName, String acctNo, String actBalance) {
        this.accountName = accountName;
        this.acctNo = acctNo;
        this.actBalance = actBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getActBalance() {
        return actBalance;
    }

    public void setActBalance(String actBalance) {
        this.actBalance = actBalance;
    }

    @Override
    public String toString() {
        return "AccountInfor{" +
                "accountName='" + accountName + '\'' +
                ", acctNo='" + acctNo + '\'' +
                ", actBalance='" + actBalance + '\'' +
                '}';
    }
}
