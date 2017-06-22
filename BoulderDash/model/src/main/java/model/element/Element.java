package model.element;

import java.awt.Image;

public abstract class Element implements IElement{
	


	
   private ISprite sprite;


    protected Permeability permeability;


    public Element(ISprite sprite, final Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
    }
    

// get the sprite of the element
    public ISprite getSprite() {
    	
        return this.sprite;
    }


    protected void setSprite(final ISprite sprite) {
        this.sprite = sprite;
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


