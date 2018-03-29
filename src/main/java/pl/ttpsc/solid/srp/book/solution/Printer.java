/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.ttpsc.solid.srp.book.solution;

import java.util.Map;

/**
 *
 * @author Siwy
 */
public class Printer {
    
    private Book currentBook = new Book();
    
    /**
     * Prints the current page.
     */
    public void printCurrentPage() {
        System.out.println(currentBook.getCurrentPageContents());
    }

    /**
     * Prints all pages
     * @return
     */
    public String printAllPages() {

        String allPages = new String();
        do {
            allPages += currentBook.getCurrentPageContents();
        }
        while (currentBook.turnPage());
        return allPages;
    }
    
    /**
     * Sets book to print from
     * @param book
     */
    public void loadBook (Book book) {
        currentBook = book;
    }
}
