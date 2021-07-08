package com.company;

public class Ellipse implements Shape{
    private double r1=2,r2=4,area;
    private String color="yellow";
    public Ellipse(){

    }
    public Ellipse(double r1,double r2){
        this.r1=r1;
        this.r2=r2;
    }
    public Ellipse(double r1,double r2,String color){
        this.r1=r1;
        this.r2=r2;
        this.color=color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setR1(double r1) {
        this.r1 = r1;
    }

    public void setR2(double r2) {
        this.r2 = r2;
    }

    public String getColor() {
        return color;
    }

    public double getR1() {
        return r1;
    }

    public double getR2() {
        return r2;
    }

    @Override
    public double getArea(){
        area=Math.PI*r1*r2;
        return area;
    }
    @Override
    public String toString(){
        return "Ellipse [r1="+r1+",  r2="+r2+",  color="+color+"]"+"\n";
    }
}
