package model.element.mobile;

import java.io.IOException;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class BlockRocherFall extends Mobile{
	
	// Creation from Rock Sprite //
	
	 private static final Sprite spriteRocher = new Sprite('R', "Rocher.png");

	 // Dfinition of the state of fall of the rock //
	 
	public BlockRocherFall(final int x, final int y, IMap map) throws IOException {
		 super(x, y, sprite, map, Permeability.BLOCKING);
	        spriteRocher.loadImage();
	}
	
	// Method moving the diamond when it falls //
	
	public final void moveDown() {
       super.moveDown();
       this.setSprite(spriteRocher);
		
   }
	
	// Method turning diamond back to static state //
	
	public final Boolean changeToStatic(){
		 super.changeToStatic();
		 this.setSprite(spriteRocher);
		return null;
	}
} 
