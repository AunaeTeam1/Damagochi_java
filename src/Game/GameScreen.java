package Game;

public class GameScreen {
	public static int w = 800;
	public static int h = 600;
	public static int time = 0;
	public static int ctime = 0;
	public static void UpdateTime(int delta)
	{
		time += delta;
		ctime = time / 1000;
	}
}