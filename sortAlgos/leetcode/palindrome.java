package leetcode;

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean res = isPalindrome(n);
        System.out.println(res);
    }
    public static boolean isPalindrome(int x) {
        if(x < 0 || (x%10 == 0 && x != 0)){
            return false;
        }
        
        int rn = 0;
        while(x > rn){
            rn = rn * 10 + x % 10;
            x /= 10;
        }
        
        return x == rn/10 || x == rn;
    }
}