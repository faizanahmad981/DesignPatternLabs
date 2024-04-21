/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.contradodigital.Question4PartB;
import com.contradodigital.Question4PartB.IProduct;

/**
 *
 * @author Faizan
 */

public abstract class ProductAbstractFactory {
    protected abstract IProduct makeProduct();

    public IProduct getObject() {
        IProduct product = makeProduct();
        // Do something with the object after you get the object.
        product.setPrice(20.30);
        return product;
    }
}