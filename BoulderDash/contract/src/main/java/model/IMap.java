package model;

import java.util.Observable;
import model.element.IElement;

public interface IMap {
	
	int getWidth();
	int getHeight();
	IElement getOnTheMapXY(int x, int y);
	void setMobileHasChanged();
	Observable getObservable();
	

}
