package Models;

public class Car {
    private String model;
    private int year;
    private int number;

    public Car (String model, int year, int number) {
        this.model = model;
        this.year = year;
        this.number = number;
    }

    public Car () {}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
