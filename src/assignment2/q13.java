package assignment2;

public class q13 {
	
		public static void main(String args[]){
			int [] arrayList={11,22,33,44,55,66,77,88,99,111};
			int total=0;
			int sum=0;
			for(int i=0;i<arrayList.length;i++ ){
				total=total + arrayList[i];
				}
				System.out.println("-------------- Average -------------");
				int avar = total/arrayList.length;
				System.out.println("Average : "+ avar);
			for(int i=0;i<arrayList.length;i++){
		
				
				int subtract = avar-arrayList[i];
				int squ = subtract*subtract;
				System.out.println("subtract  "+ "Avarege "+avar+" Value "+arrayList[i]+" = " + subtract);
				System.out.println("square  :"+ squ);
				
				
			 
			
			
			sum = subtract + squ;
			System.out.println("Sum  :"+ sum);
			}
		}
		}

