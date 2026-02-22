import java.util.*;

class mergeArrayWithNoExtraSpace{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of 2 arrays:");
         
        int n = sc.nextInt();
        int m =sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        System.out.print("Enter the values of 1st array in ascending order:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the values of 2nd array in ascending order:");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            // If current element of a[] is greater than smallest of b[]
            if (a[i] > b[0]) {

                // Swap
                int temp = a[i];
                a[i] = b[0];
                b[0] = temp;

                // Place swapped element to correct position in b[]
                int first = b[0];
                int k;

                for (k = 1; k < m && b[k] < first; k++) {
                    b[k - 1] = b[k];
                }
                b[k - 1] = first;
            }
        }
        System.out.println("sorted is");
         System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
