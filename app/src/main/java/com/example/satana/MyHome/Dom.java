package com.example.satana.MyHome;

import java.util.ArrayList;

public class Dom {
    public static void main(String[] args) {
        Dom myhome = new Dom();
        Portch portch = new Portch();
        Apartments apartments = new Apartments();

        portch.setCountapartments(250);
        ArrayList<Apartments>listapart=new ArrayList<Apartments>();
        for(int i=0;i<portch.getCountapartments();i++){
            listapart.add(new Apartments());
        }

        portch.elevator=true;
        portch.garbage=true;

        apartments.getPeople();
        apartments.setHeating(true);
        apartments.setGas(true);

        System.out.println("Людей в квартире 155:"+apartments.getPeople());
        System.out.println("Отопление в квартирах:"+apartments.heating);
        System.out.println("Газ в квартирах:"+apartments.gas);

        System.out.println("Количество квартир в доме:"+listapart.size());
        System.out.println("Мусоропровод:"+portch.garbage);
        System.out.println("Лифт:"+portch.elevator);
    }
}
