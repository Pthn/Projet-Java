package model;

import model.IElement;
public interface IMobile {

		void moveUp();
		void moveLeft();
		void moveDown();
		void moveRight();
		void doNothing();
		IElement getX();
		IElement getY();
		public boolean isAlive();
		public void getSprite();
		



}
