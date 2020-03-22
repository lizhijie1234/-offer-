public class Fibonacci {
    public int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        int n0 = 0;
        int n1 = 1;
        for(int i = 2; i <= n; i++){
            int temp = n1;
            n1 = n1 + n0;
            n0 = temp;
        }
        return n1;
    }
    public int fibonacciWithDP(int n){
        if(n <=1){
            return n;
        }
        int[] fib = new int[n + 1];
        fib[1] = 1;
        for(int i =2; i <= n; i++){
            fib[i] = fib[i -1] + fib[i-2];
        }
        return fib[n];
    }
}
