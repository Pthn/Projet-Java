package model.element;

import java.awt.Image;
import model.element.Sprite;
import model.element.motionless.BlockFond;
import Interface.Permeability;

public abstract class Element implements IElement{




   private Sprite sprite;
   protected BlockFond fond;

    protected Permeability permeability;


    public Element(Sprite sprite, final Permeability permeability, int spriteX, int spriteY) {
        this.setSprite((Sprite) sprite);
        this.setPermeability(permeability);
		this.setSpriteX(spriteX);
		this.setSpriteY(spriteY);
    }

    public void setSpriteY(int spriteY) {
		
		
	}

	public void setSpriteX(int spriteX) {
	
		
	}
// get the sprite of the element
    public Sprite getSprite() {

        return (Sprite) this.sprite;
    }


    protected void setSprite(final Sprite sprite) {
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

    public final BlockFond getFond() {
		return this.fond;
	}

	public void setFond(final BlockFond fond) {
		this.fond = fond;
	}
}

