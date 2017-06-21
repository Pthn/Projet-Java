package model.element.mobile;

import java.io.IOException;

import model.IMap;
import model.element.Permeability;


public class BlockRocherFall extends Mobile{
	
	// Creation from Rock Sprite //
	
	 private static final String spriteRocher = "img\rock.png";

	 // Dfinition of the state of fall of the rock //
	 
	public BlockRocherFall(IMap map) throws IOException {
		 super(sprite, map, Permeability.BLOCKING);

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
