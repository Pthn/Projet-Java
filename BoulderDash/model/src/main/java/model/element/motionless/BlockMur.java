package model.element.motionless;

import model.element.Sprite;
import model.element.Permeability;

public class BlockMur extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite(')', "BlockMur.jpg");

	BlockMur() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
 