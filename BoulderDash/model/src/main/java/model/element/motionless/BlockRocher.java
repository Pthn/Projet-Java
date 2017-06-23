package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import model.element.Permeability;
import model.element.Sprite;


public class BlockRocher extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite('R', "rock.png");
	// set the permeability and the sprite to block Rocher
	
	BlockRocher() {
		super(SPRITE, Permeability.PENETRABLE);
	}
}
  