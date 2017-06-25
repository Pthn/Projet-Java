package model.element.mobile;

 
import java.awt.Point;

import fr.exia.showboard.IBoard;

import model.IMap;
import model.element.mobile.IMobile;
import Interface.Permeability;
import model.element.Element;
import model.element.Sprite;





public class Mobile  extends Element implements IMobile{
	
	
	// Declaration of the elements //

	private Point position;
	protected boolean alive = true;
	protected IMap map;
	static Sprite sprite;
	 Element[][] onTheMap;
//	 IElement xelement;
//	 IElement yelement;
	 private IBoard board;
	 
	 private static final int SCOREMAX = 1;

		private Boolean win = false;




		Mobile(final Sprite sprite, final IMap map, final Permeability permeability, int x, int y){
			super(sprite, permeability,x , y);
			this.setMap(map);
			this.position = new Point();
		}

		Mobile(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability){
			this(sprite, map, permeability, x, y);
			this.setX(x);
	        this.setY(y);
			this.setMap(map);
			this.position = new Point();
		}

		private void setMap(final IMap map) {
	        this.map = map;
	    }

		/* (non-Javadoc)
		 * @see model.IMobile#moveUp()
		 */
		
		//Operator use for move Up
		public void moveUp() {
			if(((Element) this.getMap().getOnTheMapXY(this.getX(), this.getY()-1)).getPermeability() == Permeability.BLOCKING){
				this.setY(this.getY());
			}

			else if (((Element) this.getMap().getOnTheMapXY(this.getX(), this.getY()-1)).getPermeability() == Permeability.DIG){

				this.setY(this.getY() - 1);
			}else if (this.getY() == 0){
				this.setY(this.getY());
			}
			else{
				this.setY(this.getY() - 1);
			}
	        this.setHasMoved();
	    }

		/* (non-Javadoc)
		 * @see model.IMobile#moveLeft()
		 */
	
		//Operator use for move Left
		public void moveLeft() {
			if(((Element) this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())).getPermeability() == Permeability.BLOCKING){
				this.setX(this.getX());
			}
			else if (((Element) this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())).getPermeability() == Permeability.DIG){
				this.setX(this.getX() - 1);
			}else{
				this.setX(this.getX() - 1);
			}
	        this.setHasMoved();
	    }

		/* (non-Javadoc)
		 * @see model.IMobile#moveDown()
		 */
	
		//Operator use for move Down
		public void moveDown() {
			if (((Element) this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)).getPermeability() == Permeability.BLOCKING){
				this.setY(this.getY());
			}
			else if (((Element) this.getMap().getOnTheMapXY(this.getX(), this.getY()+1)).getPermeability() == Permeability.DIG){
				this.setY(this.getY() + 1);
			}else{
				this.setY(this.getY() + 1);
			}
	        this.setHasMoved();
	    }

		/* (non-Javadoc)
		 * @see model.IMobile#moveRight()
		 */
	
		//Operator use for move Right
		public void moveRight() {
			if (((Element) this.getMap().getOnTheMapXY(this.getX() + 1, this.getY())).getPermeability() == Permeability.BLOCKING){
				this.setX(this.getX());
			}
			else if (((Element) this.getMap().getOnTheMapXY(this.getX() +1, this.getY())).getPermeability() == Permeability.DIG){
				this.setX(this.getX() + 1);
			}
			else {
				this.setX(this.getX() + 1);
			}
	        this.setHasMoved();
	    }

		/* (non-Javadoc)
		 * @see model.IMobile#doNothing()
		 */
		@Override
		public void doNothing() {
	        this.setHasMoved();
	    }

		private void setHasMoved() {
	    this.getMap().setMobileHasChanged();

	    }

		/* (non-Javadoc)
		 * @see model.IMobile#getX()
		 */

		public final int getX() {
	        return this.getPosition().x;
	    }

		/* (non-Javadoc)
		 * @see model.IMobile#setX(int)
		 */
		public final void setX(final int x) {
	        this.getPosition().x = x;
	        if (this.isDead()) {
	        	System.out.println("Dead");
	            //this.die();
	        }
	        if(this.asWon()){
	        	System.out.println("Won");
	        }
		}

	    /* (non-Javadoc)
		 * @see model.IMobile#getY()
		 */
	
		public final int getY() {
	        return this.getPosition().y;
	    }

	    /* (non-Javadoc)
		 * @see model.IMobile#setY(int)
		 */
		public final void setY(final int y) {
	        this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();
	        if (this.isDead()) {
	            this.die();
	        }
	        if(this.asWon()){
	        	System.out.println("Won");
	        }
	    }
		

	    /* (non-Javadoc)
		 * @see model.IMobile#getMap()
		 */
		public IMap getMap() {
	        return this.map;
	        }


	    /* (non-Javadoc)
		 * @see model.IMobile#isAlive()
		 */
	    @Override
		public boolean isAlive() {
	        return this.alive;
	    }

	    protected void die() {

	        this.alive = false;
	        this.setHasMoved();
	    }

	    /* (non-Javadoc)
		 * @see model.IMobile#isDead()
		 */
	  
		public boolean isDead() {
	        return ((Element) this.getMap().getOnTheMapXY(this.getX(), this.getY())).getPermeability() == Permeability.ENEMY;
	    }

	    public boolean asWon() {
	    	if (MyHero.SCORE == SCOREMAX ){
	    		return ((Element) this.getMap().getOnTheMapXY(this.getX(), this.getY())).getPermeability() == Permeability.EXIT;
	    	}
			return win;
	    }

	    protected void win(){
	    	this.win = true;
	    	this.setHasMoved();
	    }

	    /* (non-Javadoc)
		 * @see model.IMobile#getPosition()
		 */

		public Point getPosition() {
	        return this.position;
	    }

	    /* (non-Javadoc)
		 * @see model.IMobile#setPosition(java.awt.Point)
		 */
		public void setPosition(final Point position) {
	        this.position = position;
	    }

	    protected IBoard getBoard() {
	        return this.board;
	    }
	}
	// Implementation of methods concerning mobile elements //
