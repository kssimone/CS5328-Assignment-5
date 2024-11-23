package com.example.question3;

import java.util.ArrayList;
import java.util.List;


public class BasicRideService extends ServicePrototype {

    private VehicleType vehicleType;

    public BasicRideService(String serviceId, String name, double basePrice, List<String> availableCities, VehicleType vehicleType) {
        super(serviceId, name, basePrice, availableCities);
        this.vehicleType = vehicleType;
    }

    public ServicePrototype clone() {

        BasicRideService clone = new BasicRideService( "BASIC", "Basic Ride", 10.0, new ArrayList<>(), VehicleType.SEDAN);
        return clone;

    }

    public void customizeCity(City city) {

        this.basePrice *= city.getPriceModifier("BASIC");

    }

}