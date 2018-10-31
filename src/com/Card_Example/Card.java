package com.Card_Example;

public abstract class  Card {

    String cardNo;
    String vendor;
    String expiryDate;
    String cardHolder;
   // double amount;

    public abstract void withdraw(double amount);
    public abstract void payToVendor(String vendor, double amount);

}
