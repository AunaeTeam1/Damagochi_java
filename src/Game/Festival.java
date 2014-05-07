package Game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Festival extends BasicGameState {

	public void init(GameContainer c, StateBasedGame s) throws SlickException {
	}
	
	public void render(GameContainer c, StateBasedGame s, Graphics g) throws SlickException {
		// TODO Festival Stage.
	}

	public void update(GameContainer c, StateBasedGame s, int d) throws SlickException {
		// TODO Festival Calculation
		// Generate Damas [Dama's name] [Owner's name] [Score]
		// They're generated and they will be used as the standard of the 'festival'.
		
		// 1. Show off other damagochis
		// "Hello, Welcome to World Dama Centre, WDC!"
		// "We're here to see some fine damagochis around the world, let's see how you take care of your damagochi!"
		// -Swap the scene.
		
		// 2. rank your dama, see how you took care of it and reward.
		// "Your Damagochi's rating is...!"
		// "***th!"
		
		// "<Different cheer quotes>"
		// "Your dama is getting better and better!
		// "Let's see your owner score changes!"
		// "<Different owner cheers>"
		// "Now you'll get some rewards!
		
		// 3. give you some money.
		// "Today's contest is over! Let's see you again in the next contest!"
		
		// Stage will be changed when dama has higher level/score.
		// When you reach top dama, game will count whatever.
	}
	
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return -1;
	}

	
}
