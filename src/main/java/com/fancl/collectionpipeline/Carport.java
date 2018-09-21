package com.fancl.collectionpipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carport {


    public List<Car> getCars() {
        return Arrays.asList(new Car("Jeep", "Wrangler", 2011, Category.JEEP),
                new Car("Jeep", "Comanche", 1990, Category.JEEP),
                new Car("Dodge", "Avenger", 2010, Category.SEDAN),
                new Car("Buick", "Cascada", 2016, Category.CONVERTIBLE),
                new Car("Ford", "Focus", 2012, Category.SEDAN),
                new Car("Chevrolet", "Geo Metro", 1992, Category.CONVERTIBLE));

    }
}
