package unitTest;

import org.lwjgl.opengl.Display;

import Shaders.StaticShader;
import renderEngine.DisplayManager;
import renderEngine.Obj;
import renderEngine.ObjLoader;
import renderEngine.Renderer;

public class Main {

	public static void main(String[] args) {
		
		DisplayManager.Initialize();
		
		ObjLoader loader = new ObjLoader();
		Renderer renderer = new Renderer();
		StaticShader shader = new StaticShader();
		
		float[] verticies = 
			{
					-0.5f, 0.5f, 0f,
					-0.5f, -0.5f, 0f,
					0.5f, -0.5f, 0f,
					0.5f, 0.5f, 0f,
			};
		int[] indicies = 
			{
					0,1,3,
					3,1,2
			};
		
		Obj model = loader.loadToVAO(verticies, indicies);
		
		while(!Display.isCloseRequested()){
			renderer.Initialize();
			shader.start();
			renderer.Render(model);
			shader.stop();
			DisplayManager.Update();
		}
		
		shader.cleanUp();
		loader.cleanUp();
		DisplayManager.ShutDown();
	}

}