package model.element.mobile;

 
import model.IElement;
import model.IMap;
import model.IMobile;
import model.element.Element;
import model.element.Permeability;
import model.Map;


public abstract class Mobile  extends Element implements IMobile{
	
	// Declaration of the elements //


	protected boolean alive = true;
	protected IMap map;
	 static String sprite;
	 IElement[][] onTheMap;
	 IElement xelement;
	 IElement yelement;
	// Implementation of methods concerning mobile elements //
	
	Mobile(final String sprite, final IMap map, final Permeability permeability){
        super(sprite, permeability);
        this.setMap(map);
   
	}
    Mobile(final int x, final int y, final String sprite, final IMap map, final Permeability permeability) {
        this(sprite, map, permeability);
        this.setX(x, y);
        this.setY(y, y);
    }
    
    // Methods of moving movements of moving elements in the table //
	
	public void moveUp(){
        this.setMap((IMap) map.getOnTheMapXY(+0, -1));
        this.setHasMoved();
	}
	
	
	public void moveLeft(){
        this.setMap((IMap) map.getOnTheMapXY(-1,+0));
        this.setHasMoved();
	}
	 
	public void moveDown(){
		this.setMap((IMap) map.getOnTheMapXY(+0,+1));
	        this.setHasMoved();
	    }
	
	
	public void moveRight(){
		this.setMap((IMap) map.getOnTheMapXY(+1,+0));
        this.setHasMoved();
	}
	
	public void doNothing(){
		this.setHasMoved();
	}
	
	private void setHasMoved(){
		this.getMap().setMobileHasChanged();
	}
	
	// Methods of positioning //
	
	public IElement getX(final int x, final int y){
		return this.onTheMap[x][y];
	}
	
    public final void setX(final int x, final int y) {
      
		this.onTheMap[x][y] = xelement;
       
        }
    public IElement getY(final int x, final int y){
		return this.onTheMap[x][y];
	}
	
    public final void setY(final int x, final int y) {
      
		this.onTheMap[x][y] = yelement;
       
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
	

	 
    // Positioning method //
    
    

	public void doBreak() {
		// TODO Auto-generated method stub
		
	}

	
	

}
