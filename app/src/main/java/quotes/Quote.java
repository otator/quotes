package quotes;

import java.util.Objects;

public class Quote {
    String author;
    String text;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Quote(String author, String text) {
        this.author = author;
        this.text = text;
    }

    @Override
    public String toString() {
        return  "author: " + author +
                "\ntext: " + text;
    }

}
