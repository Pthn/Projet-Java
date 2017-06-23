package model.element.mobile;

 
import java.awt.Point;

import fr.exia.showboard.IBoard;
import model.IElement;
import model.IMap;
import model.IMobile;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;


public abstract class Mobile  extends Element implements model.element.mobile.IMobile{
	
	
	// Declaration of the elements //

	private Point position;
	protected boolean alive = true;
	protected IMap map;
	static Sprite sprite;
	 IElement[][] onTheMap;
//	 IElement xelement;
//	 IElement yelement;
	 private IBoard board;
	// Implementation of methods concerning mobile elements //
	
	Mobile(final Sprite sprite, final IMap map, final Permeability permeability){
        super(sprite, permeability);
        this.setMap(map);
   
	}
    Mobile(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
        this(sprite, map, permeability);
        this.setX(x);
        this.setY(y);
    }
    
    // Methods of moving movements of moving elements in the table //
	
//	public void moveUp(){
//        this.setMap((IMap) map.getOnTheMapXY(+0,SS -1));
//        this.setHasMoved();
//	}
//	
//	
//	public void moveLeft(){
//        this.setMap((IMap) map.getOnTheMapXY(-1,+0));
//        this.setHasMoved();
//	}
//	 
//	public void moveDown(){
//		this.setMap((IMap) map.getOnTheMapXY(+0,+1));
//	        this.setHasMoved();
//	    }
//	
//	
//	public void moveRight(){
//		this.setMap((IMap) map.getOnTheMapXY(+1,+0));
//        this.setHasMoved();
//	}
    public void moveUp() {
		if(this.getY() == 1){
			this.setY(this.getY());
		}else{
			this.setY(this.getY() - 1);
		}
        this.setHasMoved();
    }
	

	public void moveLeft() {
		if(this.getX() == 1){
			this.setX(this.getX());
		}else{
			this.setX(this.getX() - 1);
		}
        this.setHasMoved();
    }
	

	public void moveDown() {
		if(this.getY() == 8){
			this.setY(this.getY());
		}else{
			this.setY(this.getY() + 1);
		}
        this.setHasMoved();
    }
	

	public void moveRight() {
		if (this.getX() == 8){
			this.setX(this.getX());
		}
		else {
			this.setX(this.getX() + 1);
		}
        this.setHasMoved();
    }
	public void doNothing(){
		this.setHasMoved();
	}
	
	private void setHasMoved(){
		this.getMap().setMobileHasChanged();
	}
	
	
	// Methods of positioning //
	
//	public IElement getX(final int x, final int y){
//		return this.onTheMap[x][y];
//	}
//	
//    public final void setX(final int x, final int y) {
//      
//		this.onTheMap[x][y] = xelement;
//       
//        }
//    public IElement getY(final int x, final int y){
//		return this.onTheMap[x][y];
//	}
//	
//    public final void setY(final int x, final int y) {
//      
//		this.onTheMap[x][y] = yelement;
//       
//        }

	public final int getX() {
        return this.getPosition().x;
    }
	

	public final void setX(final int x) {
        this.getPosition().x = x;
        if (this.isDead()) {
        	System.out.println("Dead");
           
        }
	}    
	

	public final int getY() {
        return this.getPosition().y;
    }

	public final void setY(final int y) {
        this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();
        if (this.isDead()) {
            this.die();
        }
    }    
//    public final int getY() {
//        return this.getPosition().y;
//    }
//
//    public final void setY(final int y) {
//        this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();
//
//    }
    
    // Method of use of the map //
	
	public IMap getMap(){
		return this.map;
	}
	
	private void setMap(final IMap map){
		this.map = map;
	}
	
	// Statement of a state //
	
	public boolean isAlive(){
		return this.alive;
	}

	// Method for turning element back to static state //
	

    protected void die() {
    	
        this.alive = false;
        this.setHasMoved();
    }
	 
    // Positioning method //
    
	public Boolean isDead() {
        return this.getMap().getOnTheMapXY(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
    }

	public void doBreak() {
		// TODO Auto-generated method stub
		
	}
	public Point getPosition() {
        return this.position;
    }
	public void setPosition(final Point position) {
        this.position = position;
    }
    
    protected IBoard getBoard() {
        return this.board;
    }
	
	

}
