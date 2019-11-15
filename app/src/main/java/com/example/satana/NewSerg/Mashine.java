package com.example.satana.NewSerg;

public class Mashine {
    public static void main(String[] args) {
        Mashine myMashine = new Mashine();
        myMashine.Bodymashine("Кузов 1");
        myMashine.Transmission(4);
        myMashine.Engine("Двигатель v6");

    }
    public void  Bodymashine(String bodymashine){
        System.out.println("Кузов:"+bodymashine);
    }
    public void Transmission(int numwhel){
        System.out.println("Количество колёс:"+numwhel);
    }
    public void  Engine(String nameengine){
        System.out.println("Мотор:"+nameengine);
    }
}
