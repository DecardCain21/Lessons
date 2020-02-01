package com.example.satana.Shapes;

import java.util.ArrayList;
import java.util.List;

import static com.example.satana.Shapes.Shape.getLiquid;

public class mmmMain {
    public static void main(String[] args) {
        List<Shape> listshapes = new ArrayList<>();

        Circle circle = new Circle(10);
        Square square = new Square(15);
        Box box = new Box(13);

        listshapes.add(circle);
        listshapes.add(square);

        int liquid= 5;

System.out.println(getLiquid(listshapes,liquid,box));

    }
}
