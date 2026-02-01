ublic class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        //System.out.println(S.substring(start,end));
        StringBuilder SubStr=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(i>=start && i<end){
            SubStr.append(S.charAt(i));
            }
        }
        System.out.println(SubStr);
    }
}
