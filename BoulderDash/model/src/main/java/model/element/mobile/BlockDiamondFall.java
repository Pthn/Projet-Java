package model.element.mobile;

import java.io.IOException;

import model.IMap;
import model.element.Permeability;




public class BlockDiamondFall extends Mobile{

	// Creation from Diamond Sprite //
	
	 private static final String spriteDiamond  = "Diamond.png";

	 // Definition of the state of fall of the diamond //
	 
	public BlockDiamondFall(final int x, final int y, IMap map) throws IOException {
		 super(x, y, sprite, map, Permeability.BLOCKING);
	     
	}
	
	// Method moving the diamond when it falls //
	
	public final void moveDown() {
        super.moveDown();
        this.setSprite(spriteDiamond);
		
    }
	
	// Method for turning diamond back to static state //
	
	public final Boolean changeToStatic(){
		 super.changeToStatic();
		 this.setSprite(spriteDiamond);
		return null;
	}
} 
