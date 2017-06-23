package model;

import java.awt.Image;

import fr.exia.showboard.ISquare;
import model.element.Sprite;


public interface IElement extends ISquare{

	public Permeability getPermeability();

	public Sprite getSprite();
	Image getImage();

}
