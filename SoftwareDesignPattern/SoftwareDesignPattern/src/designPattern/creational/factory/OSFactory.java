package designPattern.creational.factory;

import designPattern.creational.factory.os.AndroidOS;
import designPattern.creational.factory.os.IOS;
import designPattern.creational.factory.os.OS;
import designPattern.creational.factory.os.WindowsOS;

public class OSFactory {
	public OS getInstance(String str) {

		if(str.equals("OpenSource")) 
			return new AndroidOS();
		else if(str.equals("ClosedSource")) 
			return new IOS();
		else 
			return new WindowsOS();
	}
}
