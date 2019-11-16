package com.example.satana.NewSerg;

import java.util.List;

public class Mashine {

    private String Model;
    private String Bodymashine;
    private TransmissionMashine transmissionmyCar=new TransmissionMashine();
    private String EngineMashine;


    public TransmissionMashine getTransmissionCar() {
        return this.transmissionmyCar;
    }

    public void setTransmissionCar(TransmissionMashine transmissionCar) {
        this.transmissionmyCar = transmissionCar;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getBodymashine() {
        return Bodymashine;
    }

    public void setBodymashine(String bodymashine) {
        Bodymashine = bodymashine;
    }


    public String getEngineMashine() {
        return EngineMashine;
    }

    public void setEngineMashine(String engineMashine) {
        EngineMashine = engineMashine;
    }

    public static void main(String[] args) {
        System.out.println();
    }

}

//    public void  Bodymashine(String bodymashine){
//        System.out.println("Кузов:"+bodymashine);
//    }
//    public void Transmission(int numwhel){
//        System.out.println("Количество колёс:"+numwhel);
//    }
//    public void  EngineMashine(int enginemashine){
//        System.out.println("Кузов:"+enginemashine);
//    }
//public String getTransmission() {
//    return Transmission;
//}
//
//    public void setTransmission(String transmission) {
//        Transmission = transmission;
//    }
