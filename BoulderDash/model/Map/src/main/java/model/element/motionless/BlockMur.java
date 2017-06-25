package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import model.element.Permeability;
import model.element.Sprite;


public class BlockMur extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite('M', "indestructible.jpg");
	// set the permeability and the sprite to block Mur
	
	BlockMur() {
		super(SPRITE, Permeability.BLOCKING);
	}
}
 