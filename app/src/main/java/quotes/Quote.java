package quotes;

public class Quote {
    String quoteAuthor;
    String quoteText;

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public void setQuoteAuthor(String quoteAuthor) {
        this.quoteAuthor = quoteAuthor;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public Quote(String author, String text) {
        this.quoteAuthor = author;
        this.quoteText = text;
    }

    @Override
    public String toString() {
        return  "Author: " + quoteAuthor +
                "\nText: " + quoteText;
    }

}
