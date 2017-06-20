package model.element.mobile;

import java.awt.Point;

public interface IMobile {

		void moveUp();
		void moveLeft();
		void moveDown();
		void moveRight();
		void doNothing();
		int getX();
		int getY();

		public boolean isAlive();
		public Point getPosition();

}
