package main;

import java.io.IOException;
import java.sql.SQLException;

//import model.dao.DataDAO;

import view.IBoulderdashView;
import Interface.IOrderPerformer;
import controller.BoulderdashController;
import controller.IBoulderdashController;
import model.BoulderdashModel;
import model.IBoulderdashModel;
import model.element.mobile.Mobile;
import view.BoulderdashView;


public class Main {



	


	public static void main(final String[] args) throws IOException, InterruptedException, SQLException {

        final BoulderdashModel model = new BoulderdashModel("C:/map2.txt", 11, 3);
        final BoulderdashView view =  new BoulderdashView(model.getMap(), (Mobile) model.getMyHero(), (Mobile) model.getBlockRocherFall());
        final BoulderdashController controller = new BoulderdashController( view, model);
        view.setOrderPerformer((IOrderPerformer) controller.getOrderPerformer());
      controller.play();
	}
		
	


  
        	
	}
      