package com.Card_Example;

public class DebitCard extends Card{

    double maxWithdrawlLimit;
    String accountNo;
    //String damount;


    public DebitCard(double maxWithdrawlLimit, String accountNo) {
        this.maxWithdrawlLimit = maxWithdrawlLimit;
        this.accountNo = accountNo;
    }

    @Override
    public void withdraw(double amount) {

        System.out.println("entered debit withdraw method");

    }


    @Override
    public void payToVendor(String vendor, double amount) {


        System.out.println("entered debit vendor");

    }

    public double getMaxWithdrawlLimit() {
        return maxWithdrawlLimit;
    }

    public void setMaxWithdrawlLimit(double maxWithdrawlLimit) {
        this.maxWithdrawlLimit = maxWithdrawlLimit;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }


    @Override
    public String toString() {
        return "DebitCard{" +
                "maxWithdrawlLimit=" + maxWithdrawlLimit +
                ", accountNo='" + accountNo + '\'' +
                '}';
    }
}
