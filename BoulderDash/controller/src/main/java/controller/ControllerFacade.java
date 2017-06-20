package controller;

import java.sql.SQLException;
import java.util.List;

import model.Example;
import model.IBoulderdashModel;
import view.IBoulderdashView;
 
/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * 
 * @version 1.0
 */
public class ControllerFacade implements IBoulderdashController {

    /** The view. */
    private final IBoulderdashView  view;

    /** The model. */
    private final IBoulderdashModel model;

    /** 
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IBoulderdashView view, final IBoulderdashModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() throws SQLException {
        this.getView().displayMessage(this.getModel().getMapById(1).toString());

        this.getView().displayMessage(this.getModel().getMapByName("Example 2").toString());

        final List<Example> examples = this.getModel().getAllExamples();
        final StringBuilder message = new StringBuilder();
        // a.append(" bar);
        for (final Example example : examples) {
            message.append(example);
            message.append('\n');
        }
        this.getView().displayMessage(message.toString());
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IBoulderdashView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IBoulderdashModel getModel() {
        return this.model;
    }

	@Override
	public void play() throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IOrderPerformer getOrderPerformer() {
		// TODO Auto-generated method stub
		return null;
	}
}
