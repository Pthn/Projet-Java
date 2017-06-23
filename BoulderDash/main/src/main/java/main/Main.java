package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.BoulderdashController;
import controller.IBoulderdashController;
import model.BoulderdashModel;
import model.IBoulderdashModel;
import model.IMap;
import model.IMobile;
//import model.dao.DataDAO;
import view.BoulderdashView;
import view.IBoulderdashView;

import model.element.mobile.Mobile;
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
    /** The Constant startX. */
    private static final int startX = 1;

    /** The Constant startY. */
    private static final int startY = 1;

	private static IMap map;
	


	public static void main(final String[] args) throws IOException, InterruptedException, SQLException {

        final IBoulderdashModel model = new BoulderdashModel("map1.txt", startX, startY);
        final IBoulderdashView view = new BoulderdashView(model.getMap(), (Mobile) model.getMyHero());
        final IBoulderdashController controller = new BoulderdashController(view,model);
      view.setOrderPerformer(controller.getOrderPerformer());
      controller.play();
	}
		
	

        	
//       view.setOrderPerformer(controller.getOrderPerformer());
//       
//       view.setOrderPerformer(controller.getOrderPeformer());
//       controller.play();
//     
        	
	}
      