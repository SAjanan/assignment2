package assignment2;

public class q15 {
	
		public static void main(String [] args){
			double p=10000;
			double  r=0.20;
			double n=1;

			double ComInte = p * (Math.pow((1 + r), n));
					p=ComInte;
			System.out.println("Compound Interest is :"+ ComInte);
			n++;
			 ComInte = p * (Math.pow((1 + r), n));
			 System.out.println("Compound Interest is :"+ ComInte);
			}
			}