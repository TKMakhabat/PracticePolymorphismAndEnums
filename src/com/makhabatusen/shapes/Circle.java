package com.makhabatusen.shapes;

public class Circle extends Shape {
    private Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
        System.out.printf("\nPerimeter of Circle is: %.2f", Math.PI * 2 * radius);
    }

    @Override
    public void calculateArea() {
        System.out.printf("\nArea of Circle is: %.2f", Math.PI * radius * radius);
    }
}
