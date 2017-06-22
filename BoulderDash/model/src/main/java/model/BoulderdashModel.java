package model;

import java.io.IOException;
import java.sql.SQLException;

import model.dao.DataDAO;
import model.element.mobile.IMobile;
import model.element.mobile.MyHero;
import model.element.mobile.BlockDiamondFall;
import model.element.mobile.BlockRocherFall;
import model.element.mobile.Enemy;


public class BoulderdashModel implements IBoulderdashModel {
	
    private IMap map;

    private IMobile myHero;
    private IMobile BlockDiamondFall;
    private IMobile enemy;
    private IMobile BlockRocherFall;
    

    
   
	public IMobile getBlockDiamondFall() {
		return BlockDiamondFall;
	}
	

	private void setBlockDiamondFall(final BlockDiamondFall BlockDiamondFall){
		this.BlockDiamondFall = (IMobile) BlockDiamondFall;
	}

	public IMobile getEnemy() {
		return enemy;
	}

	public void setEnemy(final Enemy enemy) {
		this.enemy = (IMobile) enemy;
	}

	public IMobile getBlockRocherFall() {
		return BlockRocherFall;
	}

	public void setBlockRocherFall(final BlockRocherFall blockRocherFall) {
		this.BlockRocherFall = (IMobile) blockRocherFall;
	}

	public BoulderdashModel(final int myHeroStartX, final int myHeroStartY, IMap map) throws IOException, SQLException{	
		this.setMap(new Map());
        this.setMyHero(new MyHero(myHeroStartX, myHeroStartY, this.getMap()));
        this.setEnemy(new Enemy(this.getMap()));
        this.setBlockDiamondFall(new BlockDiamondFall(this.getMap()));
        this.setBlockRocherFall(new BlockRocherFall(this.getMap()));
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
