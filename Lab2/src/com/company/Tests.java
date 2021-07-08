package com.company;
import org.junit.Assert;
import  org.junit.Test;

public class Tests {
    @Test
    public void Triangle_Side_A(){
        Triangle tr=new Triangle(5,6,4);
        double actual=tr.getA();
        Assert.assertEquals(5.,actual,0.0);
    }
    @Test
    public void Triangle_Side_B(){
        Triangle tr=new Triangle(1,2,2);
        double actual=tr.getB();
        Assert.assertEquals(2.,actual,0.0);
    }
    @Test
    public void Triangle_Side_C(){
        Triangle tr=new Triangle(2,3,2);
        double actual=tr.getC();
        Assert.assertEquals(2.,actual,0.0);
    }
    @Test
    public void Triangle_Color(){
        Triangle tr=new Triangle(2,3,2,"red");
        String actual=tr.getColor();
        Assert.assertEquals("red",actual);
    }
    @Test
    public void Triangle_Area_correct(){
        Triangle tr=new Triangle(5,6,4);
        double actual=tr.getArea();
        Assert.assertEquals(9.921567416492215,actual,0.0);
    }
    @Test
    public void Circle_radius(){
        Circle cr=new Circle(4);
        double actual=cr.getRadius();
        Assert.assertEquals(4,actual,0.0);
    }

    @Test
    public void Circle_Color(){
        Circle cr=new Circle(4,"blue");
        String actual=cr.getColor();
        Assert.assertEquals("blue",actual);
    }
    @Test
    public void Circle_Area_correct(){
        Circle cr=new Circle(4,"blue");
        double actual=cr.getArea();
        double correct=Math.PI*cr.getRadius()*cr.getRadius();
        Assert.assertEquals(correct,actual,0.0);
    }
    @Test
    public void Ellipse_radius1(){
        Ellipse el=new Ellipse(5,6,"green");
        double actual=el.getR1();
        Assert.assertEquals(5,actual,0.0);
    }
    @Test
    public void Ellipse_radius2(){
        Ellipse el=new Ellipse(5,6,"green");
        double actual=el.getR2();
        Assert.assertEquals(6,actual,0.0);
    }
    @Test
    public void Ellipse_Color(){
        Ellipse el=new Ellipse(5,6,"green");
        String actual=el.getColor();
        Assert.assertEquals("green",actual);
    }
    @Test
    public void Ellipse_Area_correct(){
        Ellipse el=new Ellipse(5,6,"green");
        double actual=el.getArea();
        double correct=Math.PI*el.getR1()*el.getR2();
        Assert.assertEquals(correct,actual,0.0);
    }
    @Test
    public void Square_Side(){
        Square sq=new Square();
        double actual=sq.getSide();
        Assert.assertEquals(4,actual,0.0);
    }
    @Test
    public void Square_Color(){
        Square sq=new Square();
        String actual=sq.getColor();
        Assert.assertEquals("blue",actual);
    }
    @Test
    public void Square_Area_correct(){
        Square sq=new Square();
        double actual=sq.getArea();
        double correct=sq.getSide()* sq.getSide();
        Assert.assertEquals(correct,actual,0.0);
    }
}
