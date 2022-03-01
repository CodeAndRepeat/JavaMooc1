/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coffeina
 */
public class Book {

    private String title;
    private int pages;
    private int year;

    public Book(String initialTitle, int initialPages, int initalYear) {
        this.title = initialTitle;
        this.pages = initialPages;
        this.year = initalYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
