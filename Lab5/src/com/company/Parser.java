package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parser {
    public String[] parse(Scanner scanner){
        String[] data={" "," "};
       if(scanner.hasNext()){
            String nextLine = scanner.nextLine();
            data = nextLine.split(" ");
        }
         return data;
    }

}