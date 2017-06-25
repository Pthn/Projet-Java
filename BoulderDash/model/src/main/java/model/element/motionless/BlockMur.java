package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import Interface.Permeability;
import model.element.Sprite;


public class BlockMur extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite('M', "indestructible.png");
	// set the permeability and the sprite to block Mur
	private static int x;
	private static int y;
	BlockMur() {
		super(SPRITE, Permeability.BLOCKING, x, y);
	}
}
 