package com.cursor.hw13.app.runner;

import com.cursor.hw13.service.Client;
import com.cursor.hw13.service.Request;

public class AppRunner {
    Client Lviv = new Client(new Request(), "Lviv");
    Client Kyiv = new Client(new Request(), "Kyiv");
    Client Ternopil = new Client(new Request(), "Ternopil");
    Client Sumy = new Client(new Request(), "Sumy");
    Client IvanoFrankivsk = new Client(new Request(), "IvanoFrankivsk");
    Client Cherkasy = new Client(new Request(), "Cherkasy");
    Client Chernivtsi = new Client(new Request(), "Chernivtsi");
    Client Mariupol = new Client(new Request(), "Mariupol");
    Client Kharkiv = new Client(new Request(),"Kharkiv");
    Client Rivne = new Client(new Request(), "Rivne");

    public void runApp() {
        Lviv.start();
        Kyiv.start();
        Ternopil.start();
        Sumy.start();
        IvanoFrankivsk.start();
        Cherkasy.start();
        Chernivtsi.start();
        Mariupol.start();
        Kharkiv.start();
        Rivne.start();
    }
}
