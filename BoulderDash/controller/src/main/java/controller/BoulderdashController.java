package controller;
 
import java.io.IOException;

import model.IBoulderdashModel;
import view.BoulderdashView;
import view.IBoulderdashView;
import Interface.IOrderPerformer;
import Interface.UserOrder;



public class BoulderdashController implements IBoulderdashController, IOrderPerformer {
	
	// Initialization //
	
	private static final int speed = 60;
	
	private BoulderdashView view;
	private IBoulderdashModel model;
	private UserOrder stackOrder;

	// Implementation of the controller //
	
	public BoulderdashController(final BoulderdashView view, final IBoulderdashModel model){
		this.setView(view);
		this.setModel(model);
		this.clearStackOrder();
		
	}
	
	// Main method of Management //
	
	public final void play() throws InterruptedException, IOException {
	//	while(this.getModel().getMyHero().isAlive()) {

			//Thread.sleep(speed);
			  while (!this.getModel().getMyHero().asWon()){
			switch (this.getStackOrder()) {
			case RIGHT:
				this.getModel().getMyHero().moveRight();
				//this.getModel().getBlockRocherFall().moveDownBlock();
				 System.out.println("Right");
				break;
			case LEFT:
				this.getModel().getMyHero().moveLeft();
				System.out.println("Left");
				//this.getModel().getBlockRocherFall().moveDownBlock();
				//System.out.println("Left");
				break;
			case UP:
				this.getModel().getMyHero().moveUp();
				//this.getModel().getBlockRocherFall().moveDownBlock();
				 System.out.println("UP");
				break;
			case DOWN:
				this.getModel().getMyHero().moveDown();
				//this.getModel().getBlockRocherFall().moveDownBlock();
				System.out.println("Down");
				break;
			case NOP:
			default:
				this.getModel().getMyHero().doNothing();
				//this.getModel().getBlockRocherFall().doNothing();
				break;
				
			}
			this.clearStackOrder();

		      }
			  //Display win message
		      this.getView().displayMessage("You Win!");
		      
		    //  break;
	//	  }
		
		//Check this player is alive and have won again
		if (this.getModel().getMyHero().isAlive() && this.getModel().getMyHero().asWon()){ 
		}
		else{
			//Check this player is dead and have game over
			this.getView().displayMessage("You Lose !");
		}
	}

	
	

	public final void orderPerform(final UserOrder userOrder) throws IOException {
 		this.setStackOrder(userOrder);
	}
	
	// Get the view //
	
	private BoulderdashView getView(){
		return this.view;
	}
	
	private void setView(final BoulderdashView view) {
		this.view = view;
	}
	
	// Get the model //
	
	private IBoulderdashModel getModel() {
		return this.model;
	}
	
	
	private void setModel(final IBoulderdashModel model) {
		this.model = model;
	} 
	
	// Stack Order commands //
	
	private UserOrder getStackOrder() {
		return this.stackOrder;
	}
	
	private void setStackOrder(final UserOrder stackOrder) {
		this.stackOrder = stackOrder;
	}
	
	private void clearStackOrder() {
		this.stackOrder = UserOrder.NOP;
	}
	
	public IOrderPerformer getOrderPerformer() {
		return this;
	}
	
}