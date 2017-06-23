package model.element;

import java.awt.Image;
import fr.exia.showboard.ISquare;
public interface IElement extends ISquare{

	public Permeability getPermeability();

	public Sprite getSprite();
	Image getImage();

}
