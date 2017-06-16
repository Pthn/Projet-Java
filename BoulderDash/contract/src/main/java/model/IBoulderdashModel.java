package model;

import java.sql.SQLException;
import java.util.List;


public interface IBoulderdashModel {


    Map getMApById(int id) throws SQLException;


    Map getMapByName(String name) throws SQLException;


    List<Map> getAllMap() throws SQLException;
    
    IMap getMap();
    IMobile getMyHero();
}
