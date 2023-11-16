package designPattern.creational.factory;

import designPattern.creational.factory.os.AndroidOS;
import designPattern.creational.factory.os.IOS;
import designPattern.creational.factory.os.OS;
import designPattern.creational.factory.os.WindowsOS;

public class GetOSMain {
	public static void main(String[] args) {
		//Now for creating a new OS we need to create new instance each time when we want different type of OS.
		OS objAndr = new AndroidOS();
		objAndr.specs();
		OS objIos = new IOS();
		objIos.specs();
		OS objWind = new WindowsOS();
		objWind.specs();
		
		System.out.println("--------------------------------------------");
		/**
		 * Now each time we need to change the code like above if we want to add new OS. 
		 * To overcome this problem factory pattern came in picture.
		 * What we do we create a class(OSFactory) and we need to define a method which returns different-2 
		 * objects from there, as below: 
		 */
		OSFactory osf = new OSFactory();
		OS obj = osf.getInstance("OpenSource");	//we need to pass only: "OpenSource", "ClosedSource", "anything", and we will get respective instance.
		
		obj.specs();
	}
}
