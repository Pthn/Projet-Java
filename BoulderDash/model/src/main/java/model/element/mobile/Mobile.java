package model.element.mobile;

 
import java.awt.Point;
import java.io.IOException;

import fr.exia.showboard.IBoard;

import model.IMap;
import model.element.mobile.IMobile;
import model.element.motionless.BlockFond;
import model.element.motionless.MotionlessElement;
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
	 private static final BlockFond blockFond = new BlockFond();
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

		}

		private void setMap(final IMap map) {
	        this.map = map;
	    }


		//Operator use for move Up
		public void moveUp() {
			if(((Element) this.getMap().getOnTheMapXY(this.getX(), this.getY()-1)).getPermeability() == Permeability.BLOCKING)
			{
				this.setY(this.getY());
			}

			else if (((Element) this.getMap().getOnTheMapXY(this.getX(), this.getY()-1)).getPermeability() == Permeability.DIG)
			{
				this.setY(this.getY() - 1);
				//this.getMap().getOnTheMapXY(this.getX(), this.getY()).getSprite()=BlockFond.BLOCKFOND;
				
			}
				
			else if (((Element) this.getMap().getOnTheMapXY(this.getX(), this.getY()-1)).getPermeability() == Permeability.TAKE)
			{
				this.setY(this.getY() - 1);
				System.out.println("+1 Diamand");
			}
			else if (this.getY() == 0)
			{
				this.setY(this.getY());
			}
			else
			{
				this.setY(this.getY() - 1);
			}
	
	        this.setHasMoved();
	    }



		//Operator use for move Left
		public void moveLeft() {
			if(((Element) this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())).getPermeability() == Permeability.BLOCKING)
			{
				this.setX(this.getX());
			}
			else if (((Element) this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())).getPermeability() == Permeability.DIG)
			{
				this.setX(this.getX() - 1);
			}
			else if (((Element) this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())).getPermeability() == Permeability.TAKE)
			{
				this.setY(this.getX() - 1);
				System.out.println("+1 Diamand");
			}
			else
			{
				this.setX(this.getX() - 1);
			}
		
	        this.setHasMoved();
	    }

	
		//Operator use for move Down
		public void moveDown() {
			if (((Element) this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)).getPermeability() == Permeability.BLOCKING){
				this.setY(this.getY());
			}
			else if (((Element) this.getMap().getOnTheMapXY(this.getX(), this.getY()+1)).getPermeability() == Permeability.DIG){
				this.setY(this.getY() + 1);
				
				
			}
			else if (((Element) this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)).getPermeability() == Permeability.TAKE)
			{
				this.setY(this.getY() + 1);
				System.out.println("+1 Diamand");
			}
			else if (((Element) this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)).getPermeability() == Permeability.PLAYER)
			{
				this.setY(this.getY() + 1);
				System.out.println("MORT");
				this.die();
			}
			else
			{
				this.setY(this.getY() + 1);
			}
	
	        this.setHasMoved();
	    }


	
		//Operator use for move Right
		public void moveRight() throws IOException {
			if (((Element) this.getMap().getOnTheMapXY(this.getX() + 1, this.getY())).getPermeability() == Permeability.BLOCKING){
				this.setX(this.getX());
			}
			else if (((Element) this.getMap().getOnTheMapXY(this.getX() +1, this.getY())).getPermeability() == Permeability.DIG){

				this.setX(this.getX() + 1);
//				this.getFond();
				this.Dig(this.getX(), this.getY());
//				this.getX() == x;
//		        onTheMap[x][y] = new BlockFond();
//		        getOnTheMap();
//		        getOnTheMapXY(this.getX() +1, this.getY()) = new MotionlessElement();
		        
//				this.getMap().getOnTheMapXY(this.getX() +1, this.getY()) = new BlockFond();
//				onTheMap[x][y] = new BlockFond();
//				getOnTheMap[ligne][colonne] = new Background(sprite.getX(), sprite.getY());
			}
			else if (((Element) this.getMap().getOnTheMapXY(this.getX() + 1, this.getY())).getPermeability() == Permeability.TAKE)
			{
				this.setY(this.getX() + 1);
				
				System.out.println("+1 Diamand");
			}
			else 
			{
				this.setX(this.getX() + 1);
			}
	        this.setHasMoved();
	    }
		
		//Operator use for move Down the BLOCK
				public void moveDownBlock() {
					if (((Element) this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)).getPermeability() == Permeability.BLOCKING){
						this.setY(this.getY());
					}
						
					else if (((Element) this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)).getPermeability() == Permeability.TAKE)
					{
						this.setY(this.getY());

					}
					else if (((Element) this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)).getPermeability() == Permeability.PLAYER)
					{
						this.setY(this.getY() + 1);
						System.out.println("MORT");
						this.die();
					}
			
			        this.setHasMoved();
			    }


		
		public void doNothing() {
	        this.setHasMoved();
	    }

		private void setHasMoved() {
	    this.getMap().setMobileHasChanged();

	    }

		public void Dig(final int x, final int y) throws IOException{
//			this.setFond((BlockFond) blockFond);
//			this.getFond().getSprite().loadImage();
//	
			this.getPosition().y = y;
			this.getPosition().x = x;
			map.setOnTheMapXY(blockFond, x, y);
		}
	    public MotionlessElement createBlockFond(){
			return blockFond;
		}

		public final int getX() {
	        return this.getPosition().x;
	    }

	
		public final void setX(final int x) {
//			final int y;
	        this.getPosition().x = x;
//	        this.getPosition().y = y;
	        if (this.isDead()) {
	        	System.out.println("Dead");
	            this.die();
	        }
	        if(this.asWon()){
	        	this.asWon();
	        	System.out.println("Won");
	        }
//	        if(this.getPermeability() == Permeability.DIG){
//	        	onTheMap[x] = new BlockFond();
//	        }
		}

	
	
		public final int getY() {
	        return this.getPosition().y;
	    }

	
		public final void setY(final int y) {
	        this.getPosition().y = y;
	        if (this.isDead()) {
	            this.die();
	        }
	        if(this.asWon()){
	        	this.asWon();
	        	System.out.println("Won");
	        }
	    }
		

	
		public IMap getMap() {
	        return this.map;
	        }


	
		public boolean isAlive() {
	        return this.alive;
	    }

	    protected void die() {

	        this.alive = false;
	        this.setHasMoved();
	    }

	  
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
	
