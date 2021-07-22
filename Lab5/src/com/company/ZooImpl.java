package com.company;

import com.company.Animal;
import java.util.ArrayList;
import java.util.List;

public class ZooImpl implements Zoo{
    private Builder builder=new Builder();
    private List<InhibitionLog> inhibitionLogList=new ArrayList<>();
    InhibitionLog inhibitionLog;
    @Override
    public void checkInAnimal(Animal animal) throws Exception{
        inhibitionLog= new InhibitionLog("check-in", animal.getName(), animal.getSpecies());
        if(builder.getCage(animal).isVacantCage()){
            throw new Exception(animal.getName()+"'s cage is busy");
        }
        else {
            builder.getCage(animal).setVacant(true, animal.getName());
            System.out.println(inhibitionLog);
            inhibitionLogList.add(inhibitionLog);
        }
    }

    @Override
    public void checkOutAnimal(Animal animal) throws Exception{
        inhibitionLog= new InhibitionLog("check-out", animal.getName(), animal.getSpecies());
        if(!builder.getCage(animal).isVacantCage()){
            throw new Exception(animal.getName()+"'s cage is free already");
        }
        else {
            builder.getCage(animal).setVacant(false," ");
            System.out.println(inhibitionLog);
            inhibitionLogList.add(inhibitionLog);
        }
    }

    @Override
    public List<InhibitionLog> getHistory() {
        return inhibitionLogList;
    }

}
/* switch(animal.getSpecies()){
        case LEON -> {
        if (builder.getLionCage().isVacantCage()) {
        throw new Exception("Lion's cage is free already");
        } else {
        builder.getLionCage().setVacant(false);
        System.out.println(inhibitionLog);
        inhibitionLogList.add(new InhibitionLog("check-out", animal.getName(), animal.getSpecies()));
        }}
        case GIRAFFE ->{
        if (builder.getGiraffeCage().isVacantCage()) {
        throw new Exception("Giraffe's cage is free already");
        } else {
        builder.getGiraffeCage().setVacant(false);
        System.out.println(inhibitionLog);
        inhibitionLogList.add(new InhibitionLog("check-out", animal.getName(), animal.getSpecies()));
        }}

        case SQUIRREL -> {
        if(builder.getSquirrelCage().isVacantCage()){
        throw new Exception("Squirrel's cage is free already");
        }
        else{
        builder.getSquirrelCage().setVacant(false);
        System.out.println(inhibitionLog);
        inhibitionLogList.add(new InhibitionLog("check-out", animal.getName(), animal.getSpecies()));
        }}

        case PENGUIN -> {
        if(builder.getPenguinCage().isVacantCage()){
        throw new Exception("Penguin's cage is free already");
        }
        else{
        builder.getPenguinCage().setVacant(false);
        System.out.println(inhibitionLog);
        inhibitionLogList.add(new InhibitionLog("check-out", animal.getName(), animal.getSpecies()));
        }
        }
default -> throw new IllegalStateException("Unexpected value: " + animal.getSpecies());*/