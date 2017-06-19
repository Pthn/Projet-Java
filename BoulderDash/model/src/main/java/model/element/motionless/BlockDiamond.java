package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import model.element.Permeability;
import model.element.Sprite;

public class BlockDiamond extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite(')', "BlockDiamond.jpg");

	BlockDiamond() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
  