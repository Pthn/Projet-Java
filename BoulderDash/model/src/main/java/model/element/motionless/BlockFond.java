package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import model.element.Permeability;


public class BlockFond extends MotionlessElement{
	
	private static final String SPRITE = "BlockFond.jpg";
	// set the permeability and the sprite to block fond
	
	BlockFond() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
  