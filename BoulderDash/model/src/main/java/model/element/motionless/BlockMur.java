package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import model.element.Permeability;


public class BlockMur extends MotionlessElement{
	
	private static final String SPRITE = "BlockMur.jpg";
	// set the permeability and the sprite to block Mur
	
	BlockMur() {
		super(SPRITE, Permeability.BLOCKING);
	}
}
 