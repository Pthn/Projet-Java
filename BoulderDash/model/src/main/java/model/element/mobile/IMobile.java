package model.element.mobile;

import java.awt.Point;
import java.io.IOException;

import fr.exia.showboard.IPawn;

import model.IMap;
public interface IMobile  extends IPawn, model.element.IElement{

		void moveUp();
		void moveLeft();
		void moveDown();
		void moveRight() throws IOException;
		void moveDownBlock();
		void doNothing();
//		IElement getX();
		
//		IElement getY();
		public boolean isAlive();

		IMap getMap();

		boolean asWon();
		int getY();

		void setY(int y);

		boolean isDead();
		Point getPosition();
		int getX();

		void setX(int x);
}
