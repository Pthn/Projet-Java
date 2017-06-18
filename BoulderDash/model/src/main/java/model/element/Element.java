package model.element;

public abstract class Element {
	public Element(Sprite sprite, Permeability permeability){
	}
	
	public Sprite getSprite(){
		return null;
	}
	
	protected void setSprite(Sprite sprite){
		return;
	}
	
	public Permeability getPermeability(){
		return null;
	}
	
	private void setPermeability(Permeability permeability){
		return;
	}
	
	public Image getImage(){
		return null;
	}
}


