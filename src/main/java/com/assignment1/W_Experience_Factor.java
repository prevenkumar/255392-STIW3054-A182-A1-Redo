package com.assignment1;

//calculate Total Experience Factor

public class W_Experience_Factor extends App {
	
	private int [] exf = new int[13];
	private double [] wf = {1,0.5,1,0.5,0,2,-1,-1};
	private double t_Efactor=0;
	private double t_EF=0;
	
	public W_Experience_Factor(int ef1,int ef2,int ef3,int ef4,int ef5,int ef6,int ef7,int ef8) {
		
		exf[0] = ef1;
		exf[1] = ef2;
		exf[2] = ef3;
		exf[3] = ef4;
		exf[4] = ef5;
		exf[5] = ef6;
		exf[6] = ef7;
		exf[7] = ef8;
		
	}
	public W_Experience_Factor(int t_Efactor) {
		this.t_Efactor=t_Efactor;
	}
	//Calculate Total EFactor
	public double getEfactor() {
		for(int i = 0; i<8; i++) {
			t_Efactor=t_Efactor+(exf[i]*wf[i]);
		}
		return t_Efactor;	
	}
	//Calculate Experience Factor(EF)
	public double getExpfactor() {
		t_EF= (-0.03*t_Efactor)+1.4;
		return t_EF;
	}
	public void setExpFactor(double t_Efactor) {
		this.t_Efactor=t_Efactor;
	}	
}

