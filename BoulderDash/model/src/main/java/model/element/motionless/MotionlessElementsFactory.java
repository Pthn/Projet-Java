package model.element.motionless;

import model.element.Element;
import model.element.*;

public abstract class MotionlessElementsFactory {
	
	// instantiation of the motionless element
	
	private static final BlockFond blockFond = new BlockFond();
	private static final BlockMur blockMur = new BlockMur();
	private static final BlockTerre blockTerre = new BlockTerre();
	private static final BlockDiamond blockDiamond = new BlockDiamond();
	private static final BlockRocher blockRocher = new BlockRocher();
	
	
	private static MotionlessElement[]       motionlessElements  = {
	        blockFond,
	        blockMur,
	        blockTerre,
	        blockDiamond,
	        blockRocher};
	
	
	//creation of the motionless element
	public static MotionlessElement createBlockFond(){
		return blockFond;
	}
	
	public static MotionlessElement createBlockMur(){
		return blockMur;
	}
	
	public static MotionlessElement createBlockTerre(){
		return blockTerre;
	}
	
	public static MotionlessElement createBlockDiamond(){
		return blockDiamond;
	}
	
	public static MotionlessElement createBlockRocher(){
		return blockRocher;
	}
	
 //Get the sprite of the element
//    public static MotionlessElement getFromSymbol(String fileSymbol) {
//        for (final MotionlessElement motionlessElement : motionlessElements) {
//            if (motionlessElement.getSprite() == (fileSymbol+".png")) {
//                return motionlessElement;
//            }
//        }
//		return void;
//
//  
//} 
//    public static MotionlessElement getFromSymbol(String fileSymbol, Element element) {
//    	
//        for (final MotionlessElement MotionlessElement : motionlessElements) {
//            if (element.getSprite() == (fileSymbol+".png")) {
//                 return MotionlessElement;
//            }
//        }   
//        return null ;//
	
//
//    }
	public static MotionlessElement getFromSymbol(final char fileSymbol) 
	{
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
				
				return motionlessElement;
			}
		
		}
		return null;
		
	}
}
