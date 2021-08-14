package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Builder {
    private JDBC jdbc=new JDBC();
    private List<Cage> cageList=new ArrayList<>();
    public Builder(){
        //readCages("D:\\Documents\\Netcracker\\NetcrackerHMV\\Lab5\\resources\\cageconfig.txt");
        try {
         cageList=jdbc.configCages();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public Cage getCage(Animal animal) throws Exception{

            for (Cage cage : cageList) {
                try {
                    if (cage.isVacantCage() && (cage.getCondition().isAvailableFor().contains(animal.getSpecies()))
                            || (animal.getName().equals(cage.getAnimal().getName())))
                        return cage;
                }catch (NullPointerException nullPointerException){
                    if(cage.getCondition().isAvailableFor().contains(animal.getSpecies()))
                    return cage;
                }
            }
            throw new Exception("Wrong animal specie");

    }
   public Animal nameToAnimal(String name) throws NoSuchFieldException{
        for (Cage cage:cageList) {
            try {
                if(cage.getAnimal().getName().equals(name))
                    return cage.getAnimal();
            }catch (NullPointerException e){

            }
        }
        throw new NoSuchFieldException();
    }


    @Deprecated
    private List<Cage> readCages(String path) throws IOException {
        List<Cage> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(path), StandardCharsets.UTF_8)
        )) {


            String curLine;

            while ((curLine = reader.readLine()) != null) {
                String[] splitLine = curLine.split(";");
                int number = Integer.parseInt(splitLine[0].trim());
                double area = Double.parseDouble(splitLine[1].trim());
                Condition condition = new ConditionImpl();
                boolean isVacant = Boolean.parseBoolean(splitLine[3].trim());
                result.add(new CageImpl(number, area, condition.parceCondition(splitLine[2].trim()), isVacant));
            }

        } catch (FileNotFoundException e) {
            throw e;
        }
        return result;
    }
}
