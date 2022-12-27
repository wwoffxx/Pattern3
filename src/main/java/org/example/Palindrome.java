package org.example;

public class Palindrome implements Text {
    private final String Text;

    Palindrome(String Text) {
        this.Text = Text;
    }

    public String getText() {
        return this.Text;
    }
}
