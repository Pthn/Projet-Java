package model.element.motionless;

import  model.element.motionless.MotionlessElement;
import Interface.Permeability;
import model.element.Sprite;


public class BlockMur extends MotionlessElement{
	

	private static final Sprite BLOCKMUR = new Sprite('M', "C:/indestructible.png");

	private static int x;
	private static int y;
	BlockMur() {
		super(BLOCKMUR, Permeability.BLOCKING, x, y);
	}
}
 