package ru.task.figure;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public static double getRandomDoubleBetweenRange(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        return x;
    }
    public static void main(String[] args) {
     double d = getRandomDoubleBetweenRange(0,5);
        System.out.println(d);
    }



}
