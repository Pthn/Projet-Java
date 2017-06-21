package view;

import controller.IOrderPerformer;


public interface IBoulderdashView {


    void displayMessage(String message);

	void followMyHero();

	void setOrderPerformer(IOrderPerformer orderPerformer);
}
