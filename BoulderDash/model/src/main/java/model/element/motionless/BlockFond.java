package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import model.element.Permeability;
import model.element.Sprite;

public class BlockFond extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite(')', "BlockFond.jpg");

	BlockFond() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
 