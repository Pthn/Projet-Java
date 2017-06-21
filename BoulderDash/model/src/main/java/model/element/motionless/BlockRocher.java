package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import model.element.Permeability;


public class BlockRocher extends MotionlessElement{
	
	private static final String SPRITE = "BlockRocher.jpg";
	// set the permeability and the sprite to block Rocher
	
	BlockRocher() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
  