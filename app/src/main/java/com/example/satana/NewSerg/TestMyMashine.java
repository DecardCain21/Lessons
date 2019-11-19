package com.example.satana.NewSerg;

import java.util.List;

public class TestMyMashine {
    public static void main(String[] args) {
        Mashine myCar= new Mashine();

        myCar.setModel("KOENIGSEGG AGERA R");
        myCar.setBodymashine("Кузов 1");
        myCar.setEngineMashine("5.0 MT");


        TransmissionMashine transmissionMyCar=new TransmissionMashine();

        transmissionMyCar.setAirsuspension(true);
        transmissionMyCar.setNumwheel(4);
        transmissionMyCar.setPrivod("Задний");


        System.out.println("Модель авто:"+myCar.getModel()+"\nКузов: "+myCar.getBodymashine()+"\nДвигатель:"+myCar.getEngineMashine());
    }
}
