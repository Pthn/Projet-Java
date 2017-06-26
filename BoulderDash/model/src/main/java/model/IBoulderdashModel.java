package model;

import model.element.mobile.*;

public interface IBoulderdashModel {
	public IMap getMap();
	public IMobile getMyHero();
//	public void getModel();
	public IMobile getBlockDiamondFall();
	public IMobile getBlockRocherFall();
	public IMobile getEnemy();
}
