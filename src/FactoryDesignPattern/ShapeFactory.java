package FactoryDesignPattern;

import FactoryDesignPattern.Implementation.Circle;
import FactoryDesignPattern.Implementation.Square;

public class ShapeFactory {
    Shape getShape(String input){
        switch (input){
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            default:
                return null;
        }
    }
}
