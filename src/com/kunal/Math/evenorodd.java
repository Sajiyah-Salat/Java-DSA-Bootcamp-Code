package com.kunal.Math;

public class evenorodd {
    public static void main(String[] args) {
int a = 3;
int b =9;
int ans = xor(b) ^ xor(a- 1);
        System.out.println(ans);
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
//        int base = 3;
//        int power = 9;
//        int ans = 1;
//        while(power > 0){
//            if((power & 1) == 1){
//                ans *= base;
//            }
//            base *= base;
//          power =  power << 1;
//        }
//        System.out.println(ans);
//        int n = 16;
//        boolean ans = (n & (n-1)) == 0;
//        System.out.println(ans);
//        int n = 10;
//        int b   = 2;
//        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
//        System.out.println(ans);
//        int n = 5;
//int ans = 0;
//int base = 5;
//while(n>0){
//    int last = n & 1;
//    n = n >> 1;
//    ans += last * base;
//    base = base * 5;
//}
//        System.out.println(ans);
    }
    static int xor (int a){
        if(a%4 == 0){
            return a;
        }
        if(a%4 == 1){
            return 1;
        }
        if (a%4 == 2){
            return a+1;
        }
        return 0;
    }

}
