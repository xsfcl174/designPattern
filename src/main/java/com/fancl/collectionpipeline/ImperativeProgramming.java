package com.fancl.collectionpipeline;

import java.util.*;

/**
 * 命令式编程
 */
public class ImperativeProgramming {
    private ImperativeProgramming() {
    }


    public static List<String> getModelsAfter2000(List<Car> cars) {
        List<Car> carsSortedByYear = new ArrayList<>();

        for (Car car : cars) {
            if (car.getYear() > 2000) {
                carsSortedByYear.add(car);
            }
        }

        Collections.sort(carsSortedByYear, new Comparator<Car>() {
            public int compare(Car car1, Car car2) {
                return new Integer(car1.getYear()).compareTo(car2.getYear());
            }
        });

        List<String> models = new ArrayList<>();
        for (Car car : carsSortedByYear) {
            models.add(car.getModel());
        }

        return models;
    }


    public static Map<Category, List<Car>> getGroupingOfCarsByCategory(List<Car> cars) {
        Map<Category, List<Car>> groupingByCategory = new HashMap<>();
        for (Car car : cars) {
            if (groupingByCategory.containsKey(car.getCategory())) {
                groupingByCategory.get(car.getCategory()).add(car);
            } else {
                List<Car> categoryCars = new ArrayList<>();
                categoryCars.add(car);
                groupingByCategory.put(car.getCategory(), categoryCars);
            }
        }
        return groupingByCategory;
    }


}