package com.company;

public class CageImpl implements Cage {
    private final int number;
    private final double area;
    private final Condition condition;
    private boolean vacant;
    private String name;
    public CageImpl(int number,double area,Condition condition,boolean vacant){
        this.number=number;
        this.area=area;
        this.condition=condition;
        this.vacant=vacant;
        name=" ";
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
        return vacant;
    }
    public void setVacant(boolean vacant,String name){
        this.vacant=vacant;
    }

    public String getName() {
        return name;
    }
}
