package model.element.motionless;

import model.element.Permeability;
import model.element.Element;

import model.element.Sprite;
public abstract class MotionlessElement extends Element {
	
	//Set the permeability and the sprite of the element
	
	 MotionlessElement(final Sprite sprite,final Permeability permeability){
		 super(sprite, permeability);
	}
}
 