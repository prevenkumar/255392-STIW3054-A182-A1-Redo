package com.assignment1;

//calculate Total Technical Factor

public class W_Technical_Factor extends App {
	
	private int [] TFactor = new int[13];
	private double [] wf = {2,1,1,1,1,0.5,0.5,2,1,1,1,1,1};
	private double TotalTFactor=0;
	
	public W_Technical_Factor(int tf1,int tf2,int tf3,int tf4,int tf5,int tf6,int tf7,int tf8,int tf9,int tf10,int tf11,int tf12,int tf13) {
		TFactor[0] = tf1;
		TFactor[1] = tf2;
		TFactor[2] = tf3;
		TFactor[3] = tf4;
		TFactor[4] = tf5;
		TFactor[5] = tf6;
		TFactor[6] = tf7;
		TFactor[7] = tf8;
		TFactor[8] = tf9;
		TFactor[9] = tf10;
		TFactor[10] = tf11;
		TFactor[11] = tf12;
		TFactor[12] = tf13;	
	}
public double getTechnicalFactor() {
	for(int i=0; i<13; i++) {
		TotalTFactor = TotalTFactor+(TFactor[i]*wf[i]);	
		
	}
	return TotalTFactor;
}

}
