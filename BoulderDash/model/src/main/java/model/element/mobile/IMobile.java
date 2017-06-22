package model.element.mobile;

import java.awt.Point;

import model.IElement;
import model.IMap;
import model.element.Sprite;
import fr.exia.showboard.IPawn;
public interface IMobile  extends IPawn, IElement{

		void moveUp();
		void moveLeft();
		void moveDown();
		void moveRight();
		void doNothing();
//		IElement getX();
//		IElement getY();
		public boolean isAlive();
		public Sprite getSprite();
		IMap getMap();



		Point getPosition();
}
