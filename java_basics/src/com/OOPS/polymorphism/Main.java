package com.OOPS.polymorphism;

public class Main {
    static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Square  square = new Square();

        shape.area();
        circle.area();
        square.area();
    }
}
