package com.aweperi.design_patterns.command;

import com.aweperi.design_patterns.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and White");
    }
}
