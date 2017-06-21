package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.BoulderdashController;
import model.BoulderdashModel;
import model.IBoulderdashModel;
import view.BoulderdashView;

public abstract class Main {


//    public static void main(final String[] args) {
//        final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());
//
//        try {
//            controller.start();
//        } catch (final SQLException exception) {
//            exception.printStackTrace();
//        }
//    }
    private static String map;

	public static void main(final String[] args) throws IOException, InterruptedException {
        final BoulderdashModel model = new BoulderdashModel(map, 0, 0, null, null);
        final BoulderdashView view = new BoulderdashView(model.getMap(), model.getMyHero());
        final IBouldedashController controller = new BoulderdashController(view, model);
        view.setOrderPerformer(controller.getOrderPeformer());
        try {
        	  controller.play();
        }
      
        catch (final SQLException exception) {
            exception.printStackTrace();
        }
}
