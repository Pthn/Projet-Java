package model.element;

import java.awt.Image;



public abstract class Element{
	
    private Sprite sprite;


    private Permeability permeability;


    public Element(final Sprite sprite, final Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
    }


    public final Sprite getSprite() {
        return this.sprite;
    }


    private void setSprite(final Sprite sprite) {
        this.sprite = sprite;
    }


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


