/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.contradodigital.abstractfactory;

/**
 *
 * @author Faizan
 */

public class ConcreteShapeFactory extends ShapeFactory {
    @Override
    public Shape createShape(String type) {
        if (type.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (type.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        } else {
            throw new IllegalArgumentException("Invalid shape type: " + type);
        }
    }
}