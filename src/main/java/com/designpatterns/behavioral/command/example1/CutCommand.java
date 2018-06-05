package com.designpatterns.behavioral.command.example1;

public class CutCommand extends Command {
    
    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public Boolean execute() {
        if (editor.textField.getSelectedText().isEmpty()) return false;

        backup();
        String source = editor.textField.getText();
        editor.clipboard = editor.textField.getSelectedText();
        editor.textField.setText(cutString(source, editor.clipboard));
        return true;
    }

    public String cutString(String source, String cut) {
        String start = source.substring(0, editor.textField.getSelectionStart());
        String end = source.substring(editor.textField.getSelectionEnd(), source.length());
        return start + end;
    }
}
