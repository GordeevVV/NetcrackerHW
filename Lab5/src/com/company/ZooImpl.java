package com.company;

import com.company.Animal;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ZooImpl implements Zoo{
    private JDBC jdbc=new JDBC();
    private Builder builder=new Builder();
    InhibitionLog inhibitionLog;
    @Override
    public void checkInAnimal(Animal animal) throws Exception{
        inhibitionLog= new InhibitionLog("check-in", animal.getName(), animal.getSpecies());
        Cage cage=builder.getCage(animal);
        if(cage.isVacantCage()){
            cage.setVacant(false, animal);
            System.out.println(inhibitionLog);
            jdbc.cageSetVacant(cage,animal);
            jdbc.setAnimal(animal,cage.getNumber());
            jdbc.addLogList(inhibitionLog);
        }
        else {
            throw new Exception(animal.getName()+"'s cage is busy");
        }
    }

    @Override
    public void checkOutAnimal(Animal animal) throws Exception{
        inhibitionLog= new InhibitionLog("check-out", animal.getName(), animal.getSpecies());
        Cage cage=builder.getCage(animal);
        if(!cage.isVacantCage()){
            cage.setVacant(true,null);
            System.out.println(inhibitionLog);
            jdbc.cageSetVacant(cage);
            jdbc.delAnimal(animal.getName());
            jdbc.addLogList(inhibitionLog);
        }
        else {
            throw new Exception(animal.getName()+"'s cage is free already");
        }
    }

    @Override
    public List<InhibitionLog> getHistory() throws SQLException {
        return jdbc.getLogList();
    }
    public Animal nameToAnimal(String name) throws NoSuchFieldException{
       return builder.nameToAnimal(name);
    }

}