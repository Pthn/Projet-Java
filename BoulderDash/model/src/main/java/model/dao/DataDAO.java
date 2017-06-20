package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class DataDAO extends AbstractDAO{
	
	 	private static String sqlheight  = "{call heightgetter(?)}";


	    private static String sqlwidth = "{call widthgetter(?)}";
	    
	    private static String sqldiamond = "{call diamondgetter(?)}";
	    
	    
   public static int getHeight(int idmap) throws SQLException {
	    	
	        final CallableStatement callStatement = prepareCall(sqlheight);
	        int height = 0;
	        callStatement.setInt(1, idmap);
	        if (callStatement.execute()) {
	            final ResultSet result = callStatement.getResultSet();
	            	if(result.first())   {         
	            		height = result.getInt(1);
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
		            	if(result.first())   {         
		            		width = result.getInt(1);
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
		            	if(result.first())   {         
		            		diamond = result.getInt(1);
		            	}
		            result.close();
		        }
		       
		       return diamond;
		    }
}
