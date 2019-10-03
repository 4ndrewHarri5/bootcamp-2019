package com.manchesterDigital;

public class Book {


    private String name;
    private String author;
    private String isbn;
    private Printer printer;

    // constructor, getters, setters ...

    public Book(String name, String author, String isbn) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.printer = new Printer();
    }



    /*testing
        - fewer tests to write since a class does just one thing

    - lower coupling
        - your class will rely less on others
        - if a class has to rely on something it is tightly coupled
    */

    public boolean isInIsbn(String sequence) {

        return isbn.contains(sequence);

    }

    public void printToConsole() { // this is not SRP since the sole prorpose of Book isnt to print, therefore youd make another class called Printer that will do this
        printer.printToConsole(String.format("Book %s, Author %s, ISBN %s", name, author, isbn));
    }


}
