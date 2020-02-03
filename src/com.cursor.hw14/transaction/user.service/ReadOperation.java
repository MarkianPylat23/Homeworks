package com.cursor.hw14.transaction.user.service;

import com.cursor.hw14.transaction.db.DataBase;

public class ReadOperation implements Runnable{

    private DataBase database = DataBase.getDataBase();

    @Override
    public void run() {
        database.getData(1);
        database.getData(2);
        database.getData(3);
        database.getData(4);
        database.getData(5);
        database.getData(6);
        database.getData(7);
        database.getData(8);
        database.getData(9);
        database.getData(10);
        try {
            Thread.sleep(350);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        database.getData(11);
        database.getData(12);
        database.getData(13);
        database.getData(14);
        database.getData(15);
    }
}
