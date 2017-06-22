package model.element;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite implements ISprite {
	private Image image;
	private String imageName;
	private char consoleImage;
	private boolean imageLoaded;
		
		
	public Sprite(char character, String imageName){
		this.setConsoleImage(character);
		this.setImageName(imageName);
	}
	
	public Sprite(final char character){
		this(character, "noimage.jpg");
	}
	
	/* (non-Javadoc)
	 * @see model.ISprite#getImage()
	 */

	public final Image getImage(){
		return this.image;
	}
		
	/* (non-Javadoc)
	 * @see model.ISprite#loadImage()
	 */
	public final int loadImage() throws IOException{
		this.setImage(ImageIO.read(new File("C:\\Users\\pierr\\Documents\\git\\Projet-Java\\BoulderDash\\img\\" + this.getImageName())));
		return consoleImage;
	}
	
	/* (non-Javadoc)
	 * @see model.ISprite#getConsoleImage()
	 */
	public final char getConsoleImage(){
		return this.consoleImage;
	}
	
	private void setImage(final Image image){
		this.image = image;
	}
	
	public void setConsoleImage(final char consoleImage){
		this.consoleImage = consoleImage;
	}
	
	/* (non-Javadoc)
	 * @see model.ISprite#getImageName()
	 */
	public final String getImageName(){
		return this.imageName;
	}
	
	private void setImageName(final String imageName){
		this.imageName = imageName;
	}
	
	/* (non-Javadoc)
	 * @see model.ISprite#isImageLoaded()
	 */
	public final boolean isImageLoaded(){
		return this.imageLoaded;
	}
	
	/* (non-Javadoc)
	 * @see model.ISprite#setImageLoaded(boolean)
	 */
	public final void setImageLoaded(final boolean isImageLoaded){
		this.imageLoaded = isImageLoaded;
	}
}