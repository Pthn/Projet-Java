package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import Interface.Permeability;
import model.element.Sprite;


public class BlockTerre extends MotionlessElement{
	
<<<<<<< HEAD
	private static final Sprite BLOCKTERRE = new Sprite('T', "C:/dirt.png");
=======
	private static final Sprite SPRITE = new Sprite('T', "C:/dirt.png");
>>>>>>> branch 'master' of https://github.com/Pthn/Projet-Java.git
	private static int x;
	private static int y;
		
	// set the permeability and the sprite to block terre
	
	BlockTerre() {
		super(BLOCKTERRE, Permeability.DIG, x, y);
	}
}
  