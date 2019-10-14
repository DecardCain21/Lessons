package com.example.satana.MyHome;

public class Dom {
    public static void main(String[] args) {
        Dom myhome = new Dom();
        Portch portch = new Portch();
        Apartments apartments = new Apartments();


        portch.countapartments=250;
        portch.elevator=true;
        portch.garbage=true;

        apartments.getPeople();
        apartments.heating=true;
        apartments.gas =true;

        System.out.println("Людей в квартире 155:"+apartments.getPeople());
        System.out.println("Отопление в квартирах:"+apartments.heating);
        System.out.println("Газ в квартирах:"+apartments.gas);

        System.out.println("Количество квартир в доме:"+portch.countapartments);
        System.out.println("Мусоропровод:"+portch.garbage);
        System.out.println("Лифт:"+portch.elevator);
    }
}
