package quotes;

public class LQuote {
    String author;
    String text;

    public LQuote(String author, String text) {
        this.author = author;
        this.text = text;
    }

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

    @Override
    public String toString() {
        return  "Author: " + author + '\n' +
                "Text: " + text ;
    }
}
