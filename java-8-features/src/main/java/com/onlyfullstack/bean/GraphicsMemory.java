package com.onlyfullstack.bean;

public class GraphicsMemory {

	private String dedicatedMemory;
	private String memoryType;
	
	public GraphicsMemory(String dedicatedMemory, String memoryType) {
		super();
		this.dedicatedMemory = dedicatedMemory;
		this.memoryType = memoryType;
	}

	public String getDedicatedMemory() {
		return dedicatedMemory;
	}

	public void setDedicatedMemory(String dedicatedMemory) {
		this.dedicatedMemory = dedicatedMemory;
	}

	public String getMemoryType() {
		return memoryType;
	}

	public void setMemoryType(String memoryType) {
		this.memoryType = memoryType;
	}
}
