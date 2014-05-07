package Game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.lang.Math;

public class Menu extends BasicGameState {

	private Image background;
	private Image title;
	private Image space;

	public void init(GameContainer c, StateBasedGame s) throws SlickException {
		background = new Image("contents/background.png");
		title = new Image("contents/title.png");
		space = new Image("contents/space.png");
	}
	
	public void render(GameContainer c, StateBasedGame s, Graphics g) throws SlickException {
		background.draw(0, 0, 980, 600);
		
		title.draw(GameScreen.w/2 - title.getWidth()/2,GameScreen.h/4 - title.getHeight()/2 + (int) (Math.sin(GameScreen.time*.001)*20));
		
		space.draw(GameScreen.w/2 - space.getWidth()/2,GameScreen.h/4*3 - space.getHeight()/2);
	}

	public void update(GameContainer c, StateBasedGame s, int d) throws SlickException {
		GameScreen.time += d;
		
		if (c.getInput().isKeyPressed(Input.KEY_SPACE)){
			s.enterState(1);
		}
	}
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
