 public static void miniMaxSum(List<Integer> arr) {
        long totalSum = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int number : arr) {
            long currentVal = (long) number; 
            
            totalSum += currentVal;
            
            if (currentVal < min) {
                min = currentVal;
            }
            
            if (currentVal > max) {
                max = currentVal;
            }
        }
        long minSum = totalSum - max;
        long maxSum = totalSum - min;
        System.out.println(minSum + " " + maxSum);
    }
