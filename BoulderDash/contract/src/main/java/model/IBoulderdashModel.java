package model;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


public interface IBoulderdashModel {


    Map getMapById(int id) throws SQLException;


    Map getMapByName(String name) throws SQLException;


    List<Map> getAllMap() throws SQLException;
    
    IMap getMap();
    IMobile getMyHero();


}
