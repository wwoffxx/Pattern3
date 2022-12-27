package org.example;

public class Mirrored extends Pattern{
    public String getText() {
        return this.Text.getText();
}
    protected Mirrored(Text Text) {
        super(Text);
    }
}
