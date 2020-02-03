package com.cursor.hw14.transaction.user.service;

import com.cursor.hw14.transaction.db.DataBase;

public class WriteOperation implements Runnable{

    private DataBase database = DataBase.getDataBase();

    @Override
    public void run() {
        database.addData(1, "transaction #1");
        database.addData(2, "transaction #2");
        database.addData(3, "transaction #3");
        database.addData(4, "transaction #4");
        try {
            Thread.sleep(350);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        database.addData(5, "transaction #5");
        database.addData(6, "transaction #6");
        database.addData(7, "transaction #7");
        database.addData(8, "transaction #8");
        database.addData(9, "transaction #9");
        database.addData(10, "transaction #10");
        database.addData(11, "transaction #11");
        database.addData(12, "transaction #12");
        database.addData(13, "transaction #13");
        database.addData(14, "transaction #14");
        database.addData(15, "transaction #15");
    }
}
