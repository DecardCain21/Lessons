package com.example.satana.NewSerg;

import java.util.List;

public class TestMyMashine {
    public static void main(String[] args) {
        Mashine myCar= new Mashine();

        myCar.setModel("KOENIGSEGG AGERA R");
        myCar.setBodymashine("Кузов 1");
        myCar.setEngineMashine("5.0 MT");

        System.out.println("Модель авто:"+myCar.getModel()+"\nКузов: "+myCar.getBodymashine()+"\nТрансмиссия:"+myCar.getTransmissionCar()+"\nДвигатель:"+myCar.getEngineMashine());
    }
}
