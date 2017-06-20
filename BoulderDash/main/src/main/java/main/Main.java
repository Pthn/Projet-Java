package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import model.ModelFacade;
import view.ViewFacade;

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
    public static void main(final String[] args) throws IOException, InterruptedException {
        final IBoulderdashModel model = new BoulderdashModel(map, startX, startY);
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
