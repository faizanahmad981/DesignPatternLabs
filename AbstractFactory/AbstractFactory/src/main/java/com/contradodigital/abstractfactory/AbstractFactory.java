package com.contradodigital.abstractfactory;

public interface AbstractFactory {
    Shape createShape(String type);
    public static void main(String[] args) {
        // Create a ShapeFactory
        AbstractFactory shapeFactory = new ShapeFactory();

        // Use the ShapeFactory to create a new shape
        Shape circle = shapeFactory.createShape("Circle");
        Shape square = shapeFactory.createShape("Square");
        Shape triangle = shapeFactory.createShape("Triangle");

        // Call the draw method on the created shapes
        circle.draw();
        square.draw();
        triangle.draw();
    }
}