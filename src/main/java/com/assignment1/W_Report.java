package com.assignment1;

//calculate Total Report Man-hour Estimate

public class W_Report extends App {
	
	private int [] c = new int [3];
	private int total_r;
	
		
	public W_Report(int simple, int avg, int cmplx) {
		// TODO Auto-generated constructor stub
		c[0] = simple;
		c[1] = avg;
		c[2] = cmplx;
	}
	public int getTotalReport() {
		// TODO Auto-generated method stub
		total_r = 12*c[0] + 20*c[1] + 40*c[2];
		return total_r;
	}
}


