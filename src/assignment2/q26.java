package assignment2;
import java.util.Scanner;

public class q26 {

	
    
	    int month;
	    q26(String date){
	        String[] da = date.split("/");
	        this.month = Integer.parseInt(da[1]);
	    }

	    int calDays(){
	        if(1<=month && month <=3) return 10;
	        else if(4<=month && month <=6) return 7;
	        else if(7<=month && month <=9) return 3;
	        else return 0;
	    }

	}

	class myq26{
	    
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Your Joining Date (yyyy/mm/dd)");
	        q26 lev = new q26(sc.next());

	        int days = lev.calDays();
	        System.out.println("you can take "+days+" Dayes Leave" );
	        sc.close();
	    }
	}
