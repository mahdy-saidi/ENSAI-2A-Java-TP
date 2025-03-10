package fr.ensai.library;

import java.util.Date;

public class Loan {
    private Student borrower;
    private Item item;
    private Date startDate;
    private Date returnDate;

    public Loan(Student borrower, Item item, Date startDate) {
        this.borrower = borrower;
        this.item = item;
        this.startDate = startDate;
        this.returnDate = null;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Item " + item + " borrowed by " + borrower + ".";
    }
}