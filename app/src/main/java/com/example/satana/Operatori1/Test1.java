package com.example.satana.Operatori1;

import com.example.satana.MethodBus.Bus;

public class Test1 {
    public static void main(String[] args) {
        Bus ourBus;//=new Bus();
        Bus firstBus;//=new Bus();
        Bus secondBus;//=new Bus();
        ourBus = new Bus();
        firstBus = new Bus();
        secondBus = new Bus();

        ourBus.collor = "Pink";
        firstBus.collor = "Red";
        secondBus.collor = "Grey";

        ourBus.showCollor();
        firstBus.showCollor();
        secondBus.showCollor();

    }
}
