package model.element.mobile;

import java.io.IOException;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class BlockDiamondFall extends Mobile{

	 private static final Sprite spriteDiamond  = new Sprite('H', "Diamond.png");

	public BlockDiamondFall(final int x, final int y, IMap map) throws IOException {
		 super(x, y, sprite, map, Permeability.BLOCKING);
	        spriteDiamond.loadImage();
	}
	
	public final void moveDown() {
        super.moveDown();
        this.setSprite(spriteDiamond);
		
    }
	
	public final Boolean changeToStatic(){
		 super.changeToStatic();
		 this.setSprite(spriteDiamond);
		return null;
	}
} 
