package com.aweperi.exceptions;

import java.io.IOException;

public class Account {
    private final float balance;

    public Account(float balance) {
        this.balance = balance;
    }

    public void deposit(float value) throws IOException {
        if (value <=0) throw new IOException("value has to be greater than 0");
    }

    public void withdraw(float value) throws AccountException {
        if(value > balance) throw new AccountException(new InsufficientFundsException());
    }
}
