package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import Interface.Permeability;
import model.element.Sprite;


public class BlockFond extends MotionlessElement{
	

	public static final Sprite BLOCKFOND = new Sprite ('F', "C:/dirt_back.png");
	

	
	// set the permeability and the sprite to block fond

	private static int x;
	private static int y;
	public BlockFond() {
		super(BLOCKFOND, Permeability.PENETRABLE,x,y);
	}
}
  