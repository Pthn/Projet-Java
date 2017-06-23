package model;

import java.awt.Point;
import model.IElement;
import model.IMap;
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
		public void getSprite();
		IMap getMap();

		


		Point getPosition();



}
