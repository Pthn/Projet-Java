package model.element.mobile;
import java.io.IOException;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class MyHero extends Mobile{
	
    private static final Sprite sprite          = new Sprite('H', "MyHero.png");

    private static final Sprite spriteTurnLeft  = new Sprite('H', "MyHeroLeft.png");
    private static final Sprite spriteTurnRight = new Sprite('H', "MyHeroRight.png");
    private static final Sprite spriteTurnUp = new Sprite('H', "MyHeroUp.png");
    private static final Sprite spriteTurnDown = new Sprite('H', "MyHeroDown.png");
   
	 public MyHero(final int x, final int y, final IMap map) throws IOException {
	        super(x, y, sprite, map, Permeability.BLOCKING);
	        spriteTurnLeft.loadImage();
	        spriteTurnRight.loadImage();
	        spriteTurnDown.loadImage();
	        spriteTurnUp.loadImage();
	    }

	
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
	    	
	    }
	}

