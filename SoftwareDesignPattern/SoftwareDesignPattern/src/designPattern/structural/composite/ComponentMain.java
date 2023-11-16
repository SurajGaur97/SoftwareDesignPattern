package designPattern.structural.composite;

public class ComponentMain {
	
	public static void main(String[] args) {
		/**
		 * Component can have two things leaf and composite. Both of the two things can have same properties.
		 * Therefore in this scenario the Composite pattern came into picture.
		 * 					
		 * 					  [Computer]
		 * 					/		 	 \
		 * 				  [PH]    		[Cabinet]
		 * 				  /  \	   	  	/	    \
		 * 			[Mouse] [Monitor] [HD]  	[MB]
		 * 									   /    \
		 * 									[CPU]   [RAM]
		 * 									
		 */
		Component hd = new Leaf("HDD", 4000);
		Component mouse = new Leaf("Mouse", 400);
		Component monitor = new Leaf("Monitor", 8000);
		Component ram = new Leaf("RAM", 2000);
		Component cpu = new Leaf("CPU", 5000);
		
		Composit ph = new Composit("Peri");
		Composit cabinet = new Composit("Cabinet");
		Composit mb = new Composit("MB");
		Composit computer = new Composit("Computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		ram.showPrice();
		System.out.println("-------------------------");
		ph.showPrice();
		System.out.println("-------------------------");
		computer.showPrice();
		
	}
}
