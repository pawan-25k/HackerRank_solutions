import java.util.*;

class reverseString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String s =sc.nextLine();
        System.out.println("Length of the String is:"+s.length());
         StringBuilder ans=new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            ans.append(s.charAt(i));
        }
        System.out.println("Reverse of the Sting is:"+ans.toString());
    }
}
