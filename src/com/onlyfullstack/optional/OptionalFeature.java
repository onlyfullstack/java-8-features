package com.onlyfullstack.optional;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.PriorityQueue;

import com.onlyfullstack.bean.GraphicsCard;
import com.onlyfullstack.bean.GraphicsMemory;
import com.onlyfullstack.bean.SmartPhone;

public class OptionalFeature {

	public static void main(String[] args) {
		getGraphicsCardSize(createSmartPhoneWithGraphicsCard());
		getGraphicsCardSize(createSmartPhoneWithoutGraphicsCard());
		getGraphicsCardSize(createSmartPhoneWithEmptyGraphicsCard());
	}

	private static void getGraphicsCardSize(SmartPhone smartPhone) {
		List a = new ArrayList<>();
		a.stream();
		String size = smartPhone.getGraphicsCard() 
							 .map(GraphicsCard::getGraphicsMemory) // map returns the Optional of type passed as a parameter (here its string)
							 .map(GraphicsMemory::getDedicatedMemory)
							 .orElse("unkonwn");
		System.out.println("Size : " + size + ", for Object : "+smartPhone.toString());
	}
	
	private static void ofVsOfNullable() {
		Optional<GraphicsCard> graphicsCard = Optional.of(new GraphicsCard());
		if(graphicsCard.isPresent()) {
			System.out.println(graphicsCard.get());
		}
		
		graphicsCard.ifPresent(System.out::println);
		GraphicsCard newCard = graphicsCard.get();
	}

	private static SmartPhone createSmartPhoneWithGraphicsCard() {
		SmartPhone smartPhone = new SmartPhone();
		Optional<GraphicsCard> card = Optional.ofNullable(new GraphicsCard("4 gb"));
		smartPhone.setGraphicsCard(card);
		return smartPhone;
	}
	
	private static SmartPhone createSmartPhoneWithoutGraphicsCard() {
		SmartPhone smartPhone = new SmartPhone();
		Optional<GraphicsCard> card = Optional.ofNullable(null);
		smartPhone.setGraphicsCard(card);
		return smartPhone;
	}
	
	private static SmartPhone createSmartPhoneWithEmptyGraphicsCard() {
		SmartPhone smartPhone = new SmartPhone();
		Optional<GraphicsCard> card = Optional.ofNullable(new GraphicsCard());
		smartPhone.setGraphicsCard(card);
		return smartPhone;
	}
	
	private static void traditionalApproach(SmartPhone smartPhone) {
		String size = "unknown";
		if(smartPhone.getGraphicsCard()!=null) {
			GraphicsCard graphicsCard = smartPhone.getGraphicsCard().get();
			if(graphicsCard != null) {
				GraphicsMemory graphicsMemory = graphicsCard.getGraphicsMemory();
				if(graphicsMemory != null && graphicsMemory.getDedicatedMemory() != null) {
					size = graphicsMemory.getDedicatedMemory();
				}
			}
		}
		System.out.println("Size : " + size + ", for Object : "+smartPhone.toString());
	}
}