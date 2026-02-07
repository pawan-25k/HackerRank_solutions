class reverseArray {
    public void reverseArray(int arr[]) {
       
        int n=arr.length;
        int temp=-1;
        for(int i=0;i<n/2;i++){
            temp=arr[n-1-i];
            arr[n-1-i]=arr[i];
            arr[i]=temp;
            
        }
       
    }
}
