package com.onlyfullstack.bean;

import java.util.Optional;

public class SmartPhone {
	
	private Optional<GraphicsCard> graphicsCard;
	
	public Optional<GraphicsCard> getGraphicsCard() {
		return graphicsCard;
	}
	public void setGraphicsCard(Optional<GraphicsCard> graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
	@Override
	public String toString() {
		return "SmartPhone [graphicsCard=" + graphicsCard
				+ "]";
	}
	
	
}
