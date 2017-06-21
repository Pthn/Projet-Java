package model;
import model.element.mobile.IMobile;
public interface IBoulderdashModel {
	public IMap getMap();
	public IMobile getMyHero();
	public IMobile getBlockDiamondFall();
	public IMobile getBlockRocherFall();
	public IMobile getEnemy();
	public void getModel();
	
}
