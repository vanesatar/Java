package sef.module9.activity;

public class Person {

    private int weight;
    private float height;

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public String getBodyMassIndex(double weight, double height) {
        if (weight <= 0 || weight > 600 || height <= 0 || height > 3.0) {
            return "Invalid input";
        }
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}