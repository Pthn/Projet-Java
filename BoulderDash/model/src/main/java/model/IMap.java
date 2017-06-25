package model;

import java.util.Observable;

import javax.lang.model.element.Element;

import model.element.IElement;

public interface IMap {
	
	int getWidth();
	int getHeight();
	IElement getOnTheMapXY(int x, int y);
	void setMobileHasChanged();
	Observable getObservable();
	public void setOnTheMapXY(final IElement element, final int x, final int y);

}
