package com.makhabatusen.shapes;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculatePerimeter() {
        System.out.printf("\nPerimeter of Rectangle is: %.2f", 2 * (height + width));

    }

    @Override
    public void calculateArea() {
        System.out.printf("\nArea of Rectangle is: %.2f", height * width);
    }
}
