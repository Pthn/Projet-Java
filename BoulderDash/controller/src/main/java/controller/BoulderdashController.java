package controller;
 
import java.io.IOException;

import model.IBoulderdashModel;
import view.IBoulderdashView;

public class BoulderdashController implements IBoulderdashController, IOrderPerformer {
	
	// Initialization //
	
	private static final int speed = 300;
	
	private IBoulderdashView view;
	private IBoulderdashModel model;
	private UserOrder stackOrder;

	// Implementation of the controller //
	
	public BoulderdashController(final IBoulderdashView view, final IBoulderdashModel model){
		this.setView(view);
		this.setModel(model);
		this.clearStackOrder();
		
	}
	
	// Main method of Management //
	
	public final void play() throws InterruptedException {
		while(this.getModel().getMyHero().isAlive()) {
			Thread.sleep(speed);
			switch (this.getStackOrder()) {
			case RIGHT:
				this.getModel().getMyHero().moveRight();
				break;
			case LEFT:
				this.getModel().getMyHero().moveLeft();
				break;
			case UP:
				this.getModel().getMyHero().moveUp();
				break;
			case DOWN:
				this.getModel().getMyHero().moveDown();
				break;
			case NOP:
			default:
				this.getModel().getMyHero().doNothing();
				break;
				
			}
			this.clearStackOrder();
			if (this.getModel().getMyHero().isAlive()) {
				this.getModel().getMyHero().moveDown();
			}
			this.getView().followMyHero();
		}
		this.getView().displayMessage("You lose");
	}
	
	
	
	public final void orderPerform(final UserOrder userOrder) throws IOException {
 		this.setStackOrder(userOrder);
	}
	
	// Get the view //
	
	private IBoulderdashView getView(){
		return this.view;
	}
	
	private void setView(final IBoulderdashView view) {
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