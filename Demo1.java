import java.util.*;
public class Demo1 {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner (System.in);
    String str=sc.nextLine();
   int count=0;
    for (int i=(str.length()-1);i>=0;i--){
        if(str.charAt(i)==' '){
            if(count>0)
            break;
        }
        else {
            count++;

        }
    }
    System.out.println(count);

    }
}