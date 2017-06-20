package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SaveMapDAO extends AbstractDAO {


    private static String sqlmap1  = "{call returnmap1(?)}";


    private static String sqlmap2 = "{call returnmap2(?)}";
    
    private static String sqlmap3 = "{call returnmap3(?)}";
    
    private static String sqlmap4 = "{call returnmap4(?)}";
    
    private static String sqlmap5 = "{call returnmap5(?)}";


    private static String sqldata = "{call returndata()}";


   
		    public static ArrayList<String> getMap1(int row) throws SQLException {
		        final ArrayList<String> elementlist = new ArrayList<String>();
		        final CallableStatement callStatement = prepareCall(sqlmap1);
		        callStatement.setInt(1, row);
		        if (callStatement.execute()) {
		            final ResultSet result = callStatement.getResultSet();
		            
		            for (int i = 0 ; i < 5; i++) {
		                elementlist.add(result.getString(1));
		            }
		            result.close();
		        }
		        return elementlist;
		    }
		    public static ArrayList<String> getMap2(int row) throws SQLException {
		        final ArrayList<String> elementlist = new ArrayList<String>();
		        final CallableStatement callStatement = prepareCall(sqlmap2);
		        callStatement.setInt(1, row);
		        if (callStatement.execute()) {
		            final ResultSet result = callStatement.getResultSet();
		            
		            for (int i = 0 ; i < 20; i++) {
		                elementlist.add(result.getString(1));
		            }
		            result.close();
		        }
		        return elementlist;
		    }
		    public static ArrayList<String> getMap3(int row) throws SQLException {
		        final ArrayList<String> elementlist = new ArrayList<String>();
		        final CallableStatement callStatement = prepareCall(sqlmap3);
		        callStatement.setInt(1, row);
		        if (callStatement.execute()) {
		            final ResultSet result = callStatement.getResultSet();
		            
		            for (int i = 0 ; i < 22; i++) {
		                elementlist.add(result.getString(1));
		            }
		            result.close();
		        }
		        return elementlist;
		    }
		    public static ArrayList<String> getMap4(int row) throws SQLException {
		        final ArrayList<String> elementlist = new ArrayList<String>();
		        final CallableStatement callStatement = prepareCall(sqlmap4);
		        callStatement.setInt(1, row);
		        if (callStatement.execute()) {
		            final ResultSet result = callStatement.getResultSet();
		            
		            for (int i = 0 ; i < 20; i++) {
		                elementlist.add(result.getString(1));
		            }
		            result.close();
		        }
		        return elementlist;
		    }
		    public static ArrayList<String> getMap5(int row) throws SQLException {
		        final ArrayList<String> elementlist = new ArrayList<String>();
		        final CallableStatement callStatement = prepareCall(sqlmap5);
		        callStatement.setInt(1, row);
		        if (callStatement.execute()) {
		            final ResultSet result = callStatement.getResultSet();
		            
		            for (int i = 0 ; i < 20; i++) {
		                elementlist.add(result.getString(1));
		            }
		            result.close();
		        }
		        return elementlist;
		    }
		    public int getElement(int row, int collumn){
		    	final ArrayList<String> elementRow = new ArrayList<String>();
		    	switch(elementRow) {
		    		    		
		    	case 1:  
                		break;
		    	case 2: 
		    			break;
		    	case 3:  
		    			break;
		    	case 4:  
                		break;
		    	case 5:  
		    			break;
		    	}
		    	return;
		    }

}


