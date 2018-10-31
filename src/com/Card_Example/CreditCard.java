package com.Card_Example;

public class CreditCard extends Card{

    double creditLimit;
    double cashLimit;
    String rewardPoint;
    String emi;

    @Override
    public void withdraw(double amount) {

        System.out.println("entered credit withdraw method");

    }


    @Override
    public void payToVendor(String vendor, double amount) {

        System.out.println("entered credit vendor");

    }

    public CreditCard(double creditLimit, double cashLimit, String rewardPoint, String emi) {
        this.creditLimit = creditLimit;
        this.cashLimit = cashLimit;
        this.rewardPoint = rewardPoint;
        this.emi = emi;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getCashLimit() {
        return cashLimit;
    }

    public void setCashLimit(double cashLimit) {
        this.cashLimit = cashLimit;
    }

    public String getRewardPoint() {
        return rewardPoint;
    }

    public void setRewardPoint(String rewardPoint) {
        this.rewardPoint = rewardPoint;
    }

    public String getEmi() {
        return emi;
    }

    public void setEmi(String emi) {
        this.emi = emi;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "creditLimit=" + creditLimit +
                ", cashLimit=" + cashLimit +
                ", rewardPoint='" + rewardPoint + '\'' +
                ", emi='" + emi + '\'' +
                '}';
    }
}
