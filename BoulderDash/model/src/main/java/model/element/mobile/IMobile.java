package model.element.mobile;

import java.awt.Point;

import fr.exia.showboard.IPawn;

import model.IMap;
public interface IMobile  extends IPawn, model.element.IElement{

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
