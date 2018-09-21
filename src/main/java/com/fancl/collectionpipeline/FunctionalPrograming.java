package com.fancl.collectionpipeline;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 函数式编程
 */
public class FunctionalPrograming {
    private FunctionalPrograming() {
    }

    public static List<String> getModelsYearAfter(List<Car> cars, int year) {
        return cars.stream().filter(car -> car.getYear() > year).sorted(Comparator.comparing(Car::getYear)).map(Car::getModel).collect(Collectors.toList());
    }

    public static Map<Category, List<Car>> groupByCategory(List<Car> cars) {
        return cars.stream().collect(Collectors.groupingBy(Car::getCategory));
    }

    public static List<Car> getSedanCarOrderbyYear(List<Car> cars) {
        return cars.stream().filter(car -> car.getCategory() == Category.SEDAN).sorted(Comparator.comparing(Car::getYear)).collect(Collectors.toList());
    }
}
