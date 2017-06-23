package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import model.element.Permeability;
import model.element.Sprite;


public class BlockFond extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite ('F', "dirt_back.jpg");
	// set the permeability and the sprite to block fond
	
	BlockFond() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
  