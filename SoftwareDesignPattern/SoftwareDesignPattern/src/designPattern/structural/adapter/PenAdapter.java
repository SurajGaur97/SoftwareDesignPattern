package designPattern.structural.adapter;

import designPattern.structural.adapter.krishna.GelPen;

public class PenAdapter implements Pen {

	GelPen gPen = new GelPen();
	
	@Override
	public void write(String str) {
		gPen.mark(str);
	}
	
}
