package model.element.mobile;
import java.awt.Point;

import model.IMap;
import model.IMobile;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

public abstract class Mobile  extends Element implements IMobile{

	private Point position;
	private boolean alive = true;
	private IMap map;

	
	
	Mobile(final Sprite sprite, final IMap map, final Permeability permeability){
        super(sprite, permeability);
        this.setMap(map);
        this.position = new Point();
	}
    Mobile(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
        this(sprite, map, permeability);
        this.setX(x);
        this.setY(y);
    }

	
	public void moveUp(){
        this.setY(this.getY() - 1);
        this.setHasMoved();
	}
	
	public void moveLeft(){
        this.setX(this.getX() - 1);
        this.setHasMoved();
	}
	 
	public void moveDown(){
	       this.setY(this.getY() + 1);
	        this.setHasMoved();
	    }
	
	
	public void moveRight(){
		this.setX(this.getX() + 1);
        this.setHasMoved();
	}
	
	public void doNothing(){
		this.setHasMoved();
	}
	
	private void setHasMoved(){
		this.getMap().setMobileHasChanged();
	}
	
	public int getX(){
		return this.getPosition().x;
	}
	
    public final void setX(final int x) {
        this.getPosition().x = x;
       
        }
	
    public final int getY() {
        return this.getPosition().y;
    }

    public final void setY(final int y) {
        this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();

    }
	
	public IMap getMap(){
		return this.map;
	}
	
	private void setMap(final IMap map){
		this.map = map;
	}
	
	public Boolean isAlive(){
		return this.alive;
	}

    public Boolean changeToStatic() {
        return this.getMap().getOnTheMapXY(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
    }
	 
	public Point getPosition(){
		return this.position;
	}
	
	public void setPosition(final Point position){
		this.position = position;
	}

	
	

}
