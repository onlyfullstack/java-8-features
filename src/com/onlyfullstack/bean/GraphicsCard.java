package com.onlyfullstack.bean;

public class GraphicsCard {

	private String size;
	private GraphicsMemory graphicsMemory;

	public GraphicsCard(String size) {
		this.size = size;
	}

	public GraphicsMemory getGraphicsMemory() {
		return graphicsMemory;
	}

	public void setGraphicsMemory(GraphicsMemory graphicsMemory) {
		this.graphicsMemory = graphicsMemory;
	}

	public GraphicsCard() {
		super();
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "GraphicsCard [size=" + size + "]";
	}

}
