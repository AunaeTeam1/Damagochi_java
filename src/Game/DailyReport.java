package Game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

class ReportData {
	// all static.
	static String text = "";
}

public class DailyReport extends BasicGameState {

	public void init(GameContainer c, StateBasedGame s) throws SlickException {
	}
	
	public void render(GameContainer c, StateBasedGame s, Graphics g) throws SlickException {
		// page background
		
		// text wrapping
		// text typing spd:3
	}

	public void update(GameContainer c, StateBasedGame s, int d) throws SlickException {
		// txt disp done
		// back to game state
	}
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 4;
	}

	
}
