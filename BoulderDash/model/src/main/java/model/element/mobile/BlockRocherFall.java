package model.element.mobile;

import java.io.IOException;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;


public class BlockRocherFall extends Mobile{
	
	// Creation from Rock Sprite //
	
	 private static final Sprite spriteRocher = new Sprite('R', "rock.png");

	 // Dfinition of the state of fall of the rock //
	 
	public BlockRocherFall(IMap map) throws IOException {
		 super(sprite, map, Permeability.BLOCKING);

	}
	
	// Method moving the diamond when it falls //
	
	public final void moveDown() {
       super.moveDown();
       this.setSprite(spriteRocher);
		
   }
}
	// Method turning diamond back to static state //
	
//	public final Boolean changeToStatic(){
//		 super;
//		 this.setSprite(spriteRocher);
//		return null;
//	}
//} 
