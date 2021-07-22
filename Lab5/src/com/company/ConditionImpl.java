package com.company;

import java.util.ArrayList;
import java.util.List;

public class ConditionImpl implements Condition{
    List<Species> speciesList=new ArrayList<>();

    public ConditionImpl(List<Species> speciesList) {
        this.speciesList = speciesList;
    }

    @Override
    public List<Species> isAvailableFor() {
        return speciesList;
    }
}