//	
//	Mobile(final Sprite sprite, final IMap map, final model.element.Permeability permeability){
//        super(sprite, permeability);
//        this.setMap(map);
//   
//	}
//    Mobile(final int x, final int y, final Sprite sprite, final IMap map, final model.element.Permeability permeability) {
//        this(sprite, map, permeability);
//        this.setX(x);
//        this.setY(y);
//    }
//    
//    // Methods of moving movements of moving elements in the table //
//	
////	public void moveUp(){
////        this.setMap((IMap) map.getOnTheMapXY(+0,SS -1));
////        this.setHasMoved();
////	}
////	
////	
////	public void moveLeft(){
////        this.setMap((IMap) map.getOnTheMapXY(-1,+0));
////        this.setHasMoved();
////	}
////	 
////	public void moveDown(){
////		this.setMap((IMap) map.getOnTheMapXY(+0,+1));
////	        this.setHasMoved();
////	    }
////	
////	
////	public void moveRight(){
////		this.setMap((IMap) map.getOnTheMapXY(+1,+0));
////        this.setHasMoved();
////	}
//    public void moveUp() {
//		if(this.getY() == 1){
//			this.setY(this.getY());
//		}else{
//			this.setY(this.getY() - 1);
//		}
//        this.setHasMoved();
//    }
//	
//
//	public void moveLeft() {
//		if(this.getX() == 1){
//			this.setX(this.getX());
//		}else{
//			this.setX(this.getX() - 1);
//		}
//        this.setHasMoved();
//    }
//	
//
//	public void moveDown() {
//		if(this.getY() == 8){
//			this.setY(this.getY());
//		}else{
//			this.setY(this.getY() + 1);
//		}
//        this.setHasMoved();
//    }
//	
//
//	public void moveRight() {
//		if (this.getX() == 8){
//			this.setX(this.getX());
//		}
//		else {
//			this.setX(this.getX() + 1);
//		}
//        this.setHasMoved();
//    }
//	public void doNothing(){
//		this.setHasMoved();
//	}
//	
//	private void setHasMoved(){
//		this.getMap().setMobileHasChanged();
//	}
//	
//	
//	// Methods of positioning //
//	
////	public IElement getX(final int x, final int y){
////		return this.onTheMap[x][y];
////	}
////	
////    public final void setX(final int x, final int y) {
////      
////		this.onTheMap[x][y] = xelement;
////       
////        }
////    public IElement getY(final int x, final int y){
////		return this.onTheMap[x][y];
////	}
////	
////    public final void setY(final int x, final int y) {
////      
////		this.onTheMap[x][y] = yelement;
////       
////        }
//
//	public final int getX() {
//        return this.getPosition().x;
//    }
//	
//
//	public final void setX(final int x) {
//        this.getPosition().x = x;
//        if (this.isDead()) {
//        	System.out.println("Dead");
//           
//        }
//	}    
//	
//
//	public final int getY() {
//        return this.getPosition().y;
//    }
//
//	public final void setY(final int y) {
//        this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();
//        if (this.isDead()) {
//            this.die();
//        }
//    }    
////    public final int getY() {
////        return this.getPosition().y;
////    }
////
////    public final void setY(final int y) {
////        this.getPosition().y = (y + this.getMap().getHeight()) % this.getMap().getHeight();
////
////    }
//    
//    // Method of use of the map //
//	
//	public IMap getMap(){
//		return this.map;
//	}
//	
//	private void setMap(final IMap map){
//		this.map = map;
//	}
//	
//	// Statement of a state //
//	
//	public boolean isAlive(){
//		return this.alive;
//	}
//
//	// Method for turning element back to static state //
//	
//
//    protected void die() {
//    	
//        this.alive = false;
//        this.setHasMoved();
//    }
//	 
//    // Positioning method //
//    
//	public Boolean isDead() {
//        return this.getMap().getOnTheMapXY(this.getX(), this.getY()).getPermeability() == model.element.Permeability.BLOCKING;
//    }
//
//	public void doBreak() {
//		// TODO Auto-generated method stub
//		
//	}
//	public Point getPosition() {
//        return this.position;
//    }
//	public void setPosition(final Point position) {
//        this.position = position;
//    }
//    
//    protected IBoard getBoard() {
//        return this.board;
//    }
//	
//	
//
//}



	
