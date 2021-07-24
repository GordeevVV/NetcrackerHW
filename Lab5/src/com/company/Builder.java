package com.company;

import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Builder {
    private  CageImpl Cage1;
    private  CageImpl Cage2;
    private  CageImpl Cage3;
    private  CageImpl Cage4;
    List<Cage> cageList=new ArrayList<>();
    public Builder(){
        try {
            cageList=readCages("D:\\Documents\\Netcracker\\NetcrackerHMV\\Lab5\\resources\\cageconfig.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public Cage getCage(Animal animal) throws Exception{
        for (Cage cage:cageList) {
            if ((animal.getName().equals(cage.getName()) || cage.getName().equals(" "))
                    && (cage.getCondition().isAvailableFor().contains(animal.getSpecies())))
                return cage;
        }
            throw new Exception("Wrong animal specie");
    }
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
