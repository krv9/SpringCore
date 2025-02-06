package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo")
public class Demo {

	@Value("#{12+23}")
	private int x;
	@Value("#{5>6}")
	private boolean y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public boolean getY() {
		return y;
	}
	public void setY(boolean y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
