package com.example;

import org.junit.Test;

import com.example.question2.ServiceLevelMaker;

import static org.junit.Assert.*;

public class ServiceFacadeTest {

    @Test
    public void testCalculateCarPOOLPrice() {
        ServiceLevelMaker serviceLevelMaker = new ServiceLevelMaker();
        double price = serviceLevelMaker.calculateCarPOOLPrice();
        assertEquals(10.0, price, 0.001);
    }

    @Test
    public void testCalculateCarXPrice() {
        ServiceLevelMaker serviceLevelMaker = new ServiceLevelMaker();
        double price = serviceLevelMaker.calculateCarXPrice();
        assertEquals(20.0, price, 0.001);
    }

    @Test
    public void testCalculateCarBlackPrice() {
        ServiceLevelMaker serviceLevelMaker = new ServiceLevelMaker();
        double price = serviceLevelMaker.calculateCarBlackPrice();
        assertEquals(50.0, price, 0.001);
    }
}