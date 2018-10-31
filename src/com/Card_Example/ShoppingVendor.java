package com.Card_Example;

public class ShoppingVendor {

    String vendorName;

    public ShoppingVendor(String vendorName) {
        this.vendorName = vendorName;
    }

    public void acceptPayment(Card c, double amount){

        c.payToVendor(this.vendorName, amount);

    }
}
