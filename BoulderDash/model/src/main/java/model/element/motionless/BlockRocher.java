package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import model.element.Permeability;
import model.element.Sprite;

public class BlockRocher extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite(')', "BlockRocher.jpg");

	BlockRocher() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
  