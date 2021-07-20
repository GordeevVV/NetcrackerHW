package com.company;

import java.util.Scanner;

public class Parser {
    private Scanner scanner = new Scanner(System.in);
    private Zoo zoo = new ZooImpl();
    public Zoo Parse() {
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            String[] data = nextLine.split(" ");
            Animal animal;
            for (int i = 0; i < data.length; i++) {

                if (data[i].isEmpty()) continue;
                switch (i) {
                    case 0:
                        zoo.; continue;
                    case 1:
                        developer.setFirstName(devData[i]);
                        continue;
                    case 2:
                        developer.setLastName(devData[i]);
                        continue;
                }
            }
            animal=new AnimalImpl();
            zoo.checkInAnimal(animal);
        }
        return zoo;
    }
}
