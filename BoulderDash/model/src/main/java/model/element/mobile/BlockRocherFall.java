package model.element.mobile;

import java.io.IOException;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class BlockRocherFall extends Mobile{
	 private static final Sprite spriteRocher = new Sprite('R', "Rocher.png");

	public BlockRocherFall(final int x, final int y, IMap map) throws IOException {
		 super(x, y, sprite, map, Permeability.BLOCKING);
	        spriteRocher.loadImage();
	}
	
	public final void moveDown() {
       super.moveDown();
       this.setSprite(spriteRocher);
		
   }
	
	public final Boolean changeToStatic(){
		 super.changeToStatic();
		 this.setSprite(spriteRocher);
		return null;
	}
} 
