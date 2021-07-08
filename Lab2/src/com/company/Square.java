package com.company;

public class Square implements Shape{
    private double side=4;
    private double area;
    private String color="blue";

    public Square(){

    }
    public Square(double a){
        this.side=a;
    }
    public Square(double a,String color){
        this.side=a;
        this.color=color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setSide(double a) {
        this.side = a;
    }

    public String getColor() {
        return color;
    }

    public double getSide() {
        return side;
    }
    @Override
    public double getArea(){
        area=side*side;
        return area;
    }
    @Override
    public String toString(){
        return "Square [side="+side+",  color="+color+"]"+"\n";
    }
}
