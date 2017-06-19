package model;

import java.awt.Point;

public interface IMobile {

		void moveUp();
		void moveLeft();
		void moveDown();
		void moveRight();
		void doNothing();
		int getX();
		int getY();
		Boolean isAlive();
		
		Point getPosition();
		
		
	
}
