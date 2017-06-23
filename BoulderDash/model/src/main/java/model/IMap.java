package model;

import java.sql.SQLException;
import java.util.Observable;

import model.element.Element;
import model.element.IElement;

public interface IMap {
 

	public Element getOnTheMapXY(int x, int y);
	public void setMobileHasChanged();
	public Observable getObservable();
	public int getHeight();
	public int getWidth();
	void setOnTheMapXY(Element element, int x, int y);

	
}
