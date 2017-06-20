package view;

import javax.swing.JOptionPane;


public class ViewFacade implements IBoulderdashView {

    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
    }

    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

	
	public void followMyHero() {

		
	}

}
