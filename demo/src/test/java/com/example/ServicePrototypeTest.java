package com.example;

import org.junit.Test;

import com.example.question3.CarEatsService;
import com.example.question3.CarGoService;
import com.example.question3.City;
import com.example.question3.Restaurant;
import com.example.question3.BasicRideService;

import com.example.question3.VehicleType;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class ServicePrototypeTest {

    @Test
    public void testCityGetPriceModifier() {
        City city = new City("1", "TestCity", "TestCountry");
        city.setPriceModifier("BASIC", 1.5);
        assertEquals(1.5, city.getPriceModifier("BASIC"), 0.001);
    }

    @Test
    public void testCitySetPriceModifier() {
        City city = new City("1", "TestCity", "TestCountry");
        city.setPriceModifier("BASIC", 1.5);
        assertEquals(1.5, city.getPriceModifier("BASIC"), 0.001);
    }

    @Test
    public void testBasicRideServiceClone() {
        List<String> cities = new ArrayList<>();
        cities.add("City1");
        BasicRideService service = new BasicRideService("BASIC", "Basic Ride", 10.0, cities, VehicleType.SEDAN);
        BasicRideService clone = (BasicRideService) service.clone();
        assertNotSame(service, clone);
        assertEquals(service.getServiceDetails(), clone.getServiceDetails());
    }

    @Test
    public void testCarGoServiceClone() {
        List<String> cities = new ArrayList<>();
        cities.add("City1");
        CarGoService service = new CarGoService("CARGO", "CarGo", 20.0, cities, VehicleType.TRUCK, false);
        CarGoService clone = (CarGoService) service.clone();
        assertNotSame(service, clone);
        assertEquals(service.getServiceDetails(), clone.getServiceDetails());
    }

    @Test
    public void testCarEatsServiceClone() {
        List<String> cities = new ArrayList<>();
        cities.add("City1");
        List<Restaurant> partners = new ArrayList<>();
        CarEatsService service = new CarEatsService("CAREATS", "CarEats", 5.0, cities, partners, 5.0);
        CarEatsService clone = (CarEatsService) service.clone();
        assertNotSame(service, clone);
        assertEquals(service.getServiceDetails(), clone.getServiceDetails());
    }

    @Test
    public void testBasicRideServiceCustomizeCity() {
        List<String> cities = new ArrayList<>();
        cities.add("City1");
        BasicRideService service = new BasicRideService("BASIC", "Basic Ride", 10.0, cities, VehicleType.SEDAN);
        City city = new City("1", "TestCity", "TestCountry");
        city.setPriceModifier("BASIC", 1.5);
        service.customizeCity(city);
        assertEquals(15.0, service.getBasePrice(), 0.001);
    }

    @Test
    public void testCarGoServiceCustomizeCity() {
        List<String> cities = new ArrayList<>();
        cities.add("City1");
        CarGoService service = new CarGoService("CARGO", "CarGo", 20.0, cities, VehicleType.TRUCK, false);
        City city = new City("1", "TestCity", "TestCountry");
        city.setPriceModifier("CARGO", 2.0);
        service.customizeCity(city);
        assertEquals(40.0, service.getBasePrice(), 0.001);
    }

    @Test
    public void testCarEatsServiceCustomizeCity() {
        List<String> cities = new ArrayList<>();
        cities.add("City1");
        cities.add("City2");
        List<Restaurant> partners = new ArrayList<>();
        partners.add(new Restaurant("1", "TestRestaurant", "TestCity"));
        partners.add(new Restaurant("2", "TestRestaurant", "TestCity"));
        CarEatsService service = new CarEatsService("CAREATS", "CarEats", 5.0, cities, partners, 5.0);
        City city = new City("1", "TestCity", "TestCountry");
        city.setPriceModifier("CAREATS", 1.2);
        service.customizeCity(city);
        assertEquals(6.0, service.getBasePrice(), 0.001);
    }
}