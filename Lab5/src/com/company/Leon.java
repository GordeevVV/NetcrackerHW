package com.company;

public class Leon implements Animal{
    private String leonname;
    private final Species leonspecie=Species.LEON;

    public Leon(String leonname) {
        this.leonname = leonname;
    }

    @Override
    public String getName() {
        return leonname;
    }

    @Override
    public Species getSpecies() {
        return leonspecie;
    }

    @Override
    public void setName(String name) {
        this.leonname=name;
    }
}
