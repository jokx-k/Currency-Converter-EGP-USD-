package com.example.currencyconverter;

public class Conversion {
    private double amount;


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double UStoEG() {
        return (amount * 50);
    }

    public double EGtoUS() {
        return (amount /50);
    }

}





