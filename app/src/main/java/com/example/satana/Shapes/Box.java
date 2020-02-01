package com.example.satana.Shapes;

public class Box extends Shape {
    Box(int volume){
        this.volume=volume;
    }

    public void setVolume(int volume){ this.volume=volume * 2; }
}
