package fr.ensai.library;

public class Item {
    private String title;
    private int year;
    private int pageCount;

    public Item(String title, int year, int pageCount) {
        this.title = title;
        this.year = year;
        this.pageCount = pageCount;
    }
    public String getTitle() {
        return this.title;
    }

}
