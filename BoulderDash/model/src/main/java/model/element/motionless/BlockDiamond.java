package model.element.motionless;

import  model.element.motionless.MotionlessElement;

import java.awt.Image;

import model.element.Permeability;
//import model.element.Sprite;
import model.element.Sprite;

public class BlockDiamond extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite ('D', "diamond.jpg");
	// set the permeability and the sprite to block diamond
	
	BlockDiamond() {
		super(SPRITE, Permeability.PENETRABLE);
	}

}
  