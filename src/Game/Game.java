package Game;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.lang.Math;

public class Game extends BasicGameState {

	private Image dama;	
	
	public void init(GameContainer c, StateBasedGame s) throws SlickException {
		dama = new Image("contents/dama.png");
	}
	
	public void render(GameContainer c, StateBasedGame s, Graphics g) throws SlickException {

		// TODO Damagochi's facial 
		// SICK > HUNGER > THIRST > BORED > HAPPY > SHITWHAT?
		
		// DAMAGOCHI DRAW PART
		dama.draw(GameScreen.w/2 - dama.getWidth()/2, GameScreen.h/2 - dama.getHeight()/2, 147, 217 - (int) Math.abs(Math.sin(GameScreen.time*.002)*20) );
		
		// OBJECT DRAW PART
		
		// PARTICLE DRAW PART
		
		// MENU DRAW PART
		
		// DEBUG STAT PART
		g.drawString("Hungry: " + Damagochi.hunger, 50, 50);
		g.drawString("Boredom: " + Damagochi.boredom, 50, 80);
		g.drawString("Thirst: " + Damagochi.thirst, 50, 110);
		g.drawString("Health: " + Damagochi.health, 50, 140);
		g.drawString("Evolve Level: " + Damagochi.ev_level, 50, 170);
		g.drawString("Evolve Stat: " + Damagochi.ev_exp, 50, 200);
		
	}
	
	private int dmgStack = 0;
	
	public void update(GameContainer c, StateBasedGame s, int d) throws SlickException {
		GameScreen.time += d;
		Damagochi.damaThink(c, s, d);
		// add event stack? i guess?
		if (Damagochi.festival_time < GameScreen.time)
		{
			// heuhuehueu
		}
		// TODO if damagochi is dead, go to gameover and calc the score.
		// TODO if festival has come, go to festival and calc the middle score and give the prize.
		
		// TODO if one day has passed, reset screen time to 0.
		// TODO and shift the phase to Daily Report.
	}
	
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 1;
	}
	
}
