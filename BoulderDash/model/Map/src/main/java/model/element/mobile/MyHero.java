package model.element.mobile;
import java.io.IOException;

import model.IMap;
//import model.element.ISprite;
import model.element.Permeability;
import model.element.Sprite;


public class MyHero extends Mobile{
	
	// Definition of the Sprites according to the displacements //
	
    private static final Sprite sprite          = new Sprite('H', "img\\hero_face.png");

    private static final Sprite spriteTurnLeft  = new Sprite('H', "img\\hero_left.png");
    
    private static final Sprite spriteTurnRight = new Sprite('H', "img\\hero_right.png");
    
    private static final Sprite spriteTurnUp = new Sprite('H', "img\\hero_up.png");
    
    private static final Sprite spriteTurnDown = new Sprite('H', "img\\hero_down.png");
   
    // Creation from Hero Method //
    
	 public MyHero(final int x, final int y, final IMap map) throws IOException {
	        super(x, y, sprite, map, Permeability.BLOCKING);

	    }
 
	// Method for managing displacements or action //
	 
	    public final void moveLeft() {
	        super.moveLeft();
	        this.setSprite(spriteTurnLeft);
	    }

	    public final void moveRight() {
	        super.moveRight();
	        this.setSprite(spriteTurnRight);
	    }
	    public final void moveUp() {
	        super.moveUp();
	        this.setSprite(spriteTurnUp);
	    }
	    public final void moveDown() {
	        super.moveDown();
	        this.setSprite(spriteTurnDown);
	    }

	    public final void doNothing() {
	        super.doNothing();
	        this.setSprite(sprite);
	    }
	    
	    public void doBreak(){
	    	super.doBreak();
	    	
	    }
}
//		
//		public String setSprite() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//
//		public Permeability getPermeability() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//
//		public ISprite getSprite() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//	}

