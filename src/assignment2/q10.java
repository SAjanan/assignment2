package assignment2;

public class q10 {
	public static void main (String args[]){
			String[] a={"ayan","ayanc","Ajanan","Ajancika","selvanayagam"};

			System.out.println("Original order words are :");
			for(int i=0; i<a.length; i++){
				System.out.println(a[i]);
			}

			int k=0;
			int n=1;
			while(n<=a.length){
				for(int j=0; j<a.length-1; j++){
					if(a[j].charAt(k)>a[j+1].charAt(k)){
						String temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
				n++;
			}

			System.out.println();
			System.out.println("Dictionary order of words are :");
			for(int i=0; i<a.length; i++){
				System.out.println(a[i]);
			}

			System.out.println();
			System.out.println("-----Using compareTo function-----");
			int m=1;
	      	while(m<=a.length) {
	         	for (int i=0; i<a.length-1; i++) {
	            	if (a[i].compareTo(a[i+1]) > 0) {
	               		String temp = a[i];
	               		a[i] = a[i+1];
	               		a[i+1] = temp;
	            	}
	         	}
	         	m++;
	      	}

			System.out.println();
			System.out.println("Dictionary order of words are :");
			for(int i=0; i<a.length; i++){
				System.out.println(a[i]);
			}

		}
	}

