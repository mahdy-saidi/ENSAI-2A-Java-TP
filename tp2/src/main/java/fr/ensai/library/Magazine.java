package fr.ensai.library;

/**
 * Represents a book.
 */

public class Magazine extends Item {

    // Attributes
    private String issn;
    private String issueNumber;

    /**
     * Constructs a new Book object.
     */

    public Magazine(String issn, String issueNumber, String title, int year, int pageCount) {
        super(title, year, pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber;
    }

}
