package designPattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composit implements Component{
	
	String name;
	List<Component> components = new ArrayList<>();
	
	public Composit(String name) {
		super();
		this.name = name;
	}

	public void addComponent(Component com) {
		components.add(com);
	}

	@Override
	public void showPrice() {
		System.out.println(name);
		for(Component com: components) {
			com.showPrice();
		}
	}

}
