package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import Interface.Permeability;
import model.element.Sprite;


public class BlockTerre extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite('T', "dirt.png");
	private static int x;
	private static int y;
		
	// set the permeability and the sprite to block terre
	
	BlockTerre() {
		super(SPRITE, Permeability.DIG, x, y);
	}
}
  