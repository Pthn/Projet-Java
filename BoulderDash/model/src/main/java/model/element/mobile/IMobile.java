package model.element.mobile;

import java.awt.Point;

public interface IMobile {
	public void moveUp();
	public void moveLeft();
	public void moveDown();
	public void moveRight();
	public void doNothing();
	public int getX();
	public int getY();
	public boolean isAlive();
	public Point getPosition();
}
 