package model.element.motionless;

import Interface.Permeability;
//import model.element.Sprite;
import model.element.Sprite;

public class BlockDiamond extends MotionlessElement{
	

	private static final Sprite BLOCKDIAMOND = new Sprite ('D', "C:/diamond.png");



	private static int x;
	private static int y;
	BlockDiamond() {
		super(BLOCKDIAMOND, Permeability.TAKE,x,y);
	}

}
  