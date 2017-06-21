package model.element.mobile;
import java.io.IOException;

import model.IMap;
import model.element.Permeability;


public class MyHero extends Mobile{
	
	// Definition of the Sprites according to the displacements //
	
    private static final String sprite          = "hero_face";

    private static final String spriteTurnLeft  = "hero_left";
    
    private static final String spriteTurnRight = "hero_right";
    
    private static final String spriteTurnUp = "hero_up";
    
    private static final String spriteTurnDown = "hero_down";
   
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

