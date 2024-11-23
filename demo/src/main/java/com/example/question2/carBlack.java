package com.example.question2;

public class carBlack implements ServiceLevel {

    @Override

    public double calculatePrice() {

        System.out.println("Calculating price for carBlack service.");
        return 50.0;
    }

}
