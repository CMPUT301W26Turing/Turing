package com.example.turing;

public class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getArea() {
        return width * height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
