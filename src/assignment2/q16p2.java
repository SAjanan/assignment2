package assignment2;

public class q16p2 {
	
		public static int linearSearch(int[] arr, int key){
			int a=0;
		        for(int i=0;i<arr.length;i++){
		            if(arr[i] == key){
		                a=i;
		            }
		        }
		        return a;
		    }
		    public static void main(String args[]){
		    	
		    	
		    	System.out.println("-----part-2---------");
		        int[] a1= {121,254,565,558,757,957,145};
		        int key = 558;
		        System.out.println(key+" is found at index: "+linearSearch(a1, key));
		    }
		
}
