package renderEngine;

public class Obj {
	private int vaoID;
	private int vertexCount;
	
	public Obj(int vaoID, int vertexCount)
	{
		this.setVaoID(vaoID);
		this.setVertexCount(vertexCount);
	}

	public int getVertexCount() {
		return vertexCount;
	}

	public void setVertexCount(int vertexCount) {
		this.vertexCount = vertexCount;
	}

	public int getVaoID() {
		return vaoID;
	}

	public void setVaoID(int vaoID) {
		this.vaoID = vaoID;
	}
}
