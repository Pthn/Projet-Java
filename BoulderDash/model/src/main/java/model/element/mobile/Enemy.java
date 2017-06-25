package model.element.mobile;

import java.io.IOException;

import model.IMap;
import Interface.Permeability;
import model.element.Sprite;


public class Enemy extends Mobile{
	
	// Creation from Enemy Sprite //
	
	 private static final Sprite spriteEnemy = new Sprite ('E', "C:/Users/pierr/git/Projet-Java/BoulderDash/Sprites/ennemy.png");

	 // Implementation from Enemy //
	 
		public Enemy(final int x, final int y, IMap map) throws IOException {
			 super(sprite, map, Permeability.ENEMY, x, y);
			 spriteEnemy.loadImage();
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
    
//	public final Boolean changeToStatic(){
//		 super.changeToStatic();
//		 this.setSprite(spriteEnemy);
//		return null;
//	} 
//	
	
}
