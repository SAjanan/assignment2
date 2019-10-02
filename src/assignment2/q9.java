package assignment2;

public class q9 { 
	    public static void main(String[] args) {  
	        String x = "S   R  I  L   A  N   K  A";  
	        //1st Way using build method
	        String withoutsp = x.replaceAll("\\s", "");  
	        System.out.println(withoutsp);  
	        //2nd way  
	        char[] xArray = x.toCharArray();  
	        StringBuffer stringBuffer = new StringBuffer();  
	        for (int i = 0; i < xArray.length; i++) {  
	            if ((xArray[i] != ' ') && (xArray[i] != '\t')) {  
	                stringBuffer.append(xArray[i]);  
	            }  
	        }  
	        String withoutsp1 = stringBuffer.toString();  
	        System.out.println(withoutsp1);  
	    }  
	}  
