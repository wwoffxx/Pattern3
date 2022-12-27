package org.example;

public abstract class Pattern implements Text {
    final Text Text;

    protected Pattern(Text Text) {
        this.Text = Text;
    }
}
