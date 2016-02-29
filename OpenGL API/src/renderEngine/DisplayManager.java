package renderEngine;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

public class DisplayManager {

	private static final int WIDTH = 1280, HEIGHT = 720, FPS = 120;
	
	public static void Initialize()
	{
		ContextAttribs attribs = new ContextAttribs(3,2);
		attribs.withForwardCompatible(true);
		attribs.withProfileCore(true);
		
		try{
		Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
		Display.create(new PixelFormat(), attribs);
		Display.setTitle("Damnnnnn Daniel, BACK AT IT WITH THE WHITE VANS!!");
		}
		catch (LWJGLException e)
		{
			e.printStackTrace();
		}
		
		GL11.glViewport(0, 0, WIDTH, HEIGHT);
	}
	
	public static void Update()
	{
		Display.sync(FPS);
		Display.update();
	}
	
	public static void ShutDown()
	{
		Display.destroy();
	}
}