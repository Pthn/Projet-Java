package model.element.motionless;

import model.element.Sprite;
import model.element.Permeability;

public class BlockRocher extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite(')', "BlockRocher.jpg");

	BlockRocher() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
 