package assignment2;

public class q14 {
	
		public static void main(String [] args){
		double b=4;
		double a=8;
		double c=12;
		double quaE= b*b-(4*a*c);
		if(quaE>0){
			System.out.println("Roots are real and different");
			}else if(quaE<0){
				System.out.println("Roots are complex and different");
			}else{
				System.out.println(" roots are real and equal");
				}
		}
		

}
