package com.company;

public class Penguin implements Animal{
    private String penguinname;
    private final Species penguinspecie=Species.PENGUIN;

    public Penguin(String penguinname) {
        this.penguinname = penguinname;
    }

    @Override
    public String getName() {
        return penguinname;
    }

    @Override
    public Species getSpecies() {
        return penguinspecie;
    }

    @Override
    public void setName(String name) {
        this.penguinname=name;
    }
}
