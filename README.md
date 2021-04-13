# quotes
in this lab a [json file](app/src/main/resources/recentquotes.json) has been read and displayed one of its objects randomly

### requirements
the projects has the following classes:
* [Quote.java](app/src/main/java/quotes/Quote.java) this class to create an object of type Quote that has a name and text.
* [App.java](app/src/main/java/quotes/App.java) this class to read the json file, create quotes objects out of it and disply randomly quote
* [AppTest.java](app/src/test/java/quotes/AppTest.java) this class to test the App class and it has one method `testJsonHasQuote()` it tests if a specific Quote object exists in the list of objects that had been read from the json file 

the following methods had been created in the [App.java]((app/src/main/java/quotes/App.java)) class to make it work as the lab requires.

* `randomQuoteIndex(int <min>, int <max>)`: this method returns a random number between min and max, this number used to get a random quote.
* `readJson(String <path>)`: this method takes in the path of a json file and returns an array of type Quote.
* `isFound(Quote[] <quotes>, Quote <quote>)`: this method checks if a _quote_ exists in _quotes_. ([AppTest.java](app/src/test/java/quotes/AppTest.java))

### stretch goals
 
to make the user enter the author name from the terminal as an argument and prints the quote for that author, the follwoing methods get that done:
* `makeAuthorName(String[] <args>)`: since most of the authors have two or more syllable in their name, this method helps getting the right name with no spaces and return it as a string to use by the next method
* `getQuote(Quote[] <quotes>, String <author>)`: this methods takes in an author name and return a quote for that author if he is in the list, else it will return null.

## Run the code from terminal 
you need to pass the author name as an argument to the code.

**the author name must be written in quotes**

example:

`./gradlew run --args 'Ron Swanson'`

