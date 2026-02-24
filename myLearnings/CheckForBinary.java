import java.util.*;
class CheckForBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        String str=sc.nextLine();
        boolean ans=false;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='1' || ch=='0'){
                ans=true;
            }else{
                ans=false;
                break;
            }
        }
        System.out.println(ans);
    }
}
