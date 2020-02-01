package com.example.satana.Shapes;

import java.util.List;

public abstract class Shape {
public int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setVolume(double volume){
        this.volume = (int) volume;
    }

    static boolean getLiquid(List<Shape> shapes, int x,Box box){
        for(int i=0;i<shapes.size();i++){
            if(shapes.get(i).volume>x){
                System.out.println("Жидкость уместилась");
                break;
            }
            else if(box.volume<x){
                System.out.println("Король Артур на нас напали!");

            }

        }
        return false;
    }
}
