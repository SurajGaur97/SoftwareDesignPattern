package designPattern.structural.adapter;

public class SchoolMain {
	public static void main(String[] args) {
		/**
		 * Let say in a school we have a lot of assignment to complete, we need a type of pen like gel pen or 
		 * dot pen and then we are able write the assignments.
		 * 
		 * Let say we need to create a pen and need a method for writing assignment then we need to create a 
		 * interface with a method write() but we don't want to implement this interface and write implementation 
		 * for the write() method.
		 * So let there is a friend name Krishna who have some method for writing the assignment and he does 
		 * not want to show his written code, therefore he provided only the '.class' file so that I can not see
		 * his written code. Then in this scenario what we need is to use our Pen interface and use Krishna's 
		 * method without writing our own code for write() method by using 'Adapter Pattern'(PenAdapter).
		 */
		
//		GelPen gp = new GelPen();	//Not going to use this pen directly provided by my friend Krishna.
		Pen p = new PenAdapter();
		
		AssignmentWork aw = new AssignmentWork();
		aw.setPen(p);
		aw.writeAssignment("I'm a bit tired to write an Assignment");
	}
}
