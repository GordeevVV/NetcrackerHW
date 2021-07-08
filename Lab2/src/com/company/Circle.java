package com.company;


public class Circle implements Shape{
    private double radius=1.0;
    private String color="red";
    private double area;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    @Override
    public double getArea(){
        area=Math.PI*Math.pow(radius,2);
        return area;
    }
    @Override
    public String toString(){
        return "Circle [radius="+radius+",  color="+color+"]"+"\n";
    }
}
