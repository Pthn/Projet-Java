package model.element.motionless;

import Interface.Permeability;
import model.element.Sprite;
import model.element.Element;


public abstract class MotionlessElement extends Element {
	
	//Set the permeability and the sprite
	
	 MotionlessElement(final Sprite sprite,final Permeability permeability, final int spriteX, final int spriteY){
		 super(sprite, permeability, spriteX, spriteY);
	}
}
 