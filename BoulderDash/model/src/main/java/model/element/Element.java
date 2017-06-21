package model.element;

import java.awt.Image;


public abstract class Element implements IElement{
	


	
    String sprite;


    protected Permeability permeability;


    public Element(String sprite, final Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
    }

// get the sprite of the element
    public final String getSprite() {
        return this.sprite;
    }


    protected void setSprite(final String sprite) {
        this.sprite = sprite;
    }

// get the permeability of the element 
    public final Permeability getPermeability() {
        return this.permeability;
    }


    private void setPermeability(final Permeability permeability) {
        this.permeability = permeability;
    }

}

//    public final Image getImage() {
//        return this.getSprite().getImage();
//    }
//}


