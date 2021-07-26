package com.company;

public class AnimalFactory {
    public static Animal buildAnimal(String name, Species specie) throws ExceptionInInitializerError{
        Animal animal;
        if(specie.equals(Species.LEON))
            return animal=new Leon(name);
        else if(specie.equals(Species.SQUIRREL))
            return animal=new Squirrel(name);
        else if(specie.equals(Species.PENGUIN))
            return animal=new Penguin(name);
        else if (specie.equals(Species.GIRAFFE))
            return animal=new Giraffe(name);
        else throw new ExceptionInInitializerError();
    }
}
