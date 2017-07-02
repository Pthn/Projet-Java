package model.element.mobile;

import java.io.IOException;

import model.IMap;
import Interface.Permeability;
import model.element.Sprite;


public class BlockRocherFall extends Mobile{
	
	// Creation from Rock Sprite //
	
	 private static final Sprite spriteRocher = new Sprite('R', "C:/rock.png");


	 // Dfinition of the state of fall of the rock //
	 
	public BlockRocherFall(final int x, final int y,IMap map) throws IOException {
		 super(spriteRocher, map, Permeability.BLOCKING,x ,y);
		 spriteRocher.loadImage();
	}
	
	// Method moving the diamond when it falls //
	
	public final void moveDown() {
       super.moveDownBlock();
       this.setSprite(spriteRocher);
		
   }
	
	public final void doNothing(){
		super.doNothing();
		this.setSprite(sprite);
	}
}
