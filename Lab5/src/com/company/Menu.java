package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu{
    private JDBC jdbc=new JDBC();
    private Scanner scanner = new Scanner(System.in);
    private ZooImpl zoo = new ZooImpl();
    Parser parser=new Parser();
    public Zoo menu() throws Exception{
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
            switch (x) {
                case 1 -> {
                    System.out.println("check-in <Вид Животного> <Имя Животного>");
                    data = parser.parse(scanner);
                    if (!data[0].equals("check-in"))
                        throw new IllegalArgumentException();
                    if (data.length != 3)
                        throw new IndexOutOfBoundsException();
                    specie = StringToSpecie.stringToSpecie(data[1]);
                    animal = AnimalFactory.buildAnimal(data[2], specie);
                    zoo.checkInAnimal(animal);
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("check-out <Имя Животного>");
                    data = parser.parse(scanner);
                    if (!data[0].equals("check-out")) {
                        throw new IllegalArgumentException();
                    }
                    if (data.length != 2)
                        throw new IndexOutOfBoundsException();
                    animal = zoo.nameToAnimal(data[1]);
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
        if(x!=4){ System.out.println("Чтобы вернуться в меню нажмите Enter");
            String readString;

            if (scanner.hasNextLine()) {
                readString = scanner.nextLine();
            } else {
                readString = null;
            }
        }
    }
        System.out.println("До свидания");
        return zoo;
}
}
