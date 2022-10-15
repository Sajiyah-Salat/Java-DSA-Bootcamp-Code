package com.kunal;


class Solution {
    public static void main(String[] args) {
        System.out.println(romanToInt("I"));

}
    public static int romanToInt(String s) {
        char[] ch = new char[s.length()];
        for(int i = 0 ; i < s.length() ; i++)
        {
            ch[i] = s.charAt(i);
        }
        int[] numarr = new int[s.length()];
        for(int i = 0 ; i < s.length() ; i++)
        {
            switch (ch[i]){
                case 'I': numarr[i] = 1; break;
                case 'V': numarr[i] = 5; break;
                case 'X': numarr[i] = 10; break;
                case 'L': numarr[i] = 50; break;
                case 'C': numarr[i] = 100; break;
                case 'D': numarr[i] = 500; break;
                case 'M': numarr[i] = 1000; break;
            }
        }
        int sum = numarr[s.length()-1];
        for(int i = s.length()-1 ; i > 0 ; i--){
            if(numarr[i] > numarr[i-1] ){
                sum = sum - numarr[i-1];
            }
            else{
                sum = sum + numarr[i-1];
            }
        }
        return sum;
    }

}
