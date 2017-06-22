package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public abstract class SaveMapDAO extends AbstractDAO {


	// the sql map 
    private static String sqlmap1  = "{call returnmap1(?)}";

    private static String sqlmap2 = "{call returnmap2(?)}";
    
    private static String sqlmap3 = "{call returnmap3(?)}";
    
    private static String sqlmap4 = "{call returnmap4(?)}";
    
    private static String sqlmap5 = "{call returnmap5(?)}";





   //GET the map1
		    public static ArrayList<String> getMap1(int row) throws SQLException {
		    	row=+1;
		        final ArrayList<String> elementlist = new ArrayList<String>();
		        final CallableStatement callStatement = prepareCall(sqlmap1);
		        callStatement.setInt(1, row);
		        if (callStatement.execute()) {
		            final ResultSet result = callStatement.getResultSet();
		           if(result.next()){
		            for (int i = 0 ; i <= 5; i++) {
		                elementlist.add(result.getString(i+1));
		            }
		           }
		            result.close();
		        }
		        return elementlist;
		    }
		    //GET the map2
		    public static ArrayList<String> getMap2(int row) throws SQLException {
		    	row=+1;
		        final ArrayList<String> elementlist = new ArrayList<String>();
		        final CallableStatement callStatement = prepareCall(sqlmap2);
		        callStatement.setInt(1, row);
		        if (callStatement.execute()) {
		            final ResultSet result = callStatement.getResultSet();
		            if(result.next()){
		            	for (int i = 0 ; i <= 20; i++) {
		                elementlist.add(result.getString(i+1));
		            	}
		            }
		            result.close();
		        }
		        return elementlist;
		    }
		    //GET the map3
		    public static ArrayList<String> getMap3(int row) throws SQLException {
		    	row=+1;
		        final ArrayList<String> elementlist = new ArrayList<String>();
		        final CallableStatement callStatement = prepareCall(sqlmap3);
		        callStatement.setInt(1, row);
		        if (callStatement.execute()) {
		            final ResultSet result = callStatement.getResultSet();
		            if(result.next()){  
		            for (int i = 0 ; i <= 22; i++) {
		                elementlist.add(result.getString(i+1));
		            }
		            }
		            result.close();
		        }
		        return elementlist;
		    }
		    //GET the map4
		    public static ArrayList<String> getMap4(int row) throws SQLException {
		    	row=+1;
		        final ArrayList<String> elementlist = new ArrayList<String>();
		        final CallableStatement callStatement = prepareCall(sqlmap4);
		        callStatement.setInt(1, row);
		        if (callStatement.execute()) {
		            final ResultSet result = callStatement.getResultSet();
		            if(result.next()){  
		            for (int i = 0 ; i <= 20; i++) {
		                elementlist.add(result.getString(i+1));
		            }
		            }
		            result.close();
		        }
		        return elementlist;
		    }
		    //GET the map5
		    public static ArrayList<String> getMap5(int row) throws SQLException {
		    	row=+1;
		        final ArrayList<String> elementlist = new ArrayList<String>();
		        final CallableStatement callStatement = prepareCall(sqlmap5);
		        callStatement.setInt(1, row);
		        if (callStatement.execute()) {
		            final ResultSet result = callStatement.getResultSet();
		            if(result.next()){  
		            for (int i = 0 ; i <= 20; i++) {
		                elementlist.add(result.getString(i+1));
		            }
		            }
		            result.close();
		        }
		        return elementlist;
		    }
		    //GET the element of the maps
		    public static String getElement(int idmap, int row, int collumn) throws SQLException{
	    	String element = "";
		    	
		    	ArrayList<String> elementRow = new ArrayList<String>();
		    	switch(idmap) {
		    		    		
		    	case 1:  
                		elementRow = getMap1(row);
                		break;
		    	case 2: 
		    			elementRow=getMap2(row);
		    			break;
		    	case 3:  
		    			elementRow=getMap3(row);
		    			break;
		    	case 4:  
		    			elementRow=getMap4(row);
		    			break;
		    	case 5:  
		    			elementRow=getMap5(row);
		    			break;
		    	}
		    	int elementRowsize = elementRow.size();
		    if(elementRowsize <= collumn  )	{
		    
		     element = elementRow.get(collumn);
		     
		    }
		    	return element;
		    
		    }
}


