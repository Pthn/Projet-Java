package model.element;

import java.awt.Image;


public abstract class Element implements IElement{
	


	
    protected static Sprite sprite;


    protected Permeability permeability;


    public Element(final Sprite sprite, final Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
    }

// get the sprite of the element
    public final Sprite getSprite() {
        return Element.sprite;
    }


    protected void setSprite(final Sprite sprite) {
        Element.sprite = sprite;
    }

// get the permeability of the element 
    public final Permeability getPermeability() {
        return this.permeability;
    }


    private void setPermeability(final Permeability permeability) {
        this.permeability = permeability;
    }



    public final Image getImage() {
        return this.getSprite().getImage();
    }
}


