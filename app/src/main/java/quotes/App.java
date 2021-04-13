/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String path = "app/src/main/resources/recentquotes.json";
        if (System.getProperty("user.dir").endsWith("p"))
            path = "../" + path;

        Quote[] quotes = readJson(path);

        if (args.length > 0){
            String author = makeAuthorName(args);
            String quote = getQuote(quotes, author);
            if(quote!= null)
                System.out.println("\u001B[32mQuote by "+ author + " is: " + quote);
            else
                System.out.println("\u001B[31mThere is no such author '" + author + "'");
        }

        int randomIndex = randomQuoteIndex(0, quotes.length);
        System.out.println();
        System.out.println("\u001B[35mRandom Quote");
        System.out.println("\u001B[0m"+quotes[randomIndex]);

    }

    public static int randomQuoteIndex(int min, int max){
        return (int) (Math.random() * max) + min;
    }

    public static Quote[] readJson(String path){
        Gson gson = new Gson();
        Quote[] quotes = null;
        try{
            FileReader reader = new FileReader(path);
            quotes = gson.fromJson(reader, Quote[].class);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return quotes;
    }
    public static boolean isFound(Quote[] quotes, Quote quote){
        for(Quote q: quotes){
            if(q.getAuthor().equals(quote.getAuthor()))
                return true;
        }
        return false;
    }

    public static String getQuote(Quote[] quotes,String author){
        for (Quote quote: quotes){
            if (quote.getAuthor().equals(author))
                return quote.getText();
        }
        return null;
    }

    public static String makeAuthorName(String[] args){
        String name = "";
        for(String word: args){
            name+=word +" ";
        }
        return name.substring(0, name.length()-1);
    }

}
