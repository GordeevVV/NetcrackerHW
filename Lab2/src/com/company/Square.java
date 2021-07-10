package com.company;

public class Square implements Shape{
    private double side=4;
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

    public void setSide(double a) throws Exception{
        if(a<=0)
            throw new Exception("wrong input");
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
        return side*side;
    }
    @Override
    public String toString(){
        return "Square [side="+side+",  color="+color+"]"+"\n";
    }
}
