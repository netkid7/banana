package com.brighten.banana.todo.car;

public interface Drive {
	public int MAX_SPEED = 280;
	public int MIN_SPEED = 0;
	
	public int MAX_DEGREE = 60;
	
	public void start();
	public void stop();
	public void speedUp(int speed);
	public void speedDown(int speed);
	
	public void turnLeft(int degree);
	public void turnRight(int degree);
	
	public void lightOn();
	public void lightOff();
	
	public void fuel();
}
