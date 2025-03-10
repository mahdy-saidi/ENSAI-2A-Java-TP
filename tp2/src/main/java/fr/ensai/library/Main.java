package fr.ensai.library;

public class Main {

    public static void main(String[] args) {
        // Create an instance of the Library
        Library library = new Library("ENSAI Library");

        // Load books from books.csv
        library.loadBooksFromCSV("books.csv");

        // Display all books
        library.displayBooks();

        // Example book creation
        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing.toString());
    }
}