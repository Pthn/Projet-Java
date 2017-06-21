package model.element.mobile;

import java.io.IOException;

import model.IMap;
import model.element.Permeability;


public class Enemy extends Mobile{
	
	// Creation from Enemy Sprite //
	
	 private static final String spriteEnemy = "Enemy.png";

	 // Implementation from Enemy //
	 
		public Enemy(final int x, final int y, IMap map) throws IOException {
			 super(x, y, sprite, map, Permeability.BLOCKING);
		 
		}
		
		// Method of enemy movements //
		
    public final void moveLeft() {
        super.moveLeft();
        this.setSprite(spriteEnemy);
    }

    public final void moveRight() {
        super.moveRight();
        this.setSprite(spriteEnemy);
    }
    public final void moveUp() {
        super.moveUp();
        this.setSprite(spriteEnemy);
    }
    public final void moveDown() {
        super.moveDown();
        this.setSprite(spriteEnemy);
    }
    
    // Method for turning diamond back to static state //
    
	public final Boolean changeToStatic(){
		 super.changeToStatic();
		 this.setSprite(spriteEnemy);
		return null;
	} 
	
	
}
