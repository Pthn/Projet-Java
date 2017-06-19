package model.element.motionless;

import model.element.Sprite;
import model.element.Permeability;

public class BlockTerre extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite(')', "BlockTerre.jpg");

	BlockTerre() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
