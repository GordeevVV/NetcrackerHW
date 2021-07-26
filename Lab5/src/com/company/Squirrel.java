package com.company;

public class Squirrel implements Animal{
    private String squirrelname;
    private final Species squirrelspecie=Species.SQUIRREL;

    public Squirrel(String squirrelname) {
        this.squirrelname = squirrelname;
    }

    @Override
    public String getName() {
        return squirrelname;
    }

    @Override
    public Species getSpecies() {
        return squirrelspecie;
    }

    @Override
    public void setName(String name) {
        this.squirrelname=name;
    }
}
