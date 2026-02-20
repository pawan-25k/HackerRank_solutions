import java.util.*;
 public class WaveArray{
    public static void main(String args[])  {
        // code here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of a Array:");
        int n=sc.nextInt();
        System.out.println("Enter the values of the array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=1,temp=0;
        if(arr[0]==arr[n-1]){
           
        }else{
              for(int i=0;j<n;i+=2){
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                  j=j+2;
              }
        
        }
        System.out.println(Arrays.toString(arr));
       
    }
}
