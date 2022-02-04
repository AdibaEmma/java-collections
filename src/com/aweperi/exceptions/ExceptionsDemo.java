package com.aweperi.exceptions;

import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
//        try (var reader = new FileReader("file.txt");) {
//            var value = reader.read();
//        } catch (IOException e) {
//            System.out.println("could not read data.");
//        }
//        System.out.println("File opened");

        var account = new Account(10);
        try {
            account.deposit(-1);
        } catch (IOException e) {
            System.out.println("Logging");
        }

        try {
            account.withdraw(20);
        } catch (AccountException e) {
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }
    }
}
