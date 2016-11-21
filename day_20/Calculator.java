ass Calculator implements AdvancedArithmetic {
    
    public int divisorSum(int n) {
        if (n >= 1 && n <= 1000) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                // If n is divisible by i then add to sum
                if (n % i == 0) {
                    sum += i;
                }
            }
          return sum;  
        }
        return 0;
    }
}

