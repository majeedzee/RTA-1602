package Shaders;

public class StaticShader extends ShaderProgram {

	private static final String VERTEX_FILE = "bin/Shaders/vertexShader.txt";
	private static final String FRAGMENT_FILE = "bin/Shaders/fragmentShader.txt";
	
			
	public StaticShader() {
		super(VERTEX_FILE, FRAGMENT_FILE);
	}

	protected void bindAttributes()
	{
		super.bindAttribute(0, "position");
	}
	
}
