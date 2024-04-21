/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.contradodigital.abstractfactory;

/**
 *
 * @author Faizan
 */


public class ShapeFactory implements AbstractFactory {

    @Override
    public Shape createShape(String type) {
        if ("Circle".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("Square".equalsIgnoreCase(type)) {
            return new Square();
        } else if ("Triangle".equalsIgnoreCase(type)) {
            return new Triangle();
        } else {
            throw new IllegalArgumentException("Invalid shape type: " + type);
        }
    }
}
