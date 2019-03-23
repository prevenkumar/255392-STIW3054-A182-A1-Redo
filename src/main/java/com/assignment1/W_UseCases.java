package com.assignment1;

//calculate Total Use Cases

public class W_UseCases extends App {
	
	private int [] b = new int [3];
	private int total_uc;
	
		
	public W_UseCases(int simple, int avg, int cmplx) {
		// TODO Auto-generated constructor stub
		b[0] = simple;
		b[1] = avg;
		b[2] = cmplx;
	}
	public int getTotalUseCases() {
		// TODO Auto-generated method stub
		total_uc = 5*b[0] + 10*b[1] + 15*b[2];
		return total_uc;
	}
}

