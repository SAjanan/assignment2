package assignment2;
import java.util.*;

class q22{
    static int[] votes = {0,0,0,0,0,0};
    static String[] allIdes = {"a", "b", "c", "d", "e", "f", "g", "h","i"};
    static int len = allIdes.length;
    static String[] votedIdes = new String[len];
   
    static void result(){
        System.out.println("candidate 1 : "+ votes[0]);
        System.out.println("candidate 2 : "+ votes[1]);
        System.out.println("candidate 3 : "+ votes[2]);
        System.out.println("candidate 4 : "+ votes[3]);
        System.out.println("candidate 5 : "+ votes[4]);
        System.out.println("candidate 5 : "+ votes[5]);
        System.out.println("candidate 5 : "+ votes[6]);
        System.out.println("candidate 5 : "+ votes[7]);
        System.out.println("candidate 5 : "+ votes[8]);
        
    }
    static int count = 0;
    static boolean check(String id){
        for (int i = 0; i < len; i++) {
            if(id.equals(allIdes[i])){
                for (int j = 0; j < len; j++) {
                    if(id.equals(votedIdes[j])) return false;                
                }
                votedIdes[count++]= id;
                return true;
            }
        }
        return false;
    }


static class Voters{
    String id ;
    Voters(String id){
        this.id = id;
    }
    
    
    void vote(int num){       
        
        switch(num){
            case 1: 
                q22.votes[0] += 1;
                break;
            case 2: 
                q22.votes[1] += 1;
                break;
            case 3: 
                q22.votes[2] += 1;
                break;
            case 4: 
                q22.votes[3] += 1;
                break;
            case 5: 
                q22.votes[4] += 1;
                break;
            case 6: 
                q22.votes[5] += 1;
                break;
            case 7: 
                q22.votes[6] += 1;
                break;
            case 8: 
                q22.votes[7] += 1;
                break;
            default:
                q22.votes[8] += 1;
                break;
        }   
    }

} 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println( "are you going to vote press y ");
        String c = sc.next();
        if(!c.equals("y")) break;
            System.out.print( "Enter your Election ID : ");
            String id1 = sc.next();
            if(q22.check(id1)){
                Voters v1 = new Voters(id1);
                System.out.println("enter your candidate number :");
                v1.vote(sc.nextInt());
            }else{
                System.out.println("Check your Election ID :" + allIdes[Integer.parseInt(id1)-1]);
            }
        }
        sc.close();
        q22.result();
    }
}

   
