package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.BoulderdashController;
import controller.IBoulderdashController;
import model.BoulderdashModel;
import model.IBoulderdashModel;
import model.element.mobile.Mobile;
import view.BoulderdashView;

//import model.dao.DataDAO;

import Interface.IBoulderdashView;
import Interface.IOrderPerformer;


public class Main {


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

	


	public static void main(final String[] args) throws IOException, InterruptedException, SQLException {

        final IBoulderdashModel model = new BoulderdashModel("C:/Users/pierr/git/Projet-Java/BoulderDash/model/src/main/java/model/map2.txt", 2, 2);
        final IBoulderdashView view = new BoulderdashView(model.getMap(), (Mobile) model.getMyHero());
        final IBoulderdashController controller = new BoulderdashController((view.IBoulderdashView) view, model);
      view.setOrderPerformer((IOrderPerformer) controller.getOrderPerformer());
      controller.play();
	}
		
	

        	
//       view.setOrderPerformer(controller.getOrderPerformer());
//       
//       view.setOrderPerformer(controller.getOrderPeformer());
//       controller.play();
//     
        	
	}
      