package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parser {
    private Scanner scanner = new Scanner(System.in);
    private Zoo zoo = new ZooImpl();
    public Zoo menu(){
        Species specie;
        Animal animal;
        String s=" ";
        int x=4;
        while (!"4".equals(s)){
            System.out.println("1. Добавить животное в зоопарк");
            System.out.println("2. Убрать животное из зоопрака");
            System.out.println("3. Получить журнал действий");
            System.out.println("4. Выход");
            s = scanner.next();
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод");
            }
            scanner.nextLine();
            String[] data;
            try {
                switch (x) {
                    case 1 -> {
                        System.out.println("check-in <Вид Животного> <Имя Животного>");
                        data = parse();
                        if (!data[0].equals("check-in"))
                            throw new IllegalArgumentException();
                        if (data.length != 3)
                            throw new IndexOutOfBoundsException();
                        specie = stringToSpecie(data[1]);
                        animal = new AnimalImpl(data[2], specie);
                        zoo.checkInAnimal(animal);
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.println("check-out <Имя Животного>");
                        data = parse();
                        if (!data[0].equals("check-out")) {
                            throw new IllegalArgumentException();
                        }
                        if (data.length != 2)
                            throw new IndexOutOfBoundsException();
                        animal = nameToAnimal(data[1]);
                        zoo.checkOutAnimal(animal);
                        System.out.println();
                    }
                    case 3 -> {
                        List<InhibitionLog> inhibitionLogList = new ArrayList<>();
                        inhibitionLogList = zoo.getHistory();
                        for (InhibitionLog i : inhibitionLogList) {
                            System.out.println(i.toString());
                        }
                        System.out.println();
                    }
                }
            }catch (IllegalArgumentException illegalArgumentException){
                System.out.println("wrong input format");
            }catch (IndexOutOfBoundsException indexOutOfBoundsException){
                System.out.println("wrong arguments");
            }catch (Exception e){
                e.printStackTrace();
            }
                System.out.println("Чтобы вернуться в меню нажмите Enter");
                String readString;
                if (scanner.hasNextLine()) {
                    readString = scanner.nextLine();
                } else {
                    readString = null;
                }
        }
        System.out.println("До свидания");

        return zoo;
    }
    private Animal nameToAnimal(String name){
        for (InhibitionLog inhibitionLog: zoo.getHistory()) {
            if(inhibitionLog.getName().equals(name))
                return new AnimalImpl(inhibitionLog.getName(),inhibitionLog.getSpecie());
        }
        throw new IllegalArgumentException();
    }
    private String[] parse(){
        String[] data={" "," "};
       if(scanner.hasNext()){
            String nextLine = scanner.nextLine();
            data = nextLine.split(" ");
        }
         return data;
    }
    private Species stringToSpecie(String s) throws Exception{
        if(s.equals("Leon"))
            return Species.LEON;
        if(s.equals("Giraffe"))
            return Species.GIRAFFE;
        if(s.equals("Squirrel"))
            return Species.SQUIRREL;
        if(s.equals("Penguin"))
            return Species.PENGUIN;
        throw new ClassCastException("Can't convert specie");
    }
}