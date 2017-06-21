package model;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Observable;
import model.dao.DataDAO;
import model.dao.*;
import model.element.IElement;
import model.element.motionless.MotionlessElementsFactory;


public class Map extends Observable implements IMap{
	
	

	private IElement[][] onTheMap;
	int height;
	int width;
	int diamond;
	int idmap;
	String[] elementlist;
	int row;
	int collumn;

	public Map(String fileName, DataDAO datadao) throws IOException, SQLException{
		super();
	
		
		width = DataDAO.getWidth(idmap);
		height = DataDAO.getHeight(idmap);
		diamond = DataDAO.getDiamond(idmap);
		elementlist = SaveMapDAO.getElement(idmap, row, collumn);
		
		this.loadFile(fileName);
	}
	public int getIdmap(int idmap){
		switch(idmap){
		
		case 1 : 	
				idmap=1;
				break;
		case 2 : 
				idmap=2;
				break;
		case 3 : 
				idmap=3;
				break;
		case 4 : 
				idmap=4;
				break;
		case 5 : 
				idmap=5;
				break;
		}
		return idmap;
	} 
	
	private void loadFile(final String fileName) throws IOException{
		
	    elementlist[];
		for(int i = 0 ; i < rangMax ; i++) // Tu cr�es en boucle des ArrayList<Noeud>
		    listeNoeud[i] = new ArrayList<Noeud>();
		 
		listeNoeud[0].add(unNoeud); // Et ici tu ajoutes tous les �l�ments

	}
	

	
	public IElement getOnTheMapXY(final int x, final int y){
		return this.onTheMap[x][y];
	}
	
	public Observable getObservable(){
		return this;
	}
	

	
	private void setOnTheMapXY(final IElement element, final int x, final int y){
		this.onTheMap[x][y] = element;
	}
	
	public void setMobileHasChanged(){
		this.setChanged();
        this.notifyObservers();
	}
	public void getSprite(){
		return;
	}
	
	
	
}
