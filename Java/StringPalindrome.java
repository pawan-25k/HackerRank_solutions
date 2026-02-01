import java.util.*;
public class StringPalindrome{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         StringBuilder sb = new StringBuilder();
        for(int i=A.length()-1;i>=0;i--){
            sb.append(A.charAt(i));
            
        }
        if(A.equals(sb.toString())){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}

