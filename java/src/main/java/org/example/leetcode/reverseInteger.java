package org.example.leetcode;

public class reverseInteger {

    public static void main(String[] args) {
        int result = reverse3(-345);
        System.out.println("Result: " + result);
    }

    // 2ms
    public static int reverse1(int x) {
        long finaNum = 0;
        while(x!=0){
            int lastDigit = x%10;
            finaNum += lastDigit;
            finaNum = finaNum * 10;
            x = x/10;
        }
        finaNum = finaNum / 10;
        System.out.println(finaNum);
        if(finaNum > Integer.MAX_VALUE || finaNum < Integer.MIN_VALUE){
            return 0;
        }
        if (x < 0) {
            return (int) (-1*finaNum);
        }
        return (int)finaNum;
    }

    // 1ms
    public static int reverse2(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) { return 0; }
            result = newResult;
            x = x / 10;
        }
        return result;
    }

    // 1.5ms
    public static int reverse3(int x) {
        long rev = 0;
        while (x != 0) {
            int tail = x % 10;
            rev = tail + rev * 10;
            x = x / 10;
        }
        if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        if(x < 0){
            return (int)(-1*rev);
        }
        return (int)rev;
    }
}
