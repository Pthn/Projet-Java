package model.element.motionless;



public abstract class MotionlessElementsFactory {
	
	private static final BlockFond blockFond = new BlockFond();
	private static final BlockMur blockMur = new BlockMur();
	private static final BlockTerre blockTerre = new BlockTerre();
	private static final BlockDiamond blockDiamond = new BlockDiamond();
	private static final BlockRocher blockRocher = new BlockRocher();
	
	
	private static MotionlessElement[]       motionlessElements  = {
	        BlockFond,
	        BlockMur,
	        BlockTerre,
	        BlockDiamond,
	        BlockRocher};
	
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
	
	public static MotionlessElement getFromFileSymbol(char fileSymbol){
		return null;
	}
}
