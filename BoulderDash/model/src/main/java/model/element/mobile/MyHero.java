package model.element.mobile;
import java.io.IOException;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class MyHero extends Mobile{
	
	// Definition of the Sprites according to the displacements //
	
    private static final Sprite sprite          = new Sprite('H', "hero_face");

    private static final Sprite spriteTurnLeft  = new Sprite('H', "hero_left");
    
    private static final Sprite spriteTurnRight = new Sprite('H', "hero_right");
    
    private static final Sprite spriteTurnUp = new Sprite('H', "hero_up");
    
    private static final Sprite spriteTurnDown = new Sprite('H', "hero_down");
   
    // Creation from Hero Method //
    
	 public MyHero(final int x, final int y, final IMap map) throws IOException {
	        super(x, y, sprite, map, Permeability.BLOCKING);
	        spriteTurnLeft.loadImage();
	        spriteTurnRight.loadImage();
	        spriteTurnDown.loadImage();
	        spriteTurnUp.loadImage();
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

