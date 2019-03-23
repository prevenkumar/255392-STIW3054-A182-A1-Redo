package com.assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

//Software Effort Estimation Calculator

public class App {
	
	public static void main(String[] args) {
		calculate();
	}
	public static void calculate() {
		
		Scanner input = new Scanner(System.in);
		int [] a = new int[3];
		int [] b = new int[3];
		int [] c = new int[3];
		int uucp;
		int [] TFactor = new int[13];	
		double tcf,szuc,ef1,ucp,man_hours;
		int [] exf = new int[8];
		int i, count = 0;
		int effort_rate=0;
		double amh,tamh;
		
		
		try {
			 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			 System.out.println("                       Software Effort Estimation Calculator                ");
			 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		            System.out.println();
					 //calculate weighting Actors for complexity
					System.out.println("_______________________________________________________________________________");
					System.out.println("-------------------------Weighting Actors for Complexity-----------------------");
					System.out.println("_______________________________________________________________________________");
			            System.out.print("Simple        :  Defined API                                     : 1       : ");
			                a[0] = input.nextInt();
			            System.out.print("Average       :  Interactive or Protocol driven interface        : 2       : ");
			                a[1] = input.nextInt();
			            System.out.print("Complex       :  Graphical User Interface                        : 3       : ");
			                a[2] = input.nextInt();
			                System.out.println();
			                W_actor actor = new W_actor(a[0], a[1], a[2]);         
			            System.out.println("________________________________________________________________________________");
			            System.out.println("Total Actor Points             :" +actor.getTotalActorPoint());
			            System.out.println("________________________________________________________________________________");
			            System.out.println("");
		            System.out.println();
		            
		            //calculate weighting use cases for complexity
					System.out.println("________________________________________________________________________________");
					System.out.println("-----------------------Weighting Use Cases for Complexity----------------------");
					System.out.println("________________________________________________________________________________");
			            System.out.print("Simple        :  3 or fewer transactions                      : 5        : ");
			            b[0] = input.nextInt();
			            System.out.print("Average       :  4 to 7 transactions                          : 10       : ");
			            b[1] = input.nextInt();
			            System.out.print("Complex       :  Greater than 7 transactions                  : 15       : ");
			            b[2] = input.nextInt();
			            System.out.println();
			            W_UseCases uc = new W_UseCases(b[0], b[1], b[2]);
			            System.out.println("________________________________________________________________________________");
			            System.out.println("Total Use Cases             :" +uc.getTotalUseCases());
			            System.out.println("________________________________________________________________________________");
			            uucp = actor.getTotalActorPoint() + uc.getTotalUseCases();
			            System.out.println("________________________________________________________________________________");
			            System.out.println("Unadjusted Use Case Points  :" + uucp);
			            System.out.println("________________________________________________________________________________");
			            System.out.println();
			            
			          //calculate Weighting Technical Factors
			            System.out.println("_______________________________________________________________________________");
						System.out.println("-------------------------Weighting Technical Factors-----------------------");
						System.out.println("_______________________________________________________________________________");
						System.out.println("Rate each factor from 0 to 5. [ 0 means irrelevant 5 means essential ]");
						System.out.println("");
				            System.out.print("T1       : Must have a distributed solution                     : 2       : ");
				            TFactor[0] = input.nextInt();
				            System.out.print("T2       : Must responds to specific performance objectives     : 1       : ");
				            TFactor[1] = input.nextInt();
				            System.out.print("T3       :  Must meet end-user specific efficiency desires      : 1       : ");
				            TFactor[2] = input.nextInt();
				            System.out.print("T4       :  Complex internal processing                         : 1       : ");
				            TFactor[3] = input.nextInt();
				            System.out.print("T5       :  Code must be reusable                               : 1       : ");
				            TFactor[4] = input.nextInt();
				            System.out.print("T6       :  Must be easy to install                             : 0.5     : ");
				            TFactor[5] = input.nextInt();
				            System.out.print("T7       :  Must be easy to use                                 : 0.5     : ");
				            TFactor[6] = input.nextInt();
				            System.out.print("T8       :  Must be portable                                    : 2       : ");
				            TFactor[7] = input.nextInt();
				            System.out.print("T9       :  Must be easy to change                              : 1       : ");
				            TFactor[8] = input.nextInt();
				            System.out.print("T10      : Must allow concurrent users                          : 1       : ");
				            TFactor[9] = input.nextInt();
				            System.out.print("T11      : Includes special security features                   : 1       : ");
				            TFactor[10] = input.nextInt();
				            System.out.print("T12      : Provide direct access for third parties users        : 1       : ");
				            TFactor[11] = input.nextInt();
				            System.out.print("T13      : Requires special user training facilities            : 1       : ");
				            TFactor[12] = input.nextInt();
				            System.out.println();
				            W_Technical_Factor tf = new W_Technical_Factor(TFactor[0], TFactor[1], TFactor[2], TFactor[3], TFactor[4], TFactor[5], TFactor[6], TFactor[7],TFactor[8], TFactor[9], TFactor[10], TFactor[11], TFactor[12]);
				            double tFactor = tf.getTechnicalFactor(); 
				            System.out.println("________________________________________________________________________________");
				            System.out.println("Total TFactor               :" +tFactor);
				            System.out.println("________________________________________________________________________________");
				            tcf = (0.01*tFactor)+0.6;
				            System.out.println("Technical Complexity Factor :" +tcf);
				            System.out.println("________________________________________________________________________________");
				            szuc = uucp*tcf;
				            System.out.println("Size of Software(use case)  :" +szuc);
				            System.out.println("________________________________________________________________________________");
				            System.out.println("");
				            
				          //calculate Weighting Experience Factors
				            System.out.println("_______________________________________________________________________________");
							System.out.println("-------------------------Weighting Experience Factors-----------------------");
							System.out.println("_______________________________________________________________________________");
							System.out.println("Rate each factor from 0 to 5. [ 0 means no experience, 3 means average, 5 means expert ]");
							System.out.println("");
					            System.out.print("E1       : Familiar with FPT software process                  : 1       : ");
					            exf[0] = input.nextInt();
					            System.out.print("E2       : Application experience                              : 0.5     : ");
					            exf[1] = input.nextInt();
					            System.out.print("E3       : Paradigm experience (OO)                            : 1       : ");
					            exf[2] = input.nextInt();
					            System.out.print("E4       : Lead analyst capability                             : 0.5     : ");
					            exf[3] = input.nextInt();
					            System.out.print("E5       : Motivation                                          : 0       : ");
					            exf[4] = input.nextInt();
					            System.out.print("E6       : Stable Requirements                                 : 2       : ");
					            exf[5] = input.nextInt();
					            System.out.print("E7       : Part-time workers                                   : -1      : ");
					            exf[6] = input.nextInt();
					            System.out.print("E8       : Difficulty of programming language                  : -1      : ");
					            exf[7] = input.nextInt();
					            System.out.println("");
					            for(i = 0; i < 6; i++){
					                if(exf[i] < 3)
					                    count++;
					            } //number of factor rating E1-E6

					            for(i = 6; i < 8; i++){
					                if(exf[i] > 3)
					                    count++;
					            } //number of factor rating E7-E8

					            if(count >= 0 && count <= 2)
					                effort_rate = 20;

					            else if(count >=3 && count <=4)
					                effort_rate = 28;

					            else{
					                System.out.println( "Project is at significant risk of failure with this team. So, Please choose the correct man-hours");
					                System.exit(0);
					            }
					            
					            W_Experience_Factor e = new W_Experience_Factor(exf[0],exf[1],exf[2],exf[3],exf[4],exf[5],exf[6],exf[7]);
					            double eFactor = e.getEfactor();
					            System.out.println("________________________________________________________________________________");
					            System.out.println("Total EFactor               :" +eFactor);
					            System.out.println("________________________________________________________________________________");
					            ef1 = (-0.03*eFactor)+1.4;
					            System.out.println("Experience Factor(EF)       :" +ef1);
					            System.out.println("________________________________________________________________________________");
					            ucp = szuc*ef1;
					            System.out.println("Use Case Points(UCP)        :" +ucp);
					            System.out.println("________________________________________________________________________________");
					            System.out.println("");
					            
					            //calculating Man-hours from ucp
					            
					            System.out.println("_______________________________________________________________________________");
					            System.out.println("---------Calculating man-hours by multiplying UCP by the Effort rate---------- ");
								//System.out.println("_______________________________________________________________________________");
								man_hours = effort_rate * ucp;
					            System.out.println("________________________________________________________________________________");
					            System.out.println("Total man-hours        : "+man_hours);
					            System.out.println("________________________________________________________________________________");
					            System.out.println("");
					            System.out.println("_______________________________________________________________________________");
					            System.out.println("-----------------------Calculating adjusted man-hours--------------------------");
								System.out.println("_______________________________________________________________________________");
								System.out.print("Enter a coefficient as a percentage:");
				                double cof = input.nextDouble();
					            amh= (1.0+cof) * man_hours;
					            System.out.println("________________________________________________________________________________");
					            System.out.println("Total adjusted man-hours        : "+amh);
					            System.out.println("________________________________________________________________________________");
					            System.out.println();
					            
					            //calculate weighting reports for complexity
								System.out.println("________________________________________________________________________________");
								System.out.println("-----------------------Weighting Reports for Complexity----------------------");
								System.out.println("________________________________________________________________________________");
						            System.out.print("Simple        :        : 12        : ");
						            c[0] = input.nextInt();
						            System.out.print("Average       :        : 20        : ");
						            c[1] = input.nextInt();
						            System.out.print("Complex       :        : 40        : ");
						            c[2] = input.nextInt();
						            System.out.println();
						            W_Report r = new W_Report(c[0],c[1],c[2]);				            
						            System.out.println("________________________________________________________________________________");
						            System.out.println("Total Report Man-hour Estimate            :" + r.getTotalReport());
						            System.out.println("________________________________________________________________________________");
						            tamh = amh + r.getTotalReport();
						            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
						            System.out.println("Total Adjusted Man-hours Calculation For The Project            :" + tamh);
						            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

				            
		        }catch(InputMismatchException e){
		        	System.out.println("Invalid Input [only numbers allowed]");
		            calculate();
		        }
		    input.close();
		    } 
		} 
