package assignment2;

public class q16 {
	  
	    public static int binarySearch(int arr[], int first, int last, int key){ 
	    	
	    	
	        if (last>=first){  
	            int mid = first + (last - first)/2;  
	            if (arr[mid] == key){  
	            return mid;  
	            }  
	            if (arr[mid] > key){  
	            return binarySearch(arr, first, mid-1, key);  
	            }else{  
	            return binarySearch(arr, mid+1, last, key);
	            }  
	        }  
	        return -1;  
	    }  
	    public static void main(String args[]){  
	        int arr[] = {113,224,345,312,545,412};  
	        int key =345;  
	        int last=arr.length-1;  
	        int result = binarySearch(arr,0,last,key);  
	        
	        System.out.println("------part-1--------");
	        
	        if (result == -1)  
	            System.out.println("Element is not found!");  
	        else  
	            System.out.println("Element is found at index: "+result);  
	    
	    	}
	
}
