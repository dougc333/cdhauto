package com.dssd.impalaperf;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class MakeData {
	private static final int numRowsPerMonth_ = 10000;
	private static final int numRowsPerDay_ = 1000;
	
	public static void main(String []args){
	try{
		BufferedWriter bw = new BufferedWriter(new FileWriter("/testdir/testdata100chars.csv"));
		int numRows=0;
		for(int year=1900;year<1901;year++){
		  for(int month=1;month<=12;month++){
			for(int j=0;j<numRowsPerMonth_;j++){
				for(int day=1; day<31; day++){
				  for(int k=0;k<numRowsPerDay_;k++){
					 bw.write(numRows+","+getChars(10,10)+getAge()+","+getDate(year,month,day));
					 bw.newLine();
					 numRows++;
				   }
				}
			}
		  }
	    }
	
		bw.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	
	private static char getRandomChar(){
		Random rand=new Random();
		char test = (char) (65+rand.nextInt(25));
		return test;
	}
	
	/*x =1, y=1, generate 1 char row
	 *x=10, y=10, 100char; 10 10 char rows
	 * 
	 */
	private static String getChars(int numCols, int numCharsColumn){
		Random rand=new Random();
		StringBuilder sb = new StringBuilder();
		for(int j=0;j<numCols;j++){
			for(int i=0;i<numCharsColumn;i++){
				char test = (char) (65+rand.nextInt(25));
				sb.append(test);
			}
			sb.append(",");
		}
		return sb.toString();
	}
	
	
	private static int getAge(){
		Random rand = new Random();
		return (int)(0+rand.nextInt(100));
		
	}
	private static String getDate(int year,int month,int day){
		return (year+"-"+month+"-"+day);
	}
}
