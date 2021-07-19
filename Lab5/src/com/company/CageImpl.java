package com.company;

public class CageImpl implements Cage {
    private int number;
    private double area;
    private Condition condition;
    private boolean vacant;
    public CageImpl(int number,double area,Condition condition,boolean vacant){
        this.number=number;
        this.area=area;
        this.condition=condition;
        this.vacant=vacant;
    }
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public Condition getCondition() {
        return condition;
    }

    @Override
    public boolean isVacantCage() {
        return false;
    }
}
