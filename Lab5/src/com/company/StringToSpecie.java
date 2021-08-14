package com.company;

public class StringToSpecie {
    public static Species stringToSpecie(String s){
        try {
            if(s.equals("Leon") || s.equals("LEON"))
                return Species.LEON;
            if(s.equals("Giraffe") || s.equals("GIRAFFE"))
                return Species.GIRAFFE;
            if(s.equals("Squirrel") || s.equals("SQUIRREL"))
                return Species.SQUIRREL;
            if(s.equals("Penguin") || s.equals("PENGUIN"))
                return Species.PENGUIN;
            throw new ClassCastException();
        }catch (ClassCastException e){
            e.printStackTrace();
        }
        return null;
    }
}
