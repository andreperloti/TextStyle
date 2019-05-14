package br.com.developers.perloti.textstylelibrary;

import android.support.annotation.Size;

public class Label {

    public String text;
    public StyleText style;
    @Size(min=1)
    public String color;


    public Label(String text, StyleText style) {
        this.text = text;
        this.style = style;
    }

    public Label(String text, StyleText style, String color) {
        this.text = text;
        this.style = style;
        this.color = color;
    }

}
