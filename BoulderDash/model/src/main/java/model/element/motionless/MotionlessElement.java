package model.element.motionless;

import model.element.Permeability;
import model.element.Element;


public abstract class MotionlessElement extends Element {
	
	//Set the permeability and the sprite
	
	 MotionlessElement(final String sprite,final Permeability permeability){
		 super(sprite, permeability);
	}
}
 