package model;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Observable;


import model.element.Element;
//import model.dao.DataDAO;
//import model.dao.SaveMapDAO;
import model.element.IElement;
import model.element.motionless.MotionlessElementsFactory;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;



public class Map extends Observable implements IMap{
	
	

	private IElement[][] onTheMap;
	int height;
	int width;
	int diamond;
	int idmap;
	int row;
	int collumn;
	int choicemap;
	String elementlist;

	public Map(final String fileName) throws IOException, SQLException{
		super();
	
		this.getIdmap(idmap);
//		width = DataDAO.getWidth(idmap);
//		height = DataDAO.getHeight(idmap);
//		diamond = DataDAO.getDiamond(idmap);
//		elementlist =  SaveMapDAO.getElement(idmap, row, collumn);
		this.loadMap(fileName);
		
	
	}

	public int getIdmap( int idmap){
	
			for(int i = 0; i<diamond; i++){
				if(i >= diamond){
					idmap = idmap +1;
				}
			}
			
		return idmap;
	} 
	public int getDiamond() {
		return diamond;
	}
	public void setDiamond(int diamond) {
		this.diamond = diamond;
	}
	private void loadMap(final String fileName) throws IOException{
		final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		String line;
		int y = 0;
		line = buffer.readLine();
		this.setWidth(Integer.parseInt(line));
		line = buffer.readLine();
		this.setHeight(Integer.parseInt(line));
		this.onTheMap = new Element[this.getWidth()][this.getHeight()];
		line = buffer.readLine();
		while (line != null){
			for (int x = 0; x < line.toCharArray().length; x++){
				this.setOnTheMapXY(MotionlessElementsFactory.getFromSymbol(line.toCharArray()[x]), x, y);
			}
			line = buffer.readLine();
			y++;
		}
		buffer.close();
	}
//	private void loadMap() throws IOException, SQLException{
//		
//		int x;
//	int y;
//	for(y = 0; y < height ; y++){
//	
//		for(x = 0; x < width ; x++){
//			this.setOnTheMapXY(MotionlessElementsFactory.getFromSymbol(SaveMapDAO.getElement(idmap, y, x), null), x, y);
//		}
//		
//	    
//	
//	}
// get a map of an element double table
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	

	public IElement getOnTheMapXY(final int x, final int y){
		return this.onTheMap[x][y];
	}
	
	public Observable getObservable(){
		return this;
	}
	

	// set a map of an element double table
	public void setOnTheMapXY(final IElement element, final int x, final int y){
		this.onTheMap[x][y] = element;
	}
	
	// refresh the map when the mobile element move
	public void setMobileHasChanged(){
		this.setChanged();
        this.notifyObservers();
	}
	public void getSprite(){
		return;
	}


	

	
	
	
}
