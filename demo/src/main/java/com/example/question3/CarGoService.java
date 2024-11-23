package com.example.question3;

import java.util.ArrayList;
import java.util.List;

// enum VehicleType {
//     SEDAN, HATCHBACK, SUV, TRUCK
// }

public class CarGoService extends ServicePrototype {

    private VehicleType vehicleType;

    private boolean isHatchBackOnly;

    public CarGoService(String serviceId, String name, double basePrice, List<String> availableCities, VehicleType vehicleType, boolean isHatchBackOnly) {

        super(serviceId, name, basePrice, availableCities);

        this.vehicleType = vehicleType;

        this.isHatchBackOnly = isHatchBackOnly;

    }

    public ServicePrototype clone() {
        CarGoService clone = new CarGoService("CARGO", "CarGo", 20.0, new ArrayList<>(), VehicleType.TRUCK, false);
        return clone;
    }


    public void customizeCity(City city) {

        this.basePrice *= city.getPriceModifier("CARGO");

    }

}