/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.contradodigital.abstractfactory;

/**
 *
 * @author Faizan
 */


public class App {
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
