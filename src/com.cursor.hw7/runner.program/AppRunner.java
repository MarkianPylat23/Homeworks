package com.cursor.hw7.runner.program;

import com.cursor.hw7.library.Library;

import java.time.LocalDate;

public class AppRunner {
    private Library libraryList = new Library();

    public void runAllMethods() {
        libraryList.createBooks();
        libraryList.showList();
        libraryList.checkDate(LocalDate.of(2019, 12, 1));
        libraryList.checkDate(LocalDate.of(2019, 12, 6));
        libraryList.checkDate(LocalDate.of(2019, 12, 5));
        libraryList.checkDate(LocalDate.of(2019, 12, 4));
    }
}
