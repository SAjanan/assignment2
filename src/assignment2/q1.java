package assignment2;

public class q1 {
public static void main(String args[]) {
	
	int x=12345;
	int y=1, r=0;
	
	while(y!=0) {
		y=x/10;
	r=x%10;
	x=y;
	System.out.print(r);
}
 System.out.println();

}
}
