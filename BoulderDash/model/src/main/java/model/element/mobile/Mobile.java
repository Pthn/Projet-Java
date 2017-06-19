package model.element.mobile;

import java.awt.Point;

import model.IMap;

public abstract class Mobile {
	
	private Point position;
	private boolean alive = true;
	private IMap map;
	
	public void moveUp(){
		return;
	}
	
	public void moveLeft(){
		return;
	}
	 
	public void moveDown(){
		return;
	}
	
	public void moveRight(){
		return;
	}
	
	public void doNothing(){
		return;
	}
	
	private void sheHasMoved(){
		return;
	}
	
	public int getX(){
		return 0;
	}
	
	private void setX(){
		return;
	}
	
	public int getY(){
		return 0;
	}
	
	private void setY(){
		return;
	}
	
	public IMap getMap(){
		return null;
	}
	
	private void setMap(){
		return;
	}
	
	public boolean isAlive(){
		return true;
	}
	
	public void changeToStatic(){
		return;
	}
	
	public Point getPosition(){
		return null;
	}
	
	public void setPosition(){
		return;
	}
	
	
}
