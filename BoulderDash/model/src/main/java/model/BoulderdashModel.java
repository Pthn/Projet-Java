package model;

import java.io.IOException;
import java.sql.SQLException;

import model.dao.DataDAO;
import model.element.mobile.IMobile;
import model.element.mobile.MyHero;


public class BoulderdashModel implements IBoulderdashModel {
	
    private IMap map;

    private IMobile myHero;

   
	public BoulderdashModel(final int myHeroStartX, final int myHeroStartY, final DataDAO datadao, IMap map) throws IOException, SQLException{	
		this.setMap(new Map(null, datadao));
        this.setMyHero(new MyHero(myHeroStartX, myHeroStartY, this.getMap()));
	}
	// set and get the map, mobile element and model
	
	public IMap getMap(){
		return this.map;
	}
	
	public IMobile getMyHero(){
		return this.myHero;
	}
	
	private void setMap(IMap map){
		this.map = map;
	}
	
	private void setMyHero(final MyHero myHero){
		this.myHero = (IMobile) myHero;
	}



	public void getModel() {
		
		
	} 
}        
