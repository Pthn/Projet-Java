package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import model.element.Permeability;
import model.element.Sprite;

public class BlockMur extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite('M', "BlockMur.jpg");

	BlockMur() {
		super(SPRITE, Permeability.BLOCKING);
	}
}
 