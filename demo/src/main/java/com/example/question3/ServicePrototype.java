package com.example.question3;

import java.util.List;

abstract class ServicePrototype {

    protected String serviceId;

    protected String name;

    protected double basePrice;

    protected List<String> availableCities;

    public ServicePrototype(String serviceId, String name, double basePrice, List<String> availableCities) {

        this.serviceId = serviceId;

        this.name = name;

        this.basePrice = basePrice;

        this.availableCities = availableCities;

    }

    public abstract ServicePrototype clone();// clones the prototype, initializes List
    

    public void customize(City city) {// leads into city specifics

    }

    public String getServiceDetails() {// gets the price and service name

        return "Service: " + this.name + " Price: " + this.basePrice;

    }

    //generate getters and setters
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public List<String> getAvailableCities() {
        return availableCities;
    }

    public void setAvailableCities(List<String> availableCities) {
        this.availableCities = availableCities;
    }


}
