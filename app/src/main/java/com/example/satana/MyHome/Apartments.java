package com.example.satana.MyHome;

import java.util.Random;

public class Apartments {
    Random random = new Random();

    public int people=random.nextInt(4);
    public boolean heating;

    public boolean isHeating() {
        return heating;
    }

    public void setHeating(boolean heating) {
        this.heating = heating;
    }

    public boolean gas;

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }



    public boolean getGas() {
        return gas;
    }

    public void setGas(boolean gas) {
        this.gas = gas;
    }
}
