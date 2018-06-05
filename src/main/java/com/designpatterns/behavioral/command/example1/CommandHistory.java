package com.designpatterns.behavioral.command.example1;

import java.util.Stack;

public class CommandHistory {
    
    private Stack<Command> history = new Stack<Command>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return (Command) history.pop();
    }

    public Boolean isEmpty() { return history.isEmpty(); }
}
