package model.element.motionless;

import Interface.Permeability;
//import model.element.Sprite;
import model.element.Sprite;

public class BlockDiamond extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite ('D', "diamond.png");
	// set the permeability and the sprite to block diamond
	private static int x;
	private static int y;
	BlockDiamond() {
		super(SPRITE, Permeability.TAKE,x,y);
	}

}
  