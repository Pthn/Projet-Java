package model.element.mobile;

import java.awt.Point;

import fr.exia.showboard.IPawn;
import model.element.IElement;
import model.IMap;
import model.element.Sprite;
public interface IMobile  extends IPawn, IElement{

		void moveUp();
		void moveLeft();
		void moveDown();
		void moveRight();
		void doNothing();
//		IElement getX();
//		IElement getY();
		public boolean isAlive();

		IMap getMap();



		Point getPosition();
}
