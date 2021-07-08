package com.company;

public class Triangle implements Shape {
    private double a=5,b=5,c=6;
    private double area,p;
    private String color="green";
    public Triangle(){
    }
    public Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public Triangle(double a,double b,double c,String color){
        this.a=a;
        this.b=b;
        this.c=c;
        this.color=color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea(){
        if(a+b<c || a+c<b || b+c<a){
            System.out.println("Incorrect sizes input");
            System.exit(0);
        }
        p=(a+b+c)/2;
        area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
    @Override
    public String toString(){
        return "Triangle [a="+a+",  b="+b+",  c="+c+",  color="+color+"]"+"\n";
    }
}
