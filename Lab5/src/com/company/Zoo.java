package com.company;

import com.company.Animal;

import java.sql.SQLException;
import java.util.List;

/**
 * entity keep state of Zoo and provide service desk functionality
 * @checkInAnimal method add Animal to Zoo
 * should throw exception when Zoo can't provide place
 * @checkOutAnimal method remove Animal from Zoo
 * @getHistory - method show log of check in and check out
 */
public interface Zoo {
    void checkInAnimal(Animal animal) throws Exception;
    void checkOutAnimal(Animal animal) throws Exception;
    List<InhibitionLog> getHistory() throws SQLException;
}