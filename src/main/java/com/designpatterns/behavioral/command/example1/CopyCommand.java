package com.designpatterns.behavioral.command.example1;

public class CopyCommand extends Command {
    
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public Boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
