package com.example.satana.NewSerg;

public class TestMyMashine {
    public static void main(String[] args) {
        Mashine myCar= new Mashine();
        myCar.setModel("KOENIGSEGG AGERA R");
        myCar.setBodymashine("Кузов 1");
        myCar.setEngineMashine("5.0 MT");
        myCar.setTransmission("Задний");
        System.out.println("Модель авто:"+myCar.getModel()+"\nКузов: "+myCar.getBodymashine()+"\nПривод:"+myCar.getTransmission()+"\nДвигатель:"+myCar.getEngineMashine());
    }
}
