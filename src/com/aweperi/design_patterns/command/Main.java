package com.aweperi.design_patterns.command;

import com.aweperi.design_patterns.command.fx.Button;

public class Main {
    public static void main(String[] args) {
        var customerService = new CustomerService();
        var command = new AddCustomerCommand(customerService);
        var button = new Button("Add Customer", command);

        button.click();
    }
}
