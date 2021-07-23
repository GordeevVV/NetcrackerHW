package com.company;

public class Main {
    public static void main(String[] args) {
        Parser parser=new Parser();
        Zoo zoo=new ZooImpl();
           zoo=parser.menu();
        //some work with zoo
    }
}
