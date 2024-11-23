package com.example.question3;

import java.util.ArrayList;
import java.util.List;

public class CarEatsService extends ServicePrototype {

    private List<Restaurant> partners;

    private double deliveryRadius;

    public CarEatsService(String serviceId, String name, double basePrice, List<String> availableCities, List<Restaurant> partners, double deliveryRadius) {

        super(serviceId, name, basePrice, availableCities);
        this.partners = partners;
        this.deliveryRadius = deliveryRadius;

    }

    public void customizeCity(City city) {

        this.basePrice *= city.getPriceModifier("CAREATS");

    }

    public ServicePrototype clone() {

        CarEatsService clone = new CarEatsService("CAREATS", "CarEats", 5.0, new ArrayList<>(), new ArrayList<>(), 5.0);
        return clone;

    }

}