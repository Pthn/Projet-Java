package model.element;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
	private Image image;
	private String imageName;
	private char consoleImage;
	private boolean imageLoaded;
		
		

//	public final void loadImage() throws IOException{
//		this.setImage(ImageIO.read(new File("C:\\Users\\pierr\\Documents\\git\\Projet-Java\\BoulderDash\\img\\" + this.getImageName())));
//	
//	}
//	 public final void loadImage() throws IOException {
//	        this.setImage(ImageIO.read(new File("Map/" + this.getImageName())));
//	    }
	 public Sprite(final char character, final String imageName) {
	        this.setConsoleImage(character);
	        this.setImageName(imageName);
	    }

	    /**
	     * Instantiates a new sprite.
	     *
	     * @param character
	     *            the character
	     */
	    public Sprite(final char character) {
	        this(character, "noimage.jpg");
	    }

	    /**
	     * Gets the image.
	     *
	     * @return the image
	     */
	    public final Image getImage() {
	        return this.image;
	    }

	    /**
	     * Loads image.
	     *
	     * @throws IOException
	     *             Signals that an I/O exception has occurred.
	     */
	    public final void loadImage() throws IOException {
	        this.setImage(ImageIO.read(new File("images/" + this.getImageName())));
	    }

	    /**
	     * Gets the console image.
	     *
	     * @return the consoleImage
	     */
	    public final char getConsoleImage() {
	        return this.consoleImage;
	    }

	    /**
	     * Sets the image.
	     *
	     * @param image
	     *            the new image
	     */
	    private void setImage(final Image image) {
	        this.image = image;
	    }

	    /**
	     * Sets the console image.
	     *
	     * @param consoleImage
	     *            the consoleImage to set
	     */
	    private void setConsoleImage(final char consoleImage) {
	        this.consoleImage = consoleImage;
	    }

	    /**
	     * Gets the image name.
	     *
	     * @return the imageName
	     */
	    public final String getImageName() {
	        return this.imageName;
	    }

	    /**
	     * Sets the image name.
	     *
	     * @param imageName
	     *            the imageName to set
	     */
	    private void setImageName(final String imageName) {
	        this.imageName = imageName;
	    }

	    /**
	     * Checks if is image loaded.
	     *
	     * @return true, if is image loaded
	     */
	    public final boolean isImageLoaded() {
	        return this.imageLoaded;
	    }

	    /**
	     * Sets the image loaded.
	     *
	     * @param isImageLoaded
	     *            the new image loaded
	     */
	    public final void setImageLoaded(final boolean isImageLoaded) {
	        this.imageLoaded = isImageLoaded;
	    }
	}
