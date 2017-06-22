package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.BoulderdashController;
import controller.IBoulderdashController;
import model.BoulderdashModel;
import model.IBoulderdashModel;
import model.IMap;
import model.IMobile;
import model.dao.DataDAO;
import view.BoulderdashView;
import view.IBoulderdashView;

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
    private static final int startX = 5;

    /** The Constant startY. */
    private static final int startY = 0;

	private static IMap map;



	public static void main(final String[] args) throws IOException, InterruptedException, SQLException {

        final IBoulderdashModel model = new BoulderdashModel(1, 1, map);
        final IBoulderdashView view = new BoulderdashView(model.getMap(), (IMobile) model.getMyHero());
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
      