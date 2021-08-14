package com.company;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class JDBC {
    private Connection connection;
    private Statement statement;
    public JDBC(){
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Zoo", "postgres", "Vg31072001");
            statement= connection.createStatement();
            //connection.setAutoCommit(false);
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
    public List<InhibitionLog> getLogList() throws SQLException{
        List<InhibitionLog> logList=new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("select * from inhibition_log");
        while (resultSet.next()){
            InhibitionLog inhibitionLog=new InhibitionLog(resultSet.getString("state")
                    ,resultSet.getString("name"),StringToSpecie.stringToSpecie(resultSet.getString("specie")));
            logList.add(inhibitionLog);
        }
        return logList;
    }
    public void addLogList(InhibitionLog inhibitionLog) throws SQLException{
        statement.executeUpdate("insert into inhibition_log(state,name,specie) values('"+inhibitionLog.getState()+
                "','"+inhibitionLog.getName()+"','"+inhibitionLog.getSpecie().toString()+"') ");
    }
    public List<Cage> configCages() throws SQLException{
        List<Cage> cageList=new ArrayList<>();
        ResultSet resultSet = statement.executeQuery("select * from cages");
        while (resultSet.next()){
            Condition condition=new ConditionImpl();
            Cage cage=new CageImpl(resultSet.getInt("number"),resultSet.getDouble("area"),
                    condition.parceCondition(resultSet.getString("condition"))
                    ,resultSet.getBoolean("vacant"));
            if(resultSet.getString("animal_name")!=null) {
                    Animal animal= AnimalFactory.buildAnimal(resultSet.getString("animal_name")
                            , StringToSpecie.stringToSpecie(resultSet.getString("animal_specie")));
                    cage.setAnimal(animal);
            }
            cageList.add(cage);
        }
        return cageList;
    }
    public void cageSetVacant(Cage cage) throws SQLException{
        statement.executeUpdate("Update cages set vacant=true," +
                "animal_name=NULL,animal_specie=NULL where number="+cage.getNumber());
    }
    public void cageSetVacant(Cage cage,Animal animal) throws SQLException{
        statement.executeUpdate("Update cages set vacant=false," +
                "animal_name='"+animal.getName()+"',animal_specie='"+animal.getSpecies().toString()
                +"' where number="+cage.getNumber());
    }
    public void setAnimal(Animal animal,int cagenumber)throws SQLException{
        statement.execute("insert into animals values('"+animal.getName()+"','"
                +animal.getSpecies().toString()+"','"+cagenumber+"')");
    }
    public void delAnimal(String name) throws SQLException{
        statement.executeUpdate("delete from animals where name='"+name+"'");
    }

}
