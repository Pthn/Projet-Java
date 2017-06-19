public class BoulderdashView
{
	private static int squareSize = 50;
	public static int mapView = 10;
	private Rectangle closeView;
	private int view;
	private IMap map;
	private IMobile myHero;
	private IOrderPerformer orderPerformer;
	private IMobile enemy;
	
	
	
	
		public BoulderdashView(IMap map, IMoblie myHero);
		public void displayMessage(String message);
		public void run();
		public void show(int yStart);
		public static UserOrder keyCodeToUserOrder(int keyCode);
		public void keyTyped(KeyEvent keyEvent);
		public void keyPressed(KeyEvent keyEvent);
		public void keyReleased(KeyEvent keyEvent);
		public void followMyHero();
		
			public IMap getMap()
			{
				return map;
			}
			public void setMap(IMap map)
			{
				this.map = map;
			}
		
			public IMobile getMyHero()
			{
				return myHero;
			}
			public void setMyHero(IMobile myHero)
			{
				this.myHero = myHero;
			}
			
			public int getView()
			{
				return view;
			}
			public void setView(int view)
			{
				this.view = view;
			}

			public Rectangle getCloseView()
			{
				return closeView;
			}
			public void setCloseView(Rectangle closeView)
			{
				this.closeView = closeView;
			}
			
			public IOrderPerformer getOrderPerformer()
			{
				return orderPerformer;
			}
			public void setOrderPerformer(IOrderPerformer orderPerformer)
			{
				this.orderPerformer = orderPerformer;
			}
			
			public IMobile getEnemy()
			{
				return enemy;
			}
			public void setEnemy(IMobile enemy)
			{
				this.enemy = enemy;
			}
		
			
}
