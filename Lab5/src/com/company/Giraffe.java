package com.company;

public class Giraffe implements Animal{
    private String giraffename;
    private final Species giraffespecie=Species.GIRAFFE;

    public Giraffe(String giraffename) {
        this.giraffename = giraffename;
    }

    @Override
    public String getName() {
        return giraffename;
    }

    @Override
    public Species getSpecies() {
        return giraffespecie;
    }

    @Override
    public void setName(String name) {
        this.giraffename=name;
    }
}
