package com.example.satana.NewSerg;

import java.util.List;

public class TestMyMashine {
    public static void main(String[] args) {
        Mashine myCar= new Mashine();

        myCar.setModel("KOENIGSEGG AGERA R");
        myCar.setBodymashine("Кузов 1");
        myCar.setEngineMashine("5.0 MT");


//        myCar.setTransmissionCar((new TransmissionMashine("Задний",4,true)));
        TransmissionMashine transmissionCar=new TransmissionMashine("Задний",4,true);
        myCar.setTransmissionCar(transmissionCar);



        System.out.println("Модель авто:"+myCar.getModel()+"\nКузов: "+myCar.getBodymashine()+"\nДвигатель:"+myCar.getEngineMashine()+"\nТрансмиссия:"+myCar.getTransmissionCar().getPrivod());
    }
}
