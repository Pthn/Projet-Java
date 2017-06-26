package view;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import Interface.IBoulderdashView;
import Interface.IOrderPerformer;
import Interface.UserOrder;
import fr.exia.showboard.BoardFrame;
import fr.exia.showboard.IPawn;
import fr.exia.showboard.ISquare;
import model.IMap;
import model.element.IElement;
import model.element.Sprite;
import model.element.mobile.IMobile;
import model.element.mobile.Mobile;



//		public BoulderdashView(final IMap map, final IMobile myHero){
//				
//				this.setView(mapView);
//				this.setMap(map);
//				this.setMyHero(myHero);
//				((IElement) this.getMyHero()).getSprite();
//				this.setEnemy(enemy);
//				((IElement) this.getEnemy()).getSprite();
//				this.setBlockDiamondFall(blockDiamondFall);
//				((IElement) this.getBlockDiamondFall()).getSprite();
//				this.setBlockRocherFall(blockRocherFall);
//				((IElement) this.getBlockRocherFall()).getSprite();
//				this.getDiamond();
//				this.setDiamond(diamond);
//				
//				this.setCloseView(closeView);
//			
//				this.setTitle("Boulder Dash");
//		        
//		        this.setSize(getWidth(), getHeight());
//		        this.setLocationRelativeTo(null);
//		        JPanel pan = new JPanel((LayoutManager) map);
//		        this.setContentPane(pan);
//		        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		        this.setVisible(true);
//		        this.setResizable(false);
//
//		        this.setContentPane(pan);
//		        
//		        this.setVisible(true);
//		}
//
//		public void drawScore(Graphics g){
//			g.drawString("Diamond = " + score, 25, 25);
//			
//			//add le if contact avec diament : score + 1 = score
//		}
		
	
public class BoulderdashView implements  Runnable, KeyListener, IBoulderdashView {
	private static final int mapView = 18;
	private static final int squareSize = 40;
	private Rectangle closeView;
	private IMap map;
	private Mobile myHero;
	private int view;

//	private IMobile enemy;
//	private IMobile blockDiamondFall;
//	private IMobile blockRocherFall;
//	private IMap diamond;
//	private int score = 0;
	private IOrderPerformer orderPerformer;
		
	public BoulderdashView(final IMap map, final Mobile myHero) throws IOException{
		this.setView(mapView);
		this.setMap(map);
		this.setMyHero(myHero);
		this.getMyHero().getSprite().loadImage();
		
		this.setCloseView(new Rectangle(0, this.getMyHero().getY(), this.getMap().getWidth(), mapView));
		SwingUtilities.invokeLater(this);
	}

	
	public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
	}

	
    public final void run() {
    	final BoardFrame boardFrame = new BoardFrame("Boulder Dash");
        boardFrame.setDimension(new Dimension(this.getMap().getWidth(), this.getMap().getHeight()));
        boardFrame.setDisplayFrame(this.closeView);
        boardFrame.setSize(this.closeView.width * squareSize, this.closeView.height * squareSize);
        boardFrame.setHeightLooped(true);
        boardFrame.addKeyListener(this);
        boardFrame.setFocusable(true);
        boardFrame.setFocusTraversalKeysEnabled(false);

            for (int x = 0; x < this.getMap().getWidth(); x++) {
                for (int y = 0; y < this.getMap().getHeight(); y++) {
                    boardFrame.addSquare((ISquare) this.map.getOnTheMapXY(x, y), x, y);
                }
            }
            boardFrame.addPawn((IPawn) this.getMyHero());

            this.getMap().getObservable().addObserver(boardFrame.getObserver());
            //this.followPlayer();

            boardFrame.setVisible(true);
        }
	
	
	
    public final void show(final int yStart, final int xStart){
    	int y = yStart % this.getMap().getHeight();

    	for (int view = 0; view < this.getView(); view++){
    		for(int x = 0; x < this.getMap().getWidth(); x++){
    			if((x == this.getMyHero().getX()) && (y == yStart)){    
                    System.out.print(this.getMyHero().getSprite().getConsoleImage());
                } else {
                    System.out.print(((IElement) this.getMap().getOnTheMapXY(x, y)).getSprite().getConsoleImage());
                    }
    		}
    		y = (y+ 1) % this.getMap().getHeight();
    		
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
			
	@Override		
	public void keyTyped(final KeyEvent keyEvent){
				
	}
	
	public final void keyPressed(final KeyEvent keyEvent){
		try {
			this.getOrderPerformer().orderPerform(keyCodeToUserOrder(keyEvent.getKeyCode()));
        } catch (final IOException exception) {
        	exception.printStackTrace();
        }
			}
		
//	public void keyReleased(final KeyEvent keyEvent){
//				
//			}
			
	private IMap getMap(){
		return this.map;
   	}

   	private void setMap(final IMap map) throws IOException {
   		this.map = map;
	    for (int x = 0; x < this.getMap().getWidth(); x++) {
	    	for (int y = 0; y < this.getMap().getHeight(); y++) {
	    		((IElement) this.getMap().getOnTheMapXY(x, y)).getSprite().loadImage();
	    	}
	    }
   	}

   

   	public Mobile getMyHero() {
		return myHero;
	}

	public void setMyHero(Mobile myHero) {
		this.myHero = (Mobile) myHero;
	}

	private int getView(){
   		return this.view;
   	}

   	private void setView(final int view){
   		this.view = view;
   	}

	       /*	private Rectangle getCloseView(){
	       		return this.closeView;
	       	}*/

   	private void setCloseView(final Rectangle closeView){
   		this.closeView = closeView;
   	}

   	private IOrderPerformer getOrderPerformer(){
   		return this.orderPerformer;
   	}

	public final void setOrderPerformer(final IOrderPerformer orderPerformer) {
	       		this.orderPerformer = orderPerformer;
	}


	public void keyReleased(KeyEvent arg0) {
	

			}
	public Rectangle getCloseView()
	{
		return this.closeView;
	}
}


//	}

//		        SwingUtilities.invokeLater(this);
//		}
//		 public IMap displayMap(Graphics g)
//		  {
//		
//		    try
//		    {
//		      map mapdisplay = new map();
//		      //Pour une image de fond
//		      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
//		    } catch (IOException e)
//		    {
//		      e.printStackTrace();
//		    }
////		  }
//		
//		public void displayMessage(final String message){
//	        JOptionPane.showMessageDialog(null, message);
//			
//		}

//			public IMobile getEnemy()
//			{
//				return this.enemy;
//			}
//			public void setEnemy(final IMobile enemy)
//			{
//				this.enemy = enemy;
//			}
//			
//			public IMobile getBlockDiamondFall(){
//				return this.blockDiamondFall;
//			}
//			
//			public void setBlockDiamondFall(final IMobile blockDiamondFall){
//				this.blockDiamondFall = blockDiamondFall;
//			}
//			
//			public IMobile getBlockRocherFall(){
//				return this.blockRocherFall;
//			}
//			
//			public void setBlockRocherFall(final IMobile blockRocherFall){
//				this.blockRocherFall = blockRocherFall;
//			}
//			
//			public IMap getDiamond(){
//				return diamond;
//			}
//			
//			public void setDiamond(IMap diamond){
//				this.diamond = diamond;
//			}
			
			
//			public  void Window(IMap map)
//			{			 
//			        this.setTitle("Boulder Dash");
//			        this.setSize(getWidth(), getHeight());
//			        this.setLocationRelativeTo(null);
//			        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			        this.setVisible(true);
//			        this.setResizable(false);
//			        this.setContentPane((map) new map());
//			        this.setVisible(true);
//			     }
			


