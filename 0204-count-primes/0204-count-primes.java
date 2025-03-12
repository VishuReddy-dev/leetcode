class Solution {
    // public boolean isprime(int n){
    //     if(n<=1){
    //         return false;
    //     }
    //     if(n==2 || n==3){
    //         return true;
    //     }
    //     if(n%2==0 || n%3==0){
    //         return false;
    //     }
    //     for(int i=5;i*i<=n;i+=6){
    //         if(n%i==0 || n%(i+2)==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public int countPrimes(int n) {
        // int count=0;
        // for(int i=2;i<n;i++){
        //     if(isprime(i)){
        //         count++;
        //     }
        // }
        // return count;
        if (n <= 2) return 0; // No prime numbers < 2

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true); // Assume all numbers are prime

        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false; // Mark multiples as non-prime
                }
            }
        }

        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) count++;
        }
        return count;
 
    }
}