package com.cursor.hw7.library;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Library {
    Map<LocalDate, String> books = new HashMap();

    public void createBooks() {
        books.put(LocalDate.of(2019, 12, 1), "Harry Potter - Part1");
        books.put(LocalDate.of(2019, 12, 2), "Headfirst in Java");
        books.put(LocalDate.of(2019, 12, 3), "Henry Ford - Autobiography");
        books.put(LocalDate.of(2019, 12, 4), "Clean Code");
        books.put(LocalDate.of(2019, 12, 5), "Book of Tests");
    }

    public void showList() {
        System.out.println("Date of books - " + books.keySet());
        System.out.println("Books name - " + books.values());
    }

    public void checkDate(LocalDate date) {
        if (books.get(date) != null) {
            System.out.println("\n" + "Date: " + date + "\n" + "Book: " + books.get(date));
        } else {
            System.out.println("\n" + "Date: " + date + "\n" + "Book: " + "There are no books for this date");
        }
    }
}
