package fr.ensai.library;

public class Main {

    public static void main(String[] args) {
        // Create an instance of the Library
        Library library = new Library("ENSAI Library");

        // Load books from books.csv
        library.loadBooksFromCSV("books.csv");

        Magazine magazine1 = new Magazine("issn1", "issueNumber1", "title1", 1954, 423);
        Magazine magazine2 = new Magazine("issn2", "issueNumber2", "title2", 1954, 423);

        library.addItem(magazine1);
        library.addItem(magazine2);

        // Display all books
        library.displayItems();

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