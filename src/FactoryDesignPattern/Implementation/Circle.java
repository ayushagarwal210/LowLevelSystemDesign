package FactoryDesignPattern.Implementation;

import FactoryDesignPattern.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
