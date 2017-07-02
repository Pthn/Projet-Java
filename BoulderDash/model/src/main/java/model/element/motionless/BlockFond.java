package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import Interface.Permeability;
import model.element.Sprite;


public class BlockFond extends MotionlessElement{
	
<<<<<<< HEAD
	public static final Sprite BLOCKFOND = new Sprite ('F', "C:/dirt_back.png");
	
=======
	private static final Sprite SPRITE = new Sprite ('F', "C:/dirt_back.png");
	// set the permeability and the sprite to block fond
>>>>>>> branch 'master' of https://github.com/Pthn/Projet-Java.git
	private static int x;
	private static int y;
	BlockFond() {
		super(BLOCKFOND, Permeability.PENETRABLE,x,y);
	}
}
  