package model;

import org.springframework.boot.autoconfigure.domain.EntityScan;



public class Car {
    public Car(int id, String laguna, String renault, int year, java.awt.Color red) {
    }

    enum Color {
        RED,
        BLEU,
        GREEN,
        YELLOW
    }

    private long id;
    private String model;
    private String brand;
    private int year;
    private Color Color;

    public Car(){

    }

    public Car( long id, String model, String brand, int year, Car.Color color) {
        super();
        this.model = model;
        this.id = id;
        this.brand = brand;
        this.year = year;
        Color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car.Color getColor() {
        return Color;
    }

    public void setColor(Car.Color color) {
        Color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}