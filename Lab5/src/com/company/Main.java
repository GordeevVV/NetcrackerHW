package com.company;

public class Main {
    public static void main(String[] args) {
        Parser parser=new Parser();
        Zoo zoo=new ZooImpl();
        try {
           zoo=parser.menu();
        }catch (Exception e){
            e.printStackTrace();
        }
        //some work with zoo
    }
}
