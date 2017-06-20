package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import model.element.Permeability;
import model.element.Sprite;

public class BlockTerre extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite('T', "BlockTerre.jpg");

	BlockTerre() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
  