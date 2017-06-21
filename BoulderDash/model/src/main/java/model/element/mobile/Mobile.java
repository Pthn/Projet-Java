package model.element.mobile;
import java.awt.Point;
 
import model.IMap;
import model.IMobile;
import model.element.Element;
import model.element.Permeability;


public abstract class Mobile  extends Element implements IMobile{
	
	// Declaration of the elements //

	protected Point position;
	protected boolean alive = true;
	protected IMap map;
	 static String sprite;
	
	// Implementation of methods concerning mobile elements //
	
	Mobile(final String sprite, final IMap map, final Permeability permeability){
        super(sprite, permeability);
        this.setMap(map);
        this.position = new Point();
	}
    Mobile(final int x, final int y, final String sprite, final IMap map, final Permeability permeability) {
        this(sprite, map, permeability);
        this.setX(x);
        this.setY(y);
    }
    
    // Methods of moving movements of moving elements in the table //
	
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
	
	// Methods of positioning //
	
	public int getX(){
		return this.getPosition().x;
	}
	
    public final void setX(final int x) {
        this.getPosition().x = (x + this.getMap().getWidth()) % this.getMap().getWidth();
       
        }
	
    public final int getY() {
        return this.getPosition().y;
    }

    public final void setY(final int y) {
        this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();

    }
    
    // Method of use of the map //
	
	public IMap getMap(){
		return this.map;
	}
	
	private void setMap(final IMap map){
		this.map = map;
	}
	
	// Statement of a state //
	
	public Boolean isAlive(){
		return this.alive;
	}

	// Method for turning element back to static state //
	
    public Boolean changeToStatic() {
        return this.getMap().getOnTheMapXY(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
    }
	 
    // Positioning method //
    
	public Point getPosition(){
		return this.position;
	}
	
	public void setPosition(final Point position){
		this.position = position;
	}
	public void doBreak() {
		// TODO Auto-generated method stub
		
	}

	
	

}
