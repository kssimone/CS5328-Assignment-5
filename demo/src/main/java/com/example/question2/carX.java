package com.example.question2;

public class carX implements ServiceLevel {

    @Override

    public double calculatePrice() {

        System.out.println("Calculating price for carX service.");
        return 20.0;
    }

}