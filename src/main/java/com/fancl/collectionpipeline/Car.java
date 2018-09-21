package com.fancl.collectionpipeline;

import java.util.Objects;

public class Car {
    private String maker;
    private String model;
    private int year;
    private Category category;

    public Car(String maker, String model, int year, Category category) {
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(maker, car.maker) &&
                Objects.equals(model, car.model) &&
                category == car.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maker, model, year, category);
    }

    @Override
    public String toString() {
        return "Car{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", category=" + category +
                '}';
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Category getCategory() {
        return category;
    }
}
