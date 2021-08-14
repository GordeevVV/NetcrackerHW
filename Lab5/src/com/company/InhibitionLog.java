package com.company;

public class InhibitionLog {
    private String state;
    private String name;
    private Species specie;

    public InhibitionLog(String state, String name,Species specie) {
        this.state = state;
        this.name = name;
        this.specie = specie;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public Species getSpecie() {
        return specie;
    }

    @Override
    public String toString() {
        return state+" "+name+ " "+specie;
    }
}
