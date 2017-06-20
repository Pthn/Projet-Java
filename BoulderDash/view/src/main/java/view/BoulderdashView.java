package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import controller.IOrderPerformer;
import controller.UserOrder;
import model.IMap;
import model.IMobile;



public class BoulderdashView implements Runnable, KeyListener, IBoulderdashView
{
	private static int squareSize = 50;
	public static int mapView = 10;
	private Rectangle closeView;
	private int view;
	private IMap map;
	private IMobile myHero;
	private IOrderPerformer orderPerformer;
	private IMobile enemy;
	
	
	
	
		public BoulderdashView(final IMap map, final IMobile myHero){
			
			  this.setView(mapView);
		        this.setMap(map);
		        this.setMyHero(myHero);
		        this.getMyHero().getSprite().loadImage();
		  
		        this.setCloseView(new Rectangle(0, this.getMyHero().getY(), this.getMap().getWidth(), mapView));
		        SwingUtilities.invokeLater(this);
		}
		public void displayMessage(final String message){
	        JOptionPane.showMessageDialog(null, message);
			
		}
		public void run(){
			final BoardFrame boardFrame = new BoardFrame("Close view");
	        boardFrame.setDimension(new Dimension(this.getMap().getWidth(), this.getMap().getHeight()));
	        boardFrame.setDisplayFrame(this.closeView);
	        boardFrame.setSize(this.closeView.width * squareSize, this.closeView.height * squareSize);
	        boardFrame.setHeightLooped(true);
	        boardFrame.addKeyListener(this);
	        boardFrame.setFocusable(true);
	        boardFrame.setFocusTraversalKeysEnabled(false);
	        for (int x = 0; x < this.getMap().getWidth(); x++) {
	            for (int y = 0; y < this.getMap().getHeight(); y++) {
	                boardFrame.addSquare(this.map.getOnTheMapXY(x, y), x, y);
	            }
	        }
	        boardFrame.addPawn(this.getMyHero());

	        this.getMap().getObservable().addObserver(boardFrame.getObserver());
	        this.followMyHero();

	        boardFrame.setVisible(true);
		}
		public void show(int yStart){
		     int y = yStart % this.getMap().getHeight();
		        for (int view = 0; view < this.getView(); view++) {
		            for (int x = 0; x < this.getMap().getWidth(); x++) {
		                if ((x == this.getMyHero().getX()) && (y == yStart)) {
		                    System.out.print(this.getMyHero().getSprite().getConsoleImage());
		                } else {
		                    System.out.print(this.getMap().getOnTheMapXY(x, y).getSprite().getConsoleImage());
		                }
		            }
		            y = (y + 1) % this.getMap().getHeight();
		            System.out.print("\n");
		        }
			
		}
		public static UserOrder keyCodeToUserOrder(final int keyCode){
			
			UserOrder userOrder;
	        switch (keyCode) {
	            case KeyEvent.VK_RIGHT:
	                userOrder = UserOrder.RIGHT;
	                break;
	            case KeyEvent.VK_LEFT:
	                userOrder = UserOrder.LEFT;
	                break;
	            case KeyEvent.VK_UP:
	                userOrder = UserOrder.UP;
	                break;
	            case KeyEvent.VK_DOWN:
	                userOrder = UserOrder.DOWN;
	                break;
	            default:
	                userOrder = UserOrder.NOP;
	                break;
	        }
	        return userOrder;
			
		}
		public void keyTyped(final KeyEvent keyEvent){
			
		}
		public final void keyPressed(final KeyEvent keyEvent){
			 try {
		            this.getOrderPerformer().orderPerform(keyCodeToUserOrder(keyEvent.getKeyCode()));
		        } catch (final IOException exception) {
		            exception.printStackTrace();
		        }
		}
		public void keyReleased(final KeyEvent keyEvent){
			
		}
		public void followMyHero(){
			this.getCloseView().y = this.getMyHero().getY() - 1;
		}
		
		
			public IMap getMap()
			{
				return this.map;
			}
			public void setMap(final IMap map)throws IOException
			{
				this.map = map;
		        for (int x = 0; x < this.getMap().getWidth(); x++) {
		            for (int y = 0; y < this.getMap().getHeight(); y++) {
		                this.getMap().getOnTheMapXY(x, y).getSprite().loadImage();
		            }
		        }
			}
		
			public IMobile getMyHero()
			{
				return this.myHero;
			}
			public void setMyHero(final IMobile myHero)
			{
				this.myHero = myHero;
			}
			
			public int getView()
			{
				return this.view;
			}
			public void setView(final int view)
			{
				this.view = view;
			}

			public Rectangle getCloseView()
			{
				return this.closeView;
			}
			public void setCloseView(final Rectangle closeView)
			{
				this.closeView = closeView;
			}
			
			public IOrderPerformer getOrderPerformer()
			{
				return this.orderPerformer;
			}
			public void setOrderPerformer(final IOrderPerformer orderPerformer)
			{
				this.orderPerformer = orderPerformer;
			}
			
			public IMobile getEnemy()
			{
				return this.enemy;
			}
			public void setEnemy(final IMobile enemy)
			{
				this.enemy = enemy;
			}
		
			
}
