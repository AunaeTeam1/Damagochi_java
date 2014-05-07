package Game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.BasicGameState;

public class MainGame extends StateBasedGame {
	
	public MainGame(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws SlickException {
		AppGameContainer app = new AppGameContainer(new MainGame("Test Game"));
	
		Food.registerFoods(); // Declare foods.
		
		app.setDisplayMode(GameScreen.w, GameScreen.h, false);
		app.setAlwaysRender(true);
		app.start();
	}
	
	@Override
	public void initStatesList(GameContainer arg0) throws SlickException {
		this.addState(new Menu());
		this.addState(new Game());
		// this.addState(new Festival());
		 this.addState(new GameOver());
	}

}

/*
public class MainGame extends BasicGame {
	
	private Image background;
	private Image title;
	private double CurTime = 0;
	private double RawTime = 0;
	private double FrameTime = 0;
	
	public MainGame(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public void render(GameContainer c, Graphics g) throws SlickException {
		background.draw(0, 0, 980, 600);
		title.draw(GameScreen.w/2 - title.getWidth()/2,GameScreen.h/4 - title.getHeight()/2 + (int) (Math.sin(CurTime*2)*20));
	}
	
	public void init(GameContainer c) throws SlickException {
		background = new Image("contents/background.png");
		title = new Image("contents/title.png");
	}

	public void update(GameContainer c, int d) throws SlickException {
		FrameTime = (double) d;
		RawTime += (double) d;
		CurTime = RawTime/1000;
	}
	
	public static void main(String[] args) throws SlickException {
		AppGameContainer app = new AppGameContainer(new MainGame("Test Game"));
		
		app.setDisplayMode(GameScreen.w, GameScreen.h, false);
		app.start();
	}

}
*/