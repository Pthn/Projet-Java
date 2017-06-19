package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

import model.element.motionless.MotionlessElementsFactory;


public class Map extends Observable implements IMap{
	
	private int width;
	private int height;
	
	Map(String fileName) throws IOException{
		super();
		this.loadFile(fileName);
	}
	
	private void loadFile(String fileName) throws IOException{
		final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String line;
        int y = 0;
        line = buffer.readLine();
        this.setWidth(Integer.parseInt(line));
        line = buffer.readLine();
        this.setHeight(Integer.parseInt(line));
        this.onTheMap = new IElement[this.getWidth()][this.getHeight()];
        line = buffer.readLine();
        while (line != null) {
            for (int x = 0; x < line.toCharArray().length; x++) {
                this.setOnTheMapXY(MotionlessElementsFactory.getFromFileSymbol(line.toCharArray()[x]), x, y);
            }
            line = buffer.readLine();
            y++;
        }
        buffer.close();
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public IElement getOnTheMapXY(int x, int y){
		return this.onTheMapXY[x][y];
	}
	
	public Observable getObservable(){
		return this;
	}
	
	private void setHeight(int height){
		return;
	}
	
	private void setWidth(int width){
		return;
	}
	
	private void setOnTheMapXY(IElement element, int x, int y){
		this.onTheMap[x][y] = element;
	}
	
	public void setMobileHasChanged(){
		this.setChanged();
        this.notifyObservers();
	}
	
	
	
}
