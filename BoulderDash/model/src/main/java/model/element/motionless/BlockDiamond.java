package model.element.motionless;

import model.element.Sprite;
import model.element.Permeability;

public class BlockDiamond extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite(')', "BlockDiamond.jpg");

	BlockDiamond() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
 