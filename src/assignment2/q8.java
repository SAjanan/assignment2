package assignment2;

public class q8{
        
  
    static String s = "apple,orange,strawberry,banana,ayanan,ayanc,Ajanan";
    static int length = s.length();
    static String[] arr = new String[10];  
    static int count = -1;  
    static int l = 0; 
    static boolean finish = false;
    public static void separate(int j){
        String word = " ";
        
        for(int i = j+1; i<length; i++){
            if(s.charAt(i) != ','){
                word += s.charAt(i);
            }else{
                l = i;
                count++;
                break;
            }  
            if(i == length -1){
                finish = true;
            }  

        }
        arr[count] = word;
        word = "";
        while(!finish){
            separate(l);
        }
        
    }


    public static void main(String[] args) {
        separate(-1);
        for(int i = 0; i<count+1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(" -----------------------------------------------------");
       
    


    
        String[] word = s.split(",");     
        for (String var : word) {
            System.out.print(var+"  ");
        
        }
        }
}