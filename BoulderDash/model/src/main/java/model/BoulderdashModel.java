package model;

import java.io.IOException;

import model.element.mobile.IMobile;
import model.element.mobile.MyHero;


public class BoulderdashModel implements IBoulderdashModel {
	
    private IMap map;

    private IMobile myHero;

	public BoulderdashModel(final String fileName, final int myHeroStartX, final int myHeroStartY) throws IOException{	
		this.setMap(new Map(fileName));
        this.setMyHero(new MyHero(myHeroStartX, myHeroStartY, this.getMap()));
	}
	
	
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
}
