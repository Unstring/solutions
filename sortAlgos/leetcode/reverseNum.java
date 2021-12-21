package leetcode;

import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        scn.close();

        int cnum = num;
        int rnum = 0;
        while(cnum > rnum){
            rnum = rnum * 10 + cnum / 10;
            cnum /= 10;
        }

        System.out.println(rnum);
    }
}
