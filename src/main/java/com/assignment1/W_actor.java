package com.assignment1;

//calculate Total Actor Points

public class W_actor extends App{
	
	private int [] a = new int [3];
	private int total_ap;
		
	public W_actor(int simple, int avg, int cmplx) {
		// TODO Auto-generated constructor stub
		a[0] = simple;
		a[1] = avg;
		a[2] = cmplx;
	}

	public int getTotalActorPoint() {
		total_ap = 1*a[0] + 2*a[1] + 3*a[2];
		return total_ap;
	}

}
