package com.company;

import java.util.ArrayList;
import java.util.List;

public class ConditionImpl implements Condition{
    List<Species> speciesList=new ArrayList<>();
    public ConditionImpl(){

    }
    public ConditionImpl(List<Species> speciesList) {
        this.speciesList = speciesList;
    }

    @Override
    public List<Species> isAvailableFor() {
        return speciesList;
    }

    @Override
    public Condition parceCondition(String s) {
        String[]tokens=s.split(",");
        for (String t:tokens) {
            speciesList.add(StringToSpecie.stringToSpecie(t));
        }
        return this;
    }
}
