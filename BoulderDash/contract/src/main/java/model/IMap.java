package model;

import java.util.Observable;

import javax.lang.model.element.Element;

public interface IMap {
	
	int getWidth();
	int getHeight();
	Element getOnTheMapXY(int x, int y);
	void setMobileHasChanged();
	Observable getObservable();
	

}
