package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;

public abstract class DataDAO extends AbstractDAO{
	
	 	private static String sqlheight  = "{call heightgetter(?)}";


	    private static String sqlwidth = "{call widthgetter(?)}";
	    
	    private static String sqldiamond = "{call diamondgetter(?)}";
	    
	    private static String sqlheroX = "{call heroXgetter(?)}";
	    
	    private static String sqlheroY = "{call heroYgetter(?)}";
	    
   public static int getHeight(int idmap) throws SQLException {
	    	
	        final CallableStatement callStatement = prepareCall(sqlheight);
	        int height = 0;
	        callStatement.setInt(1, idmap);
	        if (callStatement.execute()) {
	            final ResultSet result = callStatement.getResultSet();
	            if(result.next()){
	            	if(result.first())   {         
	            		height = result.getInt(1);
	            	}
	            }
	            result.close();
	        }
	        
	       return height;
	    }
	public static int getWidth(int idmap) throws SQLException {
		    	
		        final CallableStatement callStatement = prepareCall(sqlwidth);
		        int width = 0;
		        callStatement.setInt(1, idmap);
		        if (callStatement.execute()) {
		            final ResultSet result = callStatement.getResultSet();
		            if(result.next()){
		            	if(result.first())   {         
		            		width = result.getInt(1);
		            	}
		            }
		            result.close();
		        }
		       
		       return width;
		    }
	public static int getDiamond(int idmap) throws SQLException {
    	
		        final CallableStatement callStatement = prepareCall(sqldiamond);
		        int diamond = 0;
		        callStatement.setInt(1, idmap);
		        if (callStatement.execute()) {
		            final ResultSet result = callStatement.getResultSet();
		            if(result.next()){
		            	if(result.first())   {         
		            		diamond = result.getInt(1);
		            	}
		            }
		            result.close();
		            
		        }
		       
		       return diamond;
		    }
	public static int getheroX(int idmap) throws SQLException {
    	
        final CallableStatement callStatement = prepareCall(sqlheroX);
        int heroX = 0;
        callStatement.setInt(1, idmap);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if(result.next()){
            	if(result.first())   {         
            		heroX = result.getInt(1);
            	}
            }
            result.close();
            
        }
       
       return heroX;
    }
	public static int getheroY(int idmap) throws SQLException {
    	
        final CallableStatement callStatement = prepareCall(sqlheroY);
        int heroY = 0;
        callStatement.setInt(1, idmap);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if(result.next()){
            	if(result.first())   {         
            		heroY = result.getInt(1);
            	}
            }
            result.close();
            
        }
       
       return heroY;
    }
	
}
