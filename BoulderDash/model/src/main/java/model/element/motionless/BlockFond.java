package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import Interface.Permeability;
import model.element.Sprite;


public class BlockFond extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite ('F', "C:/Users/pierr/git/Projet-Java/BoulderDash/Sprites/dirt_back.png");
	// set the permeability and the sprite to block fond
	private static int x;
	private static int y;
	BlockFond() {
		super(SPRITE, Permeability.PENETRABLE,x,y);
	}
}
  