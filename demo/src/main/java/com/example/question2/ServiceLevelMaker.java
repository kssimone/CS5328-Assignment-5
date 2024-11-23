
package com.example.question2;

// ServiceLevelMaker as the Facade 

public class ServiceLevelMaker {

    private ServiceLevel carPOOL;

    private ServiceLevel carX;

    private ServiceLevel carBlack;

    public ServiceLevelMaker() {

        carPOOL = new carPool();

        carX = new carX();

        carBlack = new carBlack();

    }



    public double calculateCarPOOLPrice() {

        return carPOOL.calculatePrice();

    }



    public double calculateCarXPrice() {

        return carX.calculatePrice();

    }



    public double calculateCarBlackPrice() {

        return carBlack.calculatePrice();

    }

}


