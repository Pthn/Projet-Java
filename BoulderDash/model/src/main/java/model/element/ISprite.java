package model.element;

import java.awt.Image;
import java.io.IOException;

public interface ISprite {

	Image getImage();

	int loadImage() throws IOException;

	char getConsoleImage();

	String getImageName();

	boolean isImageLoaded();

	void setImageLoaded(boolean isImageLoaded);

}