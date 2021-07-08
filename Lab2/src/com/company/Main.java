package com.company;

public class Main {

    public static void main(String[] args) {
        Circle cl=new Circle();
        Triangle tr=new Triangle();
        Square sq=new Square();
        Ellipse el=new Ellipse();
        System.out.format(cl.toString());
        System.out.format("Circle area= %s \n \n",cl.getArea());
        System.out.format(tr.toString());
        System.out.format("Triangle area= %s \n \n",tr.getArea());
        System.out.format(sq.toString());
        System.out.format("Square area= %s \n \n",sq.getArea());
        System.out.format(el.toString());
        System.out.format("Ellipse area= %s \n \n",el.getArea());

    }
}
