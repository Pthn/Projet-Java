package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import model.element.Permeability;
import model.element.Sprite;


public class BlockTerre extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite('T', "dirt.jpg");
	
		
	// set the permeability and the sprite to block terre
	
	BlockTerre() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
  