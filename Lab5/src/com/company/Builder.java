package com.company;

public class Builder {
    private  CageImpl LionCage;
    private  CageImpl GiraffeCage;
    private  CageImpl SquirrelCage;
    private  CageImpl PenguinCage;
    public Builder(){
        LionCage=new CageImpl(1,6.,,false);
        GiraffeCage=new CageImpl(2,10.,,false);
        SquirrelCage=new CageImpl(3,2.,,false);
        PenguinCage=new CageImpl(4,4.,,false);
    }

    public Cage getLionCage() {
        return LionCage;
    }

    public Cage getGiraffeCage() {
        return GiraffeCage;
    }

    public Cage getSquirrelCage() {
        return SquirrelCage;
    }

    public Cage getPenguinCage() {
        return PenguinCage;
    }
}
