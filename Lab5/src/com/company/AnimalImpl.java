package com.company;

public class AnimalImpl implements Animal{
    private String name;
    private Species specie;
    public AnimalImpl(String name,Species specie){
        this.name=name;
        this.specie=specie;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Species getSpecies() {
        return specie;
    }
}
