package com.company;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Builder {
    private  CageImpl Cage1;
    private  CageImpl Cage2;
    private  CageImpl Cage3;
    private  CageImpl Cage4;
    ArrayList<Species> list1=new ArrayList<>();
    Condition condition;
    public Builder(){
        list1.add(Species.LEON);
        list1.add(Species.GIRAFFE);
        Cage1=new CageImpl(1,6.,condition=new ConditionImpl(list1),false);
        Cage2=new CageImpl(2,10.,condition=new ConditionImpl(list1),false);
        list1.removeAll(list1);
        list1.add(Species.PENGUIN);
        Cage3=new CageImpl(3,2.,condition=new ConditionImpl(list1),false);
        list1.removeAll(list1);
        list1.add(Species.SQUIRREL);
        Cage4=new CageImpl(4,4.,condition=new ConditionImpl(list1),false);
    }
    public Cage getCage(Animal animal) throws Exception{
        if((animal.getName().equals(Cage1.getName()) || Cage1.getName().equals(" "))
                && (animal.getSpecies()==Species.LEON || animal.getSpecies()==Species.GIRAFFE))
            return Cage1;
        if((animal.getName().equals(Cage2.getName()) || Cage2.getName().equals(" "))
                && (animal.getSpecies()==Species.LEON || animal.getSpecies()==Species.GIRAFFE))
            return Cage2;
        if(animal.getSpecies()==Species.PENGUIN)
            return Cage3;
        if(animal.getSpecies()==Species.SQUIRREL)
            return Cage4;
        else {
            throw new Exception("Wrong animal specie");
        }
    }
}
