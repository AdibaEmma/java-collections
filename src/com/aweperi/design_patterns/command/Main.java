package com.aweperi.design_patterns.command;

import com.aweperi.design_patterns.command.editor.BoldCommand;
import com.aweperi.design_patterns.command.editor.History;
import com.aweperi.design_patterns.command.editor.HtmlDocument;
import com.aweperi.design_patterns.command.editor.UndoCommand;
import com.aweperi.design_patterns.command.fx.Button;

public class Main {
    public static void main(String[] args) {
//        var customerService = new CustomerService();
//        var command = new AddCustomerCommand(customerService);
//        var button = new Button("Add Customer", command);
//
//        button.click();

//        var composite = new CompositeCommand();
//        composite.add(new ResizeCommand());
//        composite.add(new BlackAndWhiteCommand());
//        composite.execute();
//        composite.execute();

        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document, history);

        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
