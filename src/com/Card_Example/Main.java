package com.Card_Example;

public class Main {


    public static void main(String[] args) {

        DebitCard dc = new DebitCard(5000,"H45435345432");
        CreditCard cc = new CreditCard(15000,5000,"HJ2000","Yes");

        ShoppingVendor sv = new ShoppingVendor("MSEB");

        sv.acceptPayment(dc , 500);

        sv.acceptPayment(cc , 200);




    }
}
