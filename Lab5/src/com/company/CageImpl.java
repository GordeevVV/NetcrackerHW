package com.company;

public class CageImpl implements Cage {
    private final int number;
    private final double area;
    private final Condition condition;
    private boolean vacant;
    private Animal animal;
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
        return vacant;
    }

    @Override
    public void setVacant(boolean vacant,String name){
        this.vacant=vacant;
    }

    @Override
    public Animal getAnimal() {
        return this.animal;
    }

    @Override
    public void setAnimal(Animal animal) {
        this.animal=animal;
    }

}
