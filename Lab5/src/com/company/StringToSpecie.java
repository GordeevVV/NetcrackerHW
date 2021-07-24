package com.company;

public class StringToSpecie {
    public static Species stringToSpecie(String s){
        try {
            if(s.equals("Leon"))
                return Species.LEON;
            if(s.equals("Giraffe"))
                return Species.GIRAFFE;
            if(s.equals("Squirrel"))
                return Species.SQUIRREL;
            if(s.equals("Penguin"))
                return Species.PENGUIN;
            throw new ClassCastException();
        }catch (ClassCastException e){
            e.printStackTrace();
        }
        return null;
    }
}
