package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import model.element.Permeability;


public class BlockTerre extends MotionlessElement{
	
	private static final String SPRITE = "BlockTerre.jpg";
	
		
	// set the permeability and the sprite to block terre
	
	BlockTerre() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
  