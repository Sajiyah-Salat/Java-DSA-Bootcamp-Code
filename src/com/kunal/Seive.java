package com.kunal;

public class Seive {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
//        int n = 40;
//        int p  = 2;
//        System.out.printf("%.3f",sqrt(n,p));
////        int n  = 40;
//        boolean[] primes = new boolean[n + 1];
//        sieve(n,primes);
    }

    private static double sqrt(double  n) {
        double x = n;
        double root;
        while (true){
            root  = 0.5 * (x + (n/x));
            if(Math.abs(root - x) < 0.5){
                break;
            }
            x = root;
        }
        return root;
    }
//
//      static double sqrt(int n, int p) {
//        int s = 0;
//        int e = n;
//        double root = 0.0;
//        while (s<= e){
//            int m = s + (e - s) / 2;
//            if(m*m == n){
//                return m;
//            }
//            if(m * m > n){
//              e = m - 1;
//            }
//            else{
//               s = m + 1 ;
//               root = m;
//            }
//        }
//
//        double incr = 0.1;
//          for (int i = 0; i < p ; i++) {
//              while (root * root <= n){
//                  root += incr;
//              }
//              root -= incr;
//              root /= 10;
//          }
//           return root;

   // }
//
//    private static void sieve(int n, boolean[] primes) {
//        for (int i = 2; i*i <= n ; i++) {
//if(!primes[i]){
//    for (int j = i*2; j <= n ; j+= i) {
//        primes[j] = true;
//    }
//}
//        }
//        for(int i = 2;i<=n;i++) {
//            if(!primes[i]){
//                System.out.print(i + " ");
//            }
//        }
    }



