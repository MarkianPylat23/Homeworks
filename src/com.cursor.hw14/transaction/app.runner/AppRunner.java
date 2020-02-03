package com.cursor.hw14.transaction.app.runner;

import com.cursor.hw14.transaction.user.service.ReadOperation;
import com.cursor.hw14.transaction.user.service.WriteOperation;

public class AppRunner {
    public void runApp(){

        new Thread(()->new WriteOperation().run()).start();
        new Thread(()-> new ReadOperation().run()).start();
    }
}
