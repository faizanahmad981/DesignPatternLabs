package com.contradodigital.Question4PartB;

public class PhoneConcreteFactory extends ProductAbstractFactory {
    @Override
    protected IProduct makeProduct() {
        return new Phone() {
            @Override
            public void setPrice(double d) {
                // Do something with the price

            }
        };
    }
    
    public static void main(String[] args) {
        // Create an instance of PhoneConcreteFactory
        PhoneConcreteFactory factory = new PhoneConcreteFactory();

        // Call the makeProduct method
        IProduct product = factory.makeProduct();

        // Set the price of the product
        product.setPrice(20.30);

        // Output the name of the product
        System.out.println("Product name: " + product.getName());
    }
}
