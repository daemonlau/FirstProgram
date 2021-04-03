package com.liu;

public class FinanceReport implements Report{
    @Override
    public void load() {
        System.out.println("Finance load data");
    }

    @Override
    public void print() {
        System.out.println("Finance print data");
    }
}
