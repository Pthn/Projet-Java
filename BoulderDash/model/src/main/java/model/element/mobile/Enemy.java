package model.element.mobile;

import java.io.IOException;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class Enemy extends Mobile{
	
	 private static final Sprite spriteEnemy = new Sprite('H', "Enemy.png");

		public Enemy(final int x, final int y, IMap map) throws IOException {
			 super(x, y, sprite, map, Permeability.BLOCKING);
		        spriteEnemy.loadImage();
		}
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
	public final Boolean changeToStatic(){
		 super.changeToStatic();
		 this.setSprite(spriteEnemy);
		return null;
	} 
}
