package model.element;

import java.awt.Image;
import fr.exia.showboard.ISquare;
import Interface.Permeability;
public interface IElement extends ISquare{

    public Permeability getPermeability();

    Sprite getSprite();
    Image getImage();

}