package com.example.question3;

import java.util.HashMap;
import java.util.Map;

public class ServiceRegistry {

    private Map<String, ServicePrototype> prototypes = new HashMap<>();

    public void registerPrototype(String serviceType, ServicePrototype prototype) {
        prototypes.put(serviceType, prototype);
    }

    public ServicePrototype cloneService(String serviceType, City city) {

        ServicePrototype prototype = prototypes.get(serviceType);

        if (prototype == null) {

            throw new IllegalArgumentException("Service type not found");

        }

        ServicePrototype clone = prototype.clone();
        clone.customize(city);

        return clone;

    }
}
