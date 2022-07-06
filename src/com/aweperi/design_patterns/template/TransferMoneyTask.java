package com.aweperi.design_patterns.template;

public class TransferMoneyTask extends Task{
    @Override
    protected void doExecute() {
        System.out.println("Transfer money");
    }
}
