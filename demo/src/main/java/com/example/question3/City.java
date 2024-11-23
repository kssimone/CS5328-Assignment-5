package com.example.question3;

import java.util.HashMap;
import java.util.Map;

public class City {

    private String cityId;

    private String name;

    private String country;

    private Map<String, Double> priceModifiers;

    private double deliveryRadius;

    public City(String cityId, String name, String country) {

        this.cityId = cityId;

        this.name = name;

        this.country = country;

        this.priceModifiers = new HashMap<>();

        this.deliveryRadius = 5.0;
    }

    public double getPriceModifier(String serviceType) {

        return priceModifiers.getOrDefault(serviceType, 1.0);
    }

    public void setPriceModifier(String serviceType, double modifier) {
        priceModifiers.put(serviceType, modifier);
    }

    public double getDeliveryRadius() {

        return deliveryRadius;
    }

}
