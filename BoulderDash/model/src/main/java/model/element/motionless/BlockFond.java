package model.element.motionless;

import model.element.Sprite;
import model.element.Permeability;

public class BlockFond extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite(')', "BlockFond.jpg");

	BlockFond() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
