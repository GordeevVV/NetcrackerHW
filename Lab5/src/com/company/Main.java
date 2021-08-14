package com.company;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        Zoo zoo=new ZooImpl();
        Menu menu=new Menu();
        try {
            zoo=menu.menu();
        }catch (IllegalArgumentException illegalArgumentException){
            System.out.println("wrong input format");
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("wrong arguments");
        }catch (NoSuchFieldException noSuchFieldException){
            System.out.println("No animal with this name");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        //some work with zoo
    }
}
