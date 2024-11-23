# CS5328-Assignment-5
Questions #2 and #3

Question 2 Files for the Service Level Facade Pattern are in CS5328-Assignment-5\demo\src\main\java\com\example\question2

Its test file is ServiceLevelTest.java in CS5328-Assignment-5\demo\src\test\java\com\example

Question 3 Files for the Service Prototype Pattern are in CS5328-Assignment-5\demo\src\main\java\com\example\question3

Its test file is ServicePrototypeTest.java in CS5328-Assignment-5\demo\src\test\java\com\example

Project Structure
```
.gitignore
.idea/
demo/
    pom.xml
    src/
        main/
            java/
                com/
                    example/
                        question2/
                            ServiceLevel.java
                            carX.java
                            carBlack.java
                            carPool.java
                            ServiceLevelMaker.java
                        question3/
                            BasicRideService.java
                            CarEatsService.java
                            CarGoService.java
                            City.java
                            Restaurant.java
                            ServicePrototype.java
                            ServiceRegistry.java
                            VehicleType.java
        test/
            java/
                com/
                    example/
                        ServiceFacadeTest.java
                        ServicePrototypeTest.java
                        
lib/
    hamcrest-core-1.3.jar
    junit-4.13.2.jar
README.md
```

Dependencies

To run the tests, you need JUnit 4.13.2

```
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
```
Classes

Question 2

ServiceLevel: Interface defining the calculatePrice method.

carX: Implements ServiceLevel with a fixed price of 20.0.

carBlack: Implements ServiceLevel with a fixed price of 50.0.

carPool: Implements ServiceLevel with a fixed price of 10.0.

ServiceLevelMaker: Facade class that provides methods to calculate prices for different service levels.

Question 3

ServicePrototype: Abstract class defining the prototype for services. Includes methods for cloning and customizing services.

BasicRideService: Extends ServicePrototype for basic ride services.

CarEatsService: Extends ServicePrototype for food delivery services.

CarGoService: Extends ServicePrototype for cargo services.

City: Represents a city with price modifiers for different services.

Restaurant: Represents a restaurant partner for CarEatsService.

ServiceRegistry: Manages service prototypes and provides methods to clone and customize services.

VehicleType: Enum defining different vehicle types (SEDAN, HATCHBACK, SUV, TRUCK).

Running the Tests
