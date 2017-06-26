package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import Interface.Permeability;
import model.element.Sprite;


public class BlockRocher extends MotionlessElement{
	
	private static final Sprite SPRITE = new Sprite('R', "C:/Users/pierr/git/Projet-Java/BoulderDash/Sprites/rock.png");
	// set the permeability and the sprite to block Rocher
	private static int x;
	private static int y;
	BlockRocher() {
		super(SPRITE, Permeability.BLOCKING,  x, y);
	}
}
  