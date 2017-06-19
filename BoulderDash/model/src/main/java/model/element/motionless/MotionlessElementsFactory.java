package model.element.motionless;

public abstract class MotionlessElementsFactory {
	
	private static BlockFond blockfond = new BlockFond();
	private static BlockMur blockmur = new BlockMur();
	private static BlockTerre blockterre = new BlockTerre();
	private static BlockDiamond blockdiamond = new BlockDiamond();
	private static BlockRocher blockrocher = new BlockRocher();
	
	public static MotionlessElement createBlockFond(){
		return null;
	}
	
	public static MotionlessElement createBlockMur(){
		return null;
	}
	
	public static MotionlessElement createBlockTerre(){
		return null;
	}
	
	public static MotionlessElement createBlockDiamond(){
		return null;
	}
	
	public static MotionlessElement createBlockRocher(){
		return null;
	}
	
	public static MotionlessElement getFromFileSymbol(char fileSymbol){
		return null;
	}
}
