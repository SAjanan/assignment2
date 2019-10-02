package assignment2;

	import java.text.SimpleDateFormat;

	import java.util.Date;
	import java.time.Period;
	import java.time.LocalDate;
	import java.time.ZoneId;
public class q12{
		public static void main(String args[])throws Exception{
			String date1="17-04-1991";
			String date2="29-10-1997";

			int[] arr1= new int[3];
			int[] arr2= new int[3];
			int[] arr3= new int[3];

			StringBuilder sb=new StringBuilder();
			int m=0,k=0,x=0,y=0;

			for(int i=0; i<date1.length(); i++){
				if(date1.charAt(i)=='-' || i==date1.length()-1){
					for(int j=k; j<=i; j++){
						if(date1.charAt(j)!='-'){
							sb.append(date1.charAt(j));
						}
					}
					String str1 = sb.toString();
					int d1=Integer.parseInt(str1);
					int n=m;
					arr1[n]=d1;
					m++;
					sb.setLength(0);
					k=i+1;
				}
			}

			for(int i=0; i<date2.length(); i++){
				if(date2.charAt(i)=='-' || i==date2.length()-1){
					for(int j=y; j<=i; j++){
						if(date2.charAt(j)!='-'){
							sb.append(date2.charAt(j));
						}
					}
					String str1 = sb.toString();
					int d1=Integer.parseInt(str1);
					int n=x;
					arr2[n]=d1;
					x++;
					sb.setLength(0);
					y=i+1;
				}
			}

			if(arr1[2]>arr2[2]){
				arr3[2]=arr1[2]-arr2[2];
			}
			else{
				arr3[2]=arr2[2]-arr1[2];
			}

			if(arr1[2]>=arr2[2] && arr1[1]>arr2[1]){
				arr3[1]=arr1[1]-arr2[1];
			}
			else if(arr1[2]>arr2[2] && arr1[1]<arr2[1]){
				arr1[1]=arr1[1]+12;
				arr3[1]=arr1[1]-arr2[1];
				arr3[2]=arr3[2]-1;
			}
			else if(arr1[2]<arr2[2] && arr1[1]>arr2[1]){
				arr2[1]=arr2[1]+12;
				arr3[1]=arr2[1]-arr1[1];
				arr3[2]=arr3[2]-1;
			}
			else if(arr1[2]<=arr2[2] && arr1[1]<arr2[1]){
				arr3[1]=arr2[1]-arr1[1];
			}
			else{
				arr3[1]=arr2[1]-arr1[1];
			}


			if(arr1[2]>=arr2[2] && arr1[0]>arr2[0]){
				arr3[0]=arr1[1]-arr2[1];
			}
			else if(arr1[2]>arr2[2] && arr1[0]<arr2[0]){
				arr1[0]=arr1[0]+30;
				arr3[0]=arr1[0]-arr2[0];
				arr3[1]=arr3[1]-1;
			}
			else if(arr1[2]<arr2[2] && arr1[0]>arr2[0]){
				arr2[0]=arr2[0]+30;
				arr3[0]=arr2[0]-arr1[0];
				arr3[1]=arr3[1]-1;
			}
			else if(arr1[2]<=arr2[2] && arr1[0]<arr2[0]){
				arr3[0]=arr2[0]-arr1[0];
			}
			else{
				arr3[0]=arr2[0]-arr1[0];
			}

			System.out.println("The difference between dates is : "+arr3[2]+" Years ,"+arr3[1]+" Months ,"+arr3[0]+" Days.");


			String date3 = "17-04-1991";
			String date4 = "29-10-1997";
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
			Date StartDate = format.parse(date3);
			Date EndDate = format.parse(date4);
			LocalDate sd = StartDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			LocalDate ed = EndDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();


			Period p = Period.between(sd, ed);
			System.out.println("The difference between dates is : " + p.getYears() + " years, " + p.getMonths() +" months ," + p.getDays() +" days.");

		}
	}