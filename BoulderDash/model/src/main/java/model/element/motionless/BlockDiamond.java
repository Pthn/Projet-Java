package model.element.motionless;

import Interface.Permeability;
//import model.element.Sprite;
import model.element.Sprite;

public class BlockDiamond extends MotionlessElement{
	
<<<<<<< HEAD
	private static final Sprite BLOCKDIAMOND = new Sprite ('D', "C:/diamond.png");
=======
	private static final Sprite SPRITE = new Sprite ('D', "C:/diamond.png");
>>>>>>> branch 'master' of https://github.com/Pthn/Projet-Java.git
	// set the permeability and the sprite to block diamond
	private static int x;
	private static int y;
	BlockDiamond() {
		super(BLOCKDIAMOND, Permeability.TAKE,x,y);
	}

}
  