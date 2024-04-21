package com.contradodigital.Question4PartB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author techenclavecomputers
 */

public abstract class Phone implements IProduct {
    private double price;

    public String getName() {
        return "Apple TouchPad";
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
