package FactoryDesignPattern.Implementation;

import FactoryDesignPattern.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square");
    }
}
