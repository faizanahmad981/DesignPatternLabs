/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.contradodigital.abstractfactory;

/**
 *
 * @author Faizan
 */

public abstract class CircleFactory implements AbstractFactory {
    public Shape createShape() {
        return new Circle();
    }
}
